'use strict';

angular.module('myApp').factory('UserService', [function(){
	return {
		isLogged:false,
		user:null
	}
}]);