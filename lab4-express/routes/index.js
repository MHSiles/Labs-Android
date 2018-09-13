var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  var context = {};
  context.title = "Lab 4";
  res.render('index', context);
});

module.exports = router;
