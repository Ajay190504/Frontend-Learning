import React, { useState } from 'react'

const MoodChanger = () => {

   let [mood, setMood] = useState("🙂");

   return (

      <center>
         <div>
            <h1>Mood Changer</h1>

            <button onClick={() => {
               setMood("😄");
            }}>
               Happy
            </button>

            <br />
            <br />

            <button onClick={() => {
               setMood("😢");
            }}>
               Sad
            </button>

            <br />
            <br />

            <button onClick={() => {
               setMood("😠");
            }}>
               Angry
            </button>

            <br />
            <br />

            <button onClick={() => {
               setMood("😍");
            }}>
               Love
            </button>

            <br />
            <br />

            <h2>Mood: {mood}</h2>

         </div>
      </center>

   )
}

export default MoodChanger