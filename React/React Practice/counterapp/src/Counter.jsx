import React from 'react';
import { useState } from 'react';

const Counter = () => {

   let [count, setCount] = useState(0);
   let conCount = 0;

   function increaseCount() {
      conCount=conCount+1;
      setCount(count + 1);

      console.log("Concrete Count:", conCount);
      console.log("State Count:", count);
   }

   function decreaseCount() {
      if (count <= 0) {
         alert("Count cannot be less than 0");
      } else {
         conCount=conCount-1;
         setCount(count - 1);

         console.log("Concrete Count:", conCount);
         console.log("State Count:", count);
      }
   }

   function resetCount() {
      conCount = 0;
      setCount(0);

      console.log("Concrete Count:", conCount);
      console.log("State Count:", count);
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
   );
};

export default Counter;