const os = require('os');

var totalMemory = os.totalmem();
var freeMemory = os.freemem();

console.log("Total Memory: " + totalMemory);

// template string
// ES6 / ES2015 : ECMAScript 6
console.log(`Total Memory : ${totalMemory}`);
console.log(`Free Memory : ${freeMemory}`);

console.log(`Platform : ${os.platform()}`);
console.log(`Architecture : ${os.arch}`);
console.log(`homedir : ${os.homedir}`);
console.log(`type : ${os.type}`);
console.log(`machine : ${os.machine}`);
console.log(`Version : ${os.version}`);