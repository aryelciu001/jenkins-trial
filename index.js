let ex = require('express');
let app = ex();

app.get('/', (req, res)=>{
  res.send('helldwqo world');
});

app.listen(3000, ()=>{
  console.log('listening to port 3000');
});