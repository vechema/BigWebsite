'use strict'

angular.module('user.service', [])
    .service('UserService', [ "$http", "CONSTANTS", UserService]);


function UserService($http, CONSTANTS) {
    var service = {};
    service.getUserById = function(userId) {
        var url = CONSTANTS.userResource + userId;
        return $http.get(url);
    }
    service.getAllUsers = function() {
        return $http.get(CONSTANTS.userResource);
    }
    service.saveUser = function(userDto) {
        return $http.post(CONSTANTS.userResource, userDto);
    }
    service.deleteUser = function(deleteId) {
        var url = CONSTANTS.userResource + deleteId
        return $http.delete(url);
    }
    return service;
}
