'use strict';

angular.module('myApp').factory('LoginService', ['$window','$http', '$q', function($window, $http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/theBar/';

    var factory = {
        login:login,
        register:register
    };

    return factory;

    function login(user) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI+'login/', user)
            .then(
            function (response) {
            	console.log(response.data);
                deferred.resolve(response.data);
                $window.location.href = '/theBar/principal.htm';
            },
            function(errResponse){
                console.error('Error while login User');
                deferred.reject(errResponse);
                alert("No existe usuario con ese email y password");
            }
        );
        return deferred.promise;
    }
    
    function register(user) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI+'register/', user)
            .then(
            function (response) {
            	console.log(response.data);
                deferred.resolve(response.data);
                $window.location.href = '/theBar/principal.htm';
            },
            function(errResponse){
                console.error('Error while login User');
                deferred.reject(errResponse);
                alert("No existe usuario con ese email y password");
            }
        );
        return deferred.promise;
    }
}]);