'use strict'

var demoApp = angular.module('chores', [ 'ui.bootstrap', 'user.controller',
        'user.service' ]);
demoApp.constant("CONSTANTS", {
    userResource : "/user/",
});
