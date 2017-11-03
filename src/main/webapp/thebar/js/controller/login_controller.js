'use strict';

angular.module('myApp').controller('LoginController', ['$scope', 'LoginService', 'UserService', function($scope, LoginService, UserService) {
    var self = this;
    self.user={id:null,nombre:'',apellido:'',email:'',password:''};
    
    self.login = login;
    self.register = register;

    function login() {
        console.log('Start Login', self.user);
        LoginService.login(self.user)
        .then(
        function(u){
        	console.log('El usuario esta registrado');
        	UserService.isLogged = true;
        	UserService.user = u;
        },
        function(errResponse){
        	console.log('El usuario NO esta registrado')
        });
    }
    
    function register() {
        console.log('Start Register', self.user);
        LoginService.register(self.user)
        .then(
        function(u){
        	console.log('Registro exitoso')
        	UserService.isLogged = true;
        	UserService.user = u;
        },
        function(errResponse){
        	console.log('Registro fallido')
        });
    }
}]);
