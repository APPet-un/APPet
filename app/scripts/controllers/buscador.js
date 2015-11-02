'use strict';

/**
 * @ngdoc function
 * @name sbAdminApp.controller:BuscadorCtrl
 * @description
 * # BuscadorCtrl
 * Controller of the sbAdminApp
 */
angular.module('sbAdminApp')
  .controller('BuscadorCrtl', ['$scope', '$location', 'transferdata', '$http' , function ($scope, $location, transferdata, $http) {
 		
 	$scope.sortType     = 'name'; // set the default sort type
  	$scope.sortReverse  = false;  // set the default sort order
  	$scope.searchFish   = '';     // set the default search/filter term
  
  // lista de datos de busqueda
  $http.get('http://localhost:9000/datosdummies/busqueda.json').success(function(data){

  		$scope.datos = data;

  })
  	 
  $scope.url = "#/dashboard/table";
  $scope.ver = function($user){
  	transferdata.data.name = $user;
  	$location.url("dashboard.form");

  }
  
	}]);
