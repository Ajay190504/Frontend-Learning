import React, { useState } from 'react'

const MiniIDCard = () => {

   let [name, setName] = useState("");
   let [city, setCity] = useState("");
   let [age, setAge] = useState("");

   return (
      <center>
         <div>
            <h1>Mini ID Card</h1>

            <h2>Enter Name:</h2>
            <input
               type="text"
               onChange={(e) => {
                  setName(e.target.value);
               }}
            />

            <br />
            <br />

            <h2>Enter City:</h2>
            <input
               type="text"
               onChange={(e) => {
                  setCity(e.target.value);
               }}
            />

            <br />
            <br />

            <h2>Enter Age:</h2>
            <input
               type="number"
               onChange={(e) => {
                  setAge(e.target.value);
               }}
            />

            <br />
            <br />

            <h2>Student ID Card</h2>

            <h3>Name: {name}</h3>
            <h3>City: {city}</h3>
            <h3>Age: {age}</h3>

         </div>
      </center>
   )
}

export default MiniIDCard