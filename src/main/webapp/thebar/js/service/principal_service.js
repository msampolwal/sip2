'use strict';

angular.module('myApp').factory('PrincipalService', ['$window','$http', '$q', function($window, $http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/theBar/';

    var factory = {
        generarOC:generarOC
    };

    return factory;

    function generarOC(localSelect){
		var deferred = $q.defer();
		var data = {
			"id" : localSelect	
		};
        $http.post(REST_SERVICE_URI+'generarOC/', data)
            .then(
            function (response) {
            	console.log(response.data);
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error("Error al generar la orden de compra");
                deferred.reject(errResponse);
                alert("Error al generar la orden de compra");
            }
        );
        return deferred.promise;
	}
}]);