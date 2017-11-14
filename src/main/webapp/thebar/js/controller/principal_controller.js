'use strict';

angular.module('myApp').controller('PrincipalController', ['$scope', '$http', 'UserService', function($scope, $http, UserService) {

	console.log(UserService.isLogged);
	console.log(UserService.user);
	$scope.isLogged = UserService.isLogged;
	$scope.user = UserService.user;
	
	$http.get('http://localhost:8080/theBar/locales/')
    .success(function(res) {
		$scope.locales = res;
		console.log($scope.locales)
	}).error(function(error) {
		$scope.resource = error;
	});
}]);
