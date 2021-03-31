let p = Promise.resolve(
    Math.floor(Math.random() * 10)
)

let q = Promise.resolve(
    Math.floor(Math.random() * 10)
)

Promise.all([p,q]).then(values => {
    
    console.log(`The generated values : ${values}`);
    
    console.log(`Sum : ${values[0] + values[1]}`);
}).catch((message)=>{
    console.log(`Error while processing...`);
})