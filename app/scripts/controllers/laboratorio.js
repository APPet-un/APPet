'use strict';

// controler para la edicion de laboratorio
angular.module('sbAdminApp')
    .controller('laboratorioCtrl', ['$scope', '$location', 'transferdata', '$http', '$modal' , function ($scope, $location, transferdata, $http, $modal) {

      $scope.tabs = [{button: 'Datos Mascota', url: 'dashboard.form'},
      { button:'Datos Propietario', url:'dashboard.propietario'},
      { button:'Historia Clínica', url: 'dashboard.historiaClinica'},
      { button: 'Laboratorio', url:'dashboard.laboratorio' },
      { button:'Vacunas', url: 'dashboard.vacunas'} 

      ];

        // lista de datos de busqueda
        $scope.rowCollection = [];
      $http.get('http://localhost:9000/datosdummies/laboratorio.json').success(function(data){

         $scope.rowCollection = data;

    });



   
    $scope.gridOptions = { 
    enableSorting: true,
    paginationPageSizes: [2, 50, 75],
    paginationPageSize: 2,
    columnDefs: [
        { name: 'Fecha', field:'Fecha'}, 
        { name :'Tipo de Examen', field:'Tipo'},
        { name: 'Ver Historia Clínica',
             cellTemplate:'<button class="btn btn-primary btn-xs" ng-click="grid.appScope.showMe()">Ver Laboratorio</button>' }     
    
  ]};

  		// ventana modal para ver historia clinica 
  		$scope.showMe = function(){
   				$scope.editarHistoria = {};
   				var modalInstance = $modal.open({
   					templateUrl:'views/showHistoria/ver-historia.html',
   					controller: 'editarHistoria'
   				});
                }; 
       

  
    $scope.crear=function () {
    $scope.nuevoLab={};
    var modalInstance = $modal.open({
      templateUrl: 'views/createHistoria/create-historia.html',
      controller:'AddNuevoLabCtrl',
                resolve: {
                    nuevoLab: function() {
                        return $scope.nuevoLab;
                    }
                }
            });

            modalInstance.result.then(function(selectedItem) {
              
            /*  $http.get('http://localhost:9000/datosdummies/vacunas.json').success(function(data){

               $scope.rowCollection = $scope.rowCollection.concat(data);

            });*/

            for (var item in $scope.nuevoLab){

                alert(item);
            }

              $scope.rowCollection = $scope.rowCollection.concat([{
                    Fecha: "11/05/15",
                    Tipo: $scope.nuevoLab.doctor
                    }]);

                  
            });
        };



  }])

.controller('AddNuevoLabCtrl', ['$scope', '$modalInstance', function ($scope, $modalInstance,nuevoLab) {
    $scope.nuevoLab=nuevoLab;
    $scope.crearNuevaHistoria=function(){
    $modalInstance.close(nuevoLab);
};
    $scope.cancel =function(){
    $modalInstance.dismiss('cancel');
     };
}]);

    

