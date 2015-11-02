'use strict';

/**
 * @ngdoc function
 * @name sbAdminApp.controller:RegistrouserCtrl
 * @description
 * # RegistrouserCtrl
 * Controller of the sbAdminApp
 */
angular.module('sbAdminApp')
  .controller('RegistrouserCtrl',  ['$scope', '$state', '$stateParams',  function ($scope, $state, $stateParams) {
   
  	$scope.login = function(){
  		$state.go('dashboard.home');
  	}

  	$scope.register = function(){
  		$state.go('datosReg');
  	}
   
  }]);
