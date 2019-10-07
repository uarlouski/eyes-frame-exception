const http = require('http')
const fs = require('fs')

http.createServer((req, res) => {
  fs.readFile(__dirname + '/index.html', (err, data) => {
    if (err) {
        throw err;
    }
    res.writeHeader(200, {
      'Content-Type': 'text/html'
    })
    res.write(data)
    res.end()
  })
}).listen(9999);
