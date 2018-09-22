'use strict'

angular.module('user.service', []).factory('UserService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
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
			return service;
		} ]);