import {Routes , Route} from 'react-router-dom';
import Home from "../pages/home/Home.jsx";
import Servicos from '../pages/servicos/Servicos.jsx';

function RoutesApp() {
  return (
    <Routes>
      <Route path='/' element={<Home />} />
      <Route path='/servicos' element={<Servicos />}/>
    </Routes>
  );
}
export default RoutesApp;