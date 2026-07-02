import React, { useState } from 'react'

const Sum = () => {
   let [num1, setNum1] = useState(0);
   let [num2, setNum2] = useState(0);
   let [sum, setSum] = useState(0);

  return (
   <center>
    <div>
      <h1>Sum of two numbers</h1>
      <h2>Enter num1: </h2>
      <input type="number" onChange={(e)=> setNum1(e.target.value)}></input>

      <br />
      <h2>Enter num2: </h2>
      <input type="number" onChange={(e)=> setNum2(e.target.value)}></input>
      <br />
      <br />
      <button onClick={()=> setSum(Number(num1) + Number(num2))}>
      Calculate Sum</button>
      <h2>Sum is: {sum}</h2>


    </div>
    </center>
  )
}

export default Sum
