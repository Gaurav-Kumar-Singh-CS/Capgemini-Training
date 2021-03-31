//import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet'
import Welcome from './components/Welcome'
import Hello from './components/Hello'
import Message from './components/Message'
import Counter from './components/Counter'
import FunctionClick from './components/FunctionClick';
import ClassClick from './components/ClassClick';
import EventBind from './components/EventBind';
import ParentComponent from './components/ParentComponent';
import UserGreeting from './components/UserGreeting';
function App() {
  return (
    <div className="App">
      <UserGreeting></UserGreeting>
      <ParentComponent></ParentComponent>
      <EventBind></EventBind>
      <FunctionClick></FunctionClick>
      <ClassClick></ClassClick>
      <Message></Message>
      <Greet name="Xander" heroName="Xan"><p>Chip makes best hot cross buns.</p></Greet>
      <Welcome name="Chip"></Welcome>
      <Hello></Hello>
      <Hello></Hello>
      <Counter></Counter>
    </div>
  )
}

export default App;
