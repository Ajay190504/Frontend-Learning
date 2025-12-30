const express = require('express');
const Vehicle = require('../models/Vehicle');
const multer = require('multer');
const path = require('path');

const router = express.Router();

// Multer setup
const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, path.join(process.cwd(), 'imagefolder'));
  },
  filename: function (req, file, cb) {
    const ext = path.extname(file.originalname);
    cb(null, Date.now() + '-' + Math.round(Math.random() * 1E9) + ext);
  }
});
const upload = multer({ storage });

// GET /api/vehicles
router.get('/', async (req, res) => {
  try {
    const vehicles = await Vehicle.find().sort({ createdAt: -1 }).populate('owner', 'name email');
    res.json(vehicles);
  } catch (err) {
    res.status(500).json({ error: 'Server error' });
  }
});

// GET /api/vehicles/:id
router.get('/:id', async (req, res) => {
  try {
    const vehicle = await Vehicle.findById(req.params.id).populate('owner', 'name email');
    if (!vehicle) return res.status(404).json({ error: 'Not found' });
    res.json(vehicle);
  } catch (err) {
    res.status(500).json({ error: 'Server error' });
  }
});

// POST /api/vehicles - requires auth, multipart form, can include images (field name 'images')
const auth = require('../middleware/auth');
router.post('/', auth, upload.array('images', 6), async (req, res) => {
  try {
    const { name, category, location, hourlyRate, dailyRate, description } = req.body;
    const images = (req.files || []).map(f => `/images/${f.filename}`);

    if (!name || !hourlyRate) return res.status(400).json({ error: 'Missing required fields' });

    const vehicle = new Vehicle({
      name,
      category,
      location,
      hourlyRate: Number(hourlyRate),
      dailyRate: dailyRate ? Number(dailyRate) : undefined,
      images,
      description,
      owner: req.user._id
    });

    await vehicle.save();
    res.status(201).json(vehicle);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Server error' });
  }
});

module.exports = router;
