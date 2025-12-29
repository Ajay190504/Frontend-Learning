
import mongoose from "mongoose";
export default mongoose.model("Vehicle", new mongoose.Schema({
 name:String,
 type:String,
 price:Number,
 image:String,
 location:String
},{timestamps:true}));
