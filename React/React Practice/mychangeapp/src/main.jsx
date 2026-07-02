import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'

import App from './App.jsx'
import Sum from './components/Sum.jsx'
import StudentProf from './components/StudentProf.jsx'
import LiveCharCounter from './components/LiveCharCounter.jsx'
import FavColorPrev from './components/FavColorPrev.jsx'
import Counter from './components/Counter.jsx'
import CricketScore from './components/CricketScore.jsx'
import VolumeCtrl from './components/VolumeCtrl.jsx'
import MoodChanger from './components/MoodChanger.jsx'
import PasswordLengthChecker from './components/PasswordLengthChecker.jsx'
import MiniIDCard from './components/MiniIDCard.jsx'

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