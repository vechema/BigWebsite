'use strict'

var choresApp = angular.module('chores', [ 'ui.bootstrap', 'user.controller',
        'user.service' ]);
choresApp.constant("CONSTANTS", {
    userResource : "/user/",
});
