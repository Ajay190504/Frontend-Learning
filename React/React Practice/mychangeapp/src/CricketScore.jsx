import React, { useState } from 'react'

const CricketScore = () => {
   let [score, setScore] = useState(0);
   let [balls, setBalls] = useState(0);

   
  return (
    <center>
      <div>
         <h1>Cricket Score Task</h1>

          <button onClick={()=>{
            setScore(score+1)
            setBalls(balls+1)
         }}> +1 Runs</button>

         <br />
         <br /> 
         
         <button onClick={()=>{
            setScore(score+2)
            setBalls(balls+1)
         }}> +2 Runs</button>

         <br />
         <br /> 
         
         <button onClick={()=>{
            setScore(score+3)
            setBalls(balls+1)
         }}> +3 Runs</button>

         <br />
         <br />

         <button onClick={()=>{
            setScore(score+4)
            setBalls(balls+1)
         }}> +4 Runs</button>

         <br />
         <br />

         <button onClick={()=>{
            setScore(score+5)
            setBalls(balls+1)
         }}> +5 Runs</button>

         <br />
         <br />

         <button onClick={()=>{
            setScore(score+6)
            setBalls(balls+1)
         }}> +6 Runs</button>

         <br />
         <br />

         <button onClick={()=>{
            setScore(score+7)
            setBalls(balls+1)
         }}> +7 Runs</button>

         <br />
         <br />

         <button onClick={()=>{
            setScore(0)
            setBalls(0)
         }}> Reset</button>

         <h2>Score: {score}</h2>
         <h2>Balls: {balls}</h2>
      </div>
    </center>
  )
}

export default CricketScore
