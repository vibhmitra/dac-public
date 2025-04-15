const logger = require('./logger'); // here we are using const because we do not wanna accidentaly override

const { myLogger } = require('./logger');   // same same but different

console.log(logger);

logger.myLogger('Look Mom! 🤗, I am using Modules Now!');

myLogger('Yay! Now I am Printing myself without making objects');