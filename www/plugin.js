
cordova.define("my-cordova-plugin.plugin", function(require, exports, module) {

  var exec = require('cordova/exec');
  
  var PLUGIN_NAME = 'MyCordovaPlugin';
  
  var MyCordovaPlugin = {
    echo: function(phrase, cb) {
      exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
    },
    getDate: function(cb) {
      exec(cb, null, PLUGIN_NAME, 'getDate', []);
    },
    displayAlert: function (phrase, cb) {
      exec(cb, null, PLUGIN_NAME, "displayAlert", [phrase]);
    }
  };
  
  module.exports = MyCordovaPlugin;
  
  });
  