//creating server using http

// Importing http module
const http = require('http');

//creating server
const server = http.createServer((req,res)=>{
   console.log(req);
   res.end("Hello Ajay");
})

//port no 
const port = 5000;

//listening starts on this
server.listen(port,()=>{
   console.log(`Server Listning on address: http://localhost:${port}`);
});

