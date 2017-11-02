'use strict';

angular.module('myApp').controller('LoginController', ['$scope', 'LoginService', function($scope, LoginService) {
    var self = this;
    self.user={id:null,nombre:'',apellido:'',email:'',password:''};
    self.repass='';
    
    self.login = login;
    self.register = register;

    function login() {
        console.log('Start Login', self.user);
        LoginService.login(self.user)
        .then(
        function(u){
        	console.log('El usuario esta registrado')
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
        },
        function(errResponse){
        	console.log('Registro fallido')
        });
    }
}]);
