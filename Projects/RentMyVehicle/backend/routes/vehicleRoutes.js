
import express from "express";
import multer from "multer";
import Vehicle from "../models/Vehicle.js";

const router=express.Router();
const upload=multer({dest:"uploads/"});

router.post("/add", upload.single("image"), async(req,res)=>{
 const vehicle=await Vehicle.create({...req.body,image:req.file.filename});
 res.json(vehicle);
});

router.get("/", async(req,res)=>{
 const data=await Vehicle.find();
 res.json(data);
});

export default router;
