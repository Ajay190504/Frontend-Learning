import React, { useState } from 'react'

const Counter = () => {
   let [count, setCount] = useState(0)
  return (
    <center>
      <div>
         <h1>Counter Task</h1>

         <button onClick={()=>{
            setCount(count+1)
         }}> Increase</button>

         <br />
         <br />

          <button onClick={()=>{
            if(count<=0){
               alert("Count cannot be negative")
            }
            else{
               setCount(count-1)
            }
            
         }}> Decrease</button>

         <br />
         <br />

         <button onClick={()=>{
            setCount(0)
         }}> Reset</button>

         <br />
         <br />



         <h2>Count: {count}</h2>

      </div>
    </center>
  )
}

export default Counter
