const form = document.querySelector('form');

form.addEventListener('submit',(e)=>{
    
    e.preventDefault();
    const income = document.querySelector("#income");
    const amount = parseInt(income.value);
    
    const result = document.querySelector('h2');
    let totalTax = 0;
    if(amount<=120000)
        totalTax=0;
    else if(amount<=160000){
        totalTax= (amount-120000)*0.15;
    }
    else if(amount<=200000){
        totalTax= (amount-160000)*0.20 + 6000;
    }
    else if(amount<=240000){
        totalTax= (amount-200000)*0.25 + 6000+ 8000;
    }
    else{
        totalTax = (amount-240000)*0.30 + 6000+ 8000+ 10000;
    }
    

    result.textContent = `Total Tax: ${totalTax}`;
    form.reset();

})