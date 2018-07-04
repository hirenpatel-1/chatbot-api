const Bottr = require('bottr')
const BottrApp = require('bottr-app')
const request = require('request');
const bot = new Bottr.Bot();
var fs = require('fs');
var path = require('path');
var sessiontest;
bot.on('message_received', function(message, session) {
    sessiontest = session;
    var propertiesObject = { content: message.text };
    console.log(propertiesObject);
    var options = {
        url: 'http://localhost:8080/chatbot/bot',
        qs: propertiesObject
    };
    request.get(options, function(err, response, body) {
        if (err) { console.log(err); return; }
        var jsonData = JSON.parse(body);
        sessiontest.send(jsonData.value);
    });
})
bot.use(new BottrApp())
bot.listen()
