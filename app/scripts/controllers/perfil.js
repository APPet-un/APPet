'use strict';

/**
 * @ngdoc function
 * @name sbAdminApp.controller:PerfilCtrl
 * @description
 * # PerfilCtrl
 * Controller of the sbAdminApp
 */
angular.module('sbAdminApp')
  .controller('PerfilCtrl', [ '$scope', '$http', 'globalVariable', function ($scope, $http, globalVariable) {
    	
    
    
    $scope.misMascotas = [
		{ nombre: "lukas" , raza: "Beagle", imagen: "http://bit.ly/1GEmRd5", color: "cafe", edad: 2 },
		{ nombre: "loki", raza: "french puddle", imagen: "http://bit.ly/1kh4znI", color: "blanco", edad: 12 },
		{ nombre: "paco" , raza: "Rottweiler", imagen: "http://bit.ly/1Q0l0RZ", color: "gris", edad: 7 },
		{ nombre: "jerry" , raza: "Labrador", imagen: "http://bit.ly/1Wnkx0Z", color: "cafe", edad: 5 }
	];

	$scope.user = [{nombre: "carlos", apellido: "hernandez", username:"carlitox", correo: "joJojo@gmail.com", direccion: "cll 45 # 32 -02", telefono: "8456974", celular: "3154687945", genero: "hombre" }];


	//add-adopcion

	$scope.Mascotas = [];

    $scope.addMascotas = function(){
      var flag = true; 
      for( var i=0; i< $scope.Mascotas.length; i++ ){
        
        if($scope.Mascotas[i].nombre == this.user.nombreMa && $scope.Mascotas[i].raza == this.user.raza){
            alert('esta mascota ya ha sido agragada');
            flag = false;
        }
                   
      }


      if(flag){

        $scope.genero = ""
                if(this.user.genero == "option-1"){
                  $scope.genero = "Macho"
                }
                else{
                   $scope.genero = "Hembra"
                }
                $scope.Mascotas.push({nombre: this.user.nombreMa,
                                      fechaCum: this.user.fechaCum,
                                      raza: this.user.raza,
                                      color:this.user.color,
                                      genero:  $scope.genero
                });
      }
  }

  $scope.agregarDatos = function(){
    confirm("¿esta seguro que quiere agragar estas mascotas?");

  }

  }]);
