'use strict';

/**
 * @ngdoc function
 * @name sbAdminApp.controller:BuscarparejaCtrl
 * @description
 * # BuscarparejaCtrl
 * Controller of the sbAdminApp
 */
angular.module('sbAdminApp')
  .controller('BuscarparejaCtrl', [ '$scope', '$http', 'globalVariable', function ($scope, $http, globalVariable) {
    	
    
    
    $scope.mascotasAdopcion = [
		{ nombre: "lukas" , raza: "Beagle", imagen: "http://bit.ly/1GEmRd5", titulo: "Busco Familia", descripcion: "no importa la raza", color: "cafe", edad: 2 },
		{ nombre: "loki", raza: "french puddle", imagen: "http://bit.ly/1kh4znI", titulo: "Busco Familia", descripcion: "misma raza negociacion de crias", color: "blanco", edad: 12 },
		{ nombre: "paco" , raza: "Rottweiler", imagen: "http://bit.ly/1Q0l0RZ", titulo: "Busco Familia", descripcion: "no importa la raza", color: "gris", edad: 7 },
		{ nombre: "jerry" , raza: "Labrador", imagen: "http://bit.ly/1Wnkx0Z", titulo: "Busco Familia", descripcion: "no importa la raza", color: "cafe", edad: 5 }
	];	

 	$scope.mascotasPareja = [
		{ nombre: "tomas" , raza: "Rottweiler", imagen: "http://bit.ly/1Q0l0RZ", titulo: "Busco cruce", descripcion: "no importa la raza", color: "negro", edad: 2 },
		{ nombre: "loki", raza: "french puddle", imagen: "http://bit.ly/1kh4znI", titulo: "Busco misma raza", descripcion: "misma raza negociacion de crias", color: "blanco", edad: 12 },
		{ nombre: "paco" , raza: "Rottweiler", imagen: "http://bit.ly/1Q0l0RZ", titulo: "Busco cruce", descripcion: "no importa la raza", color: "gris", edad: 7 },
		{ nombre: "jerry" , raza: "Bulldog", imagen: "http://bit.ly/1M7Nl7h", titulo: "Busco misma raza", descripcion: "no importa la raza", color: "cafe", edad: 5 }
	];

	$scope.perdidos = [
		{ nombre: "tomas" , raza: "Labrador", imagen: "http://bit.ly/1RkbgAf", titulo: "Estoy perdido, ayuda a encontrar a mi familia!", descripcion: "recompesa sera de $1'000.000", color: "cafe", edad: 2 },
		{ nombre: "loki", raza: "Labrador", imagen: "http://bit.ly/1RFk57K", titulo: "Estoy perdido, mi familia me necesita!", descripcion: "recompesa sera de $500.000", color: "blanco", edad: 10 },
		{ nombre: "paco" , raza: "Beagle", imagen: "http://bit.ly/1RFkcjz", titulo: "Estoy perdido, ayuda a encontrar a mi familia!", descripcion: "recompesa sera de $700.000", color: "cafe", edad: 7 },
		{ nombre: "jerry" , raza: "Criollo", imagen: "http://bit.ly/1N2eYLn", titulo: "Estoy perdido, mi familia me necesita!", descripcion: "recompesa sera de $900.000", color: "cafe", edad: 5 }
	];	


	//facehome
	function shuffle(o){
    for(var j, x, i = o.length; i; j = Math.floor(Math.random() * i), x = o[--i], o[i] = o[j], o[j] = x);
    return o;
	}
	$scope.listaAdop = shuffle($scope.mascotasAdopcion).slice(0,3);
	$scope.listaPareja = shuffle($scope.mascotasPareja).slice(0,3);
	var perdidos = shuffle($scope.perdidos).slice(0,3);
	$scope.perdidosActive = perdidos[0];
	$scope.perdidosDes =  perdidos.slice(1,3);



    //buscar pareja 
		$scope.RAZA_OPTIONS = globalVariable.raza;
		$scope.COLOR_OPTIONS = globalVariable.color;
		$scope.rowCollection = $scope.mascotasPareja;

	//
		$scope.rowCollectionAdop = $scope.mascotasAdopcion;




		
  }]);
