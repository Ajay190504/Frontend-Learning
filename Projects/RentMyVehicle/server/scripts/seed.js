const mongoose = require('mongoose');
const dotenv = require('dotenv');
const Vehicle = require('../src/models/Vehicle');

dotenv.config();
const MONGODB_URI = process.env.MONGODB_URI || 'mongodb://localhost:27017/rentmyvehicle';

const sampleVehicles = [
  {
    name: 'Toyota Innova Crysta',
    category: 'Taxi',
    location: 'Mumbai, Maharashtra',
    hourlyRate: 150,
    dailyRate: 2500,
    images: ['https://images.unsplash.com/photo-1549317661-bd32c8ce0db2?w=800']
  },
  {
    name: 'Honda City',
    category: 'Taxi',
    location: 'Delhi, NCR',
    hourlyRate: 100,
    dailyRate: 1500,
    images: ['https://images.unsplash.com/photo-1583121274602-3e2820c69888?w=800']
  }
];

const bcrypt = require('bcryptjs');
const User = require('../src/models/User');

async function run() {
  await mongoose.connect(MONGODB_URI, { useNewUrlParser: true, useUnifiedTopology: true });
  console.log('Connected to MongoDB');
  await Vehicle.deleteMany({});
  await Vehicle.insertMany(sampleVehicles);
  console.log('Seeded vehicles');

  // Create a sample owner user
  const existing = await User.findOne({ email: 'owner@example.com' });
  if (!existing) {
    const passwordHash = await bcrypt.hash('password', 10);
    await User.create({ name: 'Sample Owner', email: 'owner@example.com', passwordHash, role: 'owner' });
    console.log('Created sample owner user: owner@example.com / password');
  }

  process.exit(0);
}

run().catch(err => {
  console.error(err);
  process.exit(1);
});