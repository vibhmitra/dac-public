const { readFile, readFileSync } = require('fs');

// Blocking Code
const txt = readFileSync('./hello.txt', 'utf-8');

console.log(txt);

console.log('do this ASAP');    // this console log won't run utill the file system has been read



// Non Blocking Code
readFile('./hello.txt', 'utf8', (err, txt) => {
    console.log(txt);           
})

console.log("Non Blocking Example"); // this will be executed while file is getting read.