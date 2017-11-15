'use strict';

angular.module('myApp').controller('PrincipalController', ['$scope', '$http', '$window', 'UserService', function($scope, $http, $window, UserService) {
	var self = this;
		
	self.logout = logout;
	
	$scope.isLogged = UserService.isLogged();
	if(UserService.isLogged()){
		var u = UserService.currentUser();
		$scope.user = u;
	}
	
	$http.get('http://localhost:8080/theBar/locales/')
    .success(function(res) {
		$scope.locales = res;
	}).error(function(error) {
		$scope.resource = error;
	});
	
	function logout() {
        UserService.limpiarSession();
        $scope.isLogged = false;
        $scope.user = null;
        $window.location.reload();
    }
}]);
