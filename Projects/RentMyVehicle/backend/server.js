
import express from "express";
import mongoose from "mongoose";
import cors from "cors";
import vehicleRoutes from "./routes/vehicleRoutes.js";

const app=express();
app.use(cors());
app.use(express.json());
app.use("/uploads",express.static("uploads"));

mongoose.connect("mongodb://127.0.0.1:27017/rentmyvehicle")
.then(()=>console.log("Mongo connected"));

app.use("/api/vehicles",vehicleRoutes);
app.listen(5000,()=>console.log("Server running 5000"));
