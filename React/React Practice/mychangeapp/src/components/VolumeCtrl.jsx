import React, { useState } from 'react'

const VolumeCtrl = () => {
   let [volume, setVolume] = useState(50);

  return (

   <center>
      <div>
         <h1>Volume Controller Task</h1>

         <button onClick={()=>{
            setVolume(volume+10)
         }}>Increase by 10</button>

         <br />
         <br />

         <button onClick={()=>{
            setVolume(volume-10)
         }}>Decrease by 10</button>

         <br />
         <br />

         <button onClick={()=>{
            setVolume(0)
         }}>Mute</button>

         <br />
         <br />

         <h2>Volume: {volume}</h2>
      </div>
   </center>
  )
}

export default VolumeCtrl
