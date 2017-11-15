'use strict';

angular.module('myApp').factory('UserService', [function(){
	return {
        currentUser : function() {
            return angular.fromJson(sessionStorage.getItem('user'));
        },
        isLogged : function() {
            return sessionStorage.getItem('logged');
        },
        //creamos una sesión //setter
        setCurrentUser : function(u) {
            sessionStorage.setItem('user', JSON.stringify(u));
            sessionStorage.setItem('logged', true);
        },
        //limpiamos una sesión
        limpiarSession : function() {
            sessionStorage.removeItem('user');
            sessionStorage.removeItem('logged');
        }
    }
}]);