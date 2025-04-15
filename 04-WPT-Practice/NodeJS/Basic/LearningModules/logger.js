console.log(__filename);
console.log(__dirname);


var url = 'http://mylogger.io/log';

function log(message) {
    // Send http request
    console.log(message);
}

module.exports.myLogger = log; // log method is getting exported
// module.exports = log;   // without creating objects | THIS IS RECOMMENDED WHEN WE ONLY HAVE SINGLE FUN

// module.exports.endPoint = url; // if you want to export url variable outside this module