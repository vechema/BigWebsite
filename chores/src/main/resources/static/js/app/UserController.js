'use strict'

var module = angular.module('user.controller', []);
module.controller("UserController", [ "$scope", "UserService",
        function($scope, UserService) {

            $scope.userDto = {
                id : null,
                name : null,
                choreDtos : []
            };
            $scope.chores = [];

            UserService.getAllUsers().then(function(value) {
                $scope.allUsers= value.data;
            }, function(reason) {
                console.log("error occurred");
            }, function(value) {
                console.log("no callback");
            });

            $scope.saveUser = function() {
                $scope.userDto.choreDtos = $scope.chores.map(chore => {
                    return {id: null, name: chore};
                });
                UserService.saveUser($scope.userDto).then(function() {
                    UserService.getAllUsers().then(function(value) {
                        $scope.allUsers= value.data;
                    }, function(reason) {
                        console.log("error occurred");
                    }, function(value) {
                        console.log("no callback");
                    });

                    $scope.chores = [];
                    $scope.userDto = {
                        id : null,
                        name : null,
                        choreDtos : []
                    };
                }, function(reason) {
                    console.log("error occurred");
                }, function(value) {
                    console.log("no callback");
                });
            }

            $scope.deleteUser = function(deleteId) {
                UserService.deleteUser(deleteId).then(function() {
                    UserService.getAllUsers().then(function(value) {
                        $scope.allUsers= value.data;
                    }, function(reason) {
                        console.log("error occurred");
                    }, function(value) {
                        console.log("no callback");
                    });

                    $scope.chores = [];
                    $scope.userDto = {
                        id : null,
                        name : null,
                        choreDtos : []
                    };
                }, function(reason) {
                    console.log("error occurred");
                }, function(value) {
                    console.log("no callback");
                });
            }
        } ]);
