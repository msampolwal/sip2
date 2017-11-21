'use strict';

angular.module('myApp').controller('PrincipalController', ['$scope', '$http', '$window', 'PrincipalService', 'UserService', function($scope, $http, $window, PrincipalService, UserService) {
	var self = this;
	var REST_SERVICE_URI = 'http://localhost:8080/theBar/';
	
	self.logout = logout;
	self.setSelected = setSelected;
	self.generarOC = generarOC;
	$scope.localSelected = false;
	$scope.localSelect = null;
	$scope.ordenCompra = null;
	
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
	
	$http.get('http://localhost:8080/theBar/promociones/')
    .success(function(res) {
		$scope.promociones = res;
	}).error(function(error) {
		$scope.resource = error;
	});
	
	function setSelected(l){
		var local = l;
		$scope.localSelected = true;
		$scope.localSelect = l;
		console.log($scope.localSelect);
		console.log($scope.localSelected);
	}
	
	function logout() {
        UserService.limpiarSession();
        $scope.isLogged = false;
        $scope.user = null;
        $window.location.href = '/theBar/principal.htm';
    }
	
	function generarOC(){
		console.log('Start Orden de Compra');
		console.log($scope.localSelect.id);
        PrincipalService.generarOC($scope.localSelect.id)
        .then(
        function(oc){
        	console.log('La orden de compra ha sigo generada');
        	$scope.ordenCompra = oc;
        	console.log($scope.ordenCompra);
        	$('#ordenDeCompra').modal('show');
        },
        function(errResponse){
        	console.log('La orden de compra No ha podido ser generada');
        });
	}
}]);
