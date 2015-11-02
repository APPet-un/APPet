'use strict';

/**
 * @ngdoc function
 * @name sbAdminApp.controller:RegistroCtrl
 * @description
 * # RegistroCtrl
 * Controller of the sbAdminApp
 */
angular.module('sbAdminApp')
  .controller('RegistroCtrl', ['$scope', function ($scope) {

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
