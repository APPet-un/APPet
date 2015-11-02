'use strict';

/**
 * @ngdoc function
 * @name sbAdminApp.controller:HistorialCtrl
 * @description
 * # HistorialCtrl
 * Controller of the sbAdminApp
 */
angular.module('sbAdminApp')
  .controller('HistorialCtrl', ['$scope', '$location', 'transferdata', '$http', '$modal' , function ($scope, $location, transferdata, $http, $modal) {
 		
  		$scope.tabs = [{button: 'Datos Mascota', url: 'dashboard.form'},
  		{ button:'Datos Propietario', url:'dashboard.propietario'},
  		{ button:'Historia Clínica', url: 'dashboard.historiaClinica'},
  		{ button: 'Laboratorio', url:'dashboard.laboratorio' },
  		{ button:'Vacunas', url: 'dashboard.vacunas'} 

  		];

        // lista de datos de busqueda
      $http.get('http://localhost:9000/datosdummies/historiaclinica.json').success(function(data){

        $scope.gridOptions.data = data;

    });


  		$scope.gridOptions = {
      enableSorting: true,
    	paginationPageSizes: [2, 50, 75],
    	paginationPageSize: 2,
    	columnDefs: [
      { name: 'Fecha' , field: 'Fecha' },
      { name: 'Doctor' , field: 'Doctor' },
      { name: 'Ver Historia Clínica',
             cellTemplate:'<button class="btn btn-primary btn-xs" ng-click="grid.appScope.showMe()">Ver historia</button>' }     
    
  ]};

  		// ventana modal para ver historia clinica 
  		$scope.showMe = function(){
   				$scope.editarHistoria = {};
   				var modalInstance = $modal.open({
   					templateUrl:'views/showHistoria/ver-historia.html',
   					controller: 'editarHistoria'
   				});
                };


        $scope.crear2 = function(){
           $scope.gridOptions.data.push({ Fecha: '01/01/2015', Doctor: 'prueba' });

        }; 
        
        $scope.crear = function(){
        	/*

          $scope.crearHistoria = {};
   				var modalInstance = $modal.open({
   					templateUrl:'views/createHistoria/create-historia.html',
   					controller: 'editarHistoria',
   					resolve: {
                    crearHistoria: function() {
                        return $scope.crearHistoria;
                    }
                }
            });

             modalInstance.result.then(function(selectedItem) {
                   $scope.miembros.push( { Fecha: "01/01/2015",
                                  Doctor: $scope.crearHistoria.doctor });
            });
*/

        };

                   	
  		
  		// service para pasar info de una pagina a otra   
  		$scope.user = transferdata.data.name;	
  		
  }])

// controler para la edicion de historia clinica
  .controller('editarHistoria', ['$scope', '$modalInstance', function ($scope, $modalInstance, crearHistoria) {
      $scope.crearHistoria=crearHistoria;
        $scope.crearNuevaHistoria=function(){
              
        $modalInstance.close(crearHistoria);
        };


        
        $scope.cancel = function(){
          $modalInstance.dismiss('cancel');
        };
    }]);



