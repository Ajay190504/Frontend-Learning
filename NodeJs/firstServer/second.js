// Creating second server using express framework

// Importing express module
const express = require('express');

//creating server
const app = express();

//port no
const port = 5000;

//listening starts on this
app.listen(port,()=>{
   console.log(`Server Listning on address: http://localhost:${port}`);
});

app.get('/',(req,res)=>{
   // console.log(req);
   res.send("Hello Ajay");
});
app.get('/ajay',(req,res)=>{
   // console.log(req);
   res.send("Hello Ajay, This is get request");
});

