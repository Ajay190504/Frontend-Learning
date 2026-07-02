import React, { useState } from 'react'

const LiveCharCounter = () => {
   let [text, setText] = useState("");
   let [count, setCount] = useState(0);

   function countChar(emt){
      setCount(emt.target.value.length);
   }

   function handleChange(emt){
      setText(emt.target.value);
      countChar(emt);
   }
  return (
   <center>
    <div>
      <h1>Live Character Counter</h1>

      <textarea onChange= {(event)=>{
         handleChange(event);
      }}></textarea>

      <br />

      <h2>Text: {text}</h2>
      <h2>Character Count: {count}</h2>
    </div>
   </center>
  )
}

export default LiveCharCounter
