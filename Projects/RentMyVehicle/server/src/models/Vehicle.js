const mongoose = require('mongoose');

const vehicleSchema = new mongoose.Schema({
  name: { type: String, required: true },
  category: { type: String },
  location: { type: String },
  hourlyRate: { type: Number, required: true },
  dailyRate: { type: Number },
  status: { type: String, default: 'active' },
  images: [{ type: String }], // stored as /images/<filename>
  description: { type: String },
  owner: { type: mongoose.Schema.Types.ObjectId, ref: 'User' },
}, { timestamps: true });

module.exports = mongoose.model('Vehicle', vehicleSchema);
