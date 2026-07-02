import { useState } from 'react'


function App() {
  const [name, setName] = useState("")

  return (
    <>
    <center>
      <h1>Name Preview App</h1>

      <input type="text" onChange={(e)=> setName(e.target.value)}></input>

      <h2>My name is: {name}</h2>
      </center>
    </>
  )
}

export default App
