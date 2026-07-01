import React from 'react'
import { useState } from 'react'

const counter = () => {
   let [count, setCount] = useState(0);

   function increaseCount(){
      setCount(count + 1);
   }
   function decreaseCount(){
      if(count<=0){
         alert("Count cannot be less than 0");
      }
      else{
      setCount(count - 1);
      }
   }
   function resetCount(){
      setCount(0);
   }
  return (
    <div>
      <h1>Welcome To Counter App</h1>
      <button onClick={increaseCount}>
         Increase
      </button>
      <br />
      <br />
      <button onClick={decreaseCount}>
         Decrease
      </button>
      <br />
      <br />
      <button onClick={resetCount}>
         Reset
      </button>
      <br />
      <br />
      <h2>Count: {count}</h2>
    </div>
  )
}

export default counter;