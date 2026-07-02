import React, { useState } from 'react';

const FavColorPrev = () => {

   let [color, setColor] = useState("");

   function applyColor(clr) {
      document.getElementById("previewBox").style.backgroundColor = clr;
   }

   return (
      <center>
         <div>
            <h1>Favourite Color Preview</h1>

            <h2>Enter your Favourite Color:</h2>

            <input
               type="text"
               onChange={(e) => setColor(e.target.value)}
            />

            <br /><br />

            <button onClick={() => applyColor(color)}>
               Apply Color
            </button>

            <br /><br />

            <div
               id="previewBox"
               style={{
                  width: "250px",
                  height: "120px",
                  border: "1px solid black",
                  lineHeight: "120px",
                  textAlign: "center",
               }}
            >
               Preview Box
            </div>

         </div>
      </center>
   );
};

export default FavColorPrev;