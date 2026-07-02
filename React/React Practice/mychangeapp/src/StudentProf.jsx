import React, { useState } from 'react'

const StudentProf = () => {
   let [name, setName] = useState("");
   let [course, setCourse] = useState("");
   function handleClick(name, course){
    document.getElementById('hid').style.display = "block";
   }

  return (
   <center>
    <div>
      <h1>Student Profile Component</h1>
      <br />

      <h2>Enter Name: </h2>
      <input type="text" onChange = {(e)=> {setName(e.target.value)} } />
      <h2>Your Name: {name}</h2>

      <br />

      <h2>Enter Course: </h2>
      <input type="text" onChange = {(e)=> {setCourse(e.target.value)} } />
      <h2>Your Course: {course}</h2>


      <button onClick={()=>{
        handleClick(name, course);
      }}>Visible</button>

      <h2 id='hid' style={{display:"none"}}>Name : {name} <br />
      Course : {course}</h2>
    </div>
    </center>
  )
}

export default StudentProf
