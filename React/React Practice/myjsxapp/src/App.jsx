export default function App(){

  let name = "Ajay";
  let num1=10,num2=3;
  let num = 12345;

  function countDigits(num){
    let count=0;
    while(num>0){
      num=Math.floor(num/10);
      count++;
    }
    return count;
  }

  let digits = countDigits(num);

  return (
    <div>
      <h1>Welcome... {name}</h1>
      <hr />
      <hr />
      <h2>Sum of {num1} and {num2} is {num1+num2}</h2>
      <h2>Difference of {num1} and {num2} is {num1-num2}</h2>
      <h2>Product of {num1} and {num2} is {num1*num2}</h2>
      <h2>Division of {num1} and {num2} is {num1/num2}</h2>
      <hr />
      <hr />
      <h2>Count of digits in {num} is {digits}</h2>
    </div>
  )
}