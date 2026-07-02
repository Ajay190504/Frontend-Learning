import React, { useState } from 'react'

const PasswordLengthChecker = () => {

   let [password, setPassword] = useState("");

   return (
      <center>
         <div>
            <h1>Password Length Checker</h1>

            <h2>Enter Password:</h2>

            <input
               type="password"
               onChange={(e) => {
                  setPassword(e.target.value);
               }}
            />

            <br />
            <br />

            <h2>Password Length: {password.length}</h2>

         </div>
      </center>
   )
}

export default PasswordLengthChecker