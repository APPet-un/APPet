'use strict';

// controler para la edicion de vacunas
angular.module('sbAdminApp')
    .controller('vacunasCtrl', ['$scope', '$location', 'transferdata', '$http', '$modal' , function ($scope, $location, transferdata, $http, $modal) {

      $scope.tabs = [{button: 'Datos Mascota', url: 'dashboard.form'},
      { button:'Datos Propietario', url:'dashboard.propietario'},
      { button:'Historia Clínica', url: 'dashboard.historiaClinica'},
      { button: 'Laboratorio', url:'dashboard.laboratorio' },
      { button:'Vacunas', url: 'dashboard.vacunas'} 

      ];

        // lista de datos de busqueda
      $http.get('http://localhost:9000/datosdummies/vacunas.json').success(function(data){

        $scope.data = data;

    });

  /*   $scope.data =  [
    { "Fecha": "15/02/2015", "Tipo": "Rabia" },
    { "Fecha": "13/04/2015", "Tipo": "Moquillo canino" },
    { "Fecha": "18/12/2013", "Tipo": "parvovirus" },
    { "Fecha": "11/02/2011", "Tipo": "aaaa" },
    { "Fecha": "11/02/2011", "Tipo": "bbbb" }
  ];
*/
  

    $scope.gridOptions = { 
    //data: 'vacunas',
    enableSorting: true,
    paginationPageSizes: [2, 50, 75],
    paginationPageSize: 2,
    columnDefs: [
        { name: 'Fecha', field:'Fecha'}, 
        { name :'Tipo de vacuna', field:'Tipo'},
        { name: 'Ver Historia Clínica',
             cellTemplate:'<button class="btn btn-primary btn-xs" ng-click="grid.appScope.showMe()">Ver vacunas</button>' }     
    
  ]};
$scope.gridOptions.data = 'data';
  		// ventana modal para ver historia clinica 
  		$scope.showMe = function(){
   				$scope.editarHistoria = {};
   				var modalInstance = $modal.open({
   					templateUrl:'views/showHistoria/ver-historia.html',
   					controller: 'editarHistoria'
   				});
                }; 
       

  
    $scope.crear=function () {

    	/*
    $scope.nuevaVac={};
    var modalInstance = $modal.open({
      templateUrl: 'views/createHistoria/create-historia.html',
      controller:'AddNuevaVacCtrl',
                resolve: {
                    nuevaVac: function() {
                        return $scope.nuevaVac;
                    }
                }
            });

      modalInstance.result.then(function(selectedItem) {

      	 var aux = angular.copy($scope.data);
      	aux.push({ Fecha: "11/02/2011", Tipo: "prueba" });
      	  
	$scope.data.length = 0;
	$scope.data = aux;



    
	

        	  var valor = ""
      	  for(var val in $scope.data ){ valor += " " + val;}
      	  alert(valor + ", " + $scope.data.length);
      		alert($scope.data[$scope.data.length -1]["Tipo"] )
      	  }, function(){
           	 alert('lo sentimos ocurrio un error: ');
           });

*/
        };



  }])

.controller('AddNuevaVacCtrl', ['$scope', '$modalInstance', function ($scope, $modalInstance,nuevaVac) {
    $scope.nuevaVac=nuevaVac;
    $scope.crearNuevaHistoria=function(){
    $modalInstance.close(nuevaVac);
};
    $scope.cancel =function(){
    $modalInstance.dismiss('cancel');
     };
}]);

    

