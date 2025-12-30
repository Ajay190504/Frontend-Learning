const express = require('express');
const Booking = require('../models/Booking');
const auth = require('../middleware/auth');

const router = express.Router();

// POST /api/bookings (requires auth)
router.post('/', auth, async (req, res) => {
  try {
    const { vehicle, userName, phone, address, startDate, endDate, message } = req.body;
    if (!vehicle || !userName || !phone || !startDate) return res.status(400).json({ error: 'Missing fields' });
    const booking = new Booking({ vehicle, user: req.user._id, userName, phone, address, startDate, endDate, message });
    await booking.save();
    res.status(201).json(booking);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Server error' });
  }
});

module.exports = router;
