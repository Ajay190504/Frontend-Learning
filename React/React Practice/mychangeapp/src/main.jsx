import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import StudentProf from './StudentProf.jsx'
import LiveCharCounter from './LiveCharCounter.jsx'
import Sum from './Sum.jsx'
import FavColorPrev from './FavColorPrev.jsx'
import Counter from './Counter.jsx'
import CricketScore from './CricketScore.jsx'
import VolumeCtrl from './VolumeCtrl.jsx'
import MoodChanger from './MoodChanger.jsx'
import PasswordLengthChecker from './PasswordLengthChecker.jsx'
import MiniIDCard from './MiniIDCard.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App />
    <Sum />
    <StudentProf />
    <LiveCharCounter />
    <FavColorPrev />
    <Counter />
    <CricketScore />
    <VolumeCtrl />
    <MoodChanger />
    <PasswordLengthChecker />
    <MiniIDCard />
  </StrictMode>,
)
