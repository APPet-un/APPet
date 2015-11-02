'use strict';
/**
 * @ngdoc overview
 * @name sbAdminApp
 * @description
 * # sbAdminApp
 *
 * Main module of the application.
 */
angular
  .module('sbAdminApp', [
    'oc.lazyLoad',
    'ui.router',
    'ui.bootstrap',
    'angular-loading-bar',
    'ui.grid',
    'smart-table',
    'angular-country-picker'
    
  ])
  .config(['$stateProvider','$urlRouterProvider','$ocLazyLoadProvider',function ($stateProvider,$urlRouterProvider,$ocLazyLoadProvider) {
    
    $ocLazyLoadProvider.config({
      debug:false,
      events:true,
    });

    $urlRouterProvider.otherwise('/dashboard/home');

    $stateProvider

      .state('facehome', {
            url: '/facehome',
            templateUrl: 'views/appface/facehome.html',
            controller: 'BuscarparejaCtrl'            
                    
        })

      .state('adoptar', {
            url: '/adoptar',
            templateUrl: 'views/appface/adoptar.html',
            controller: 'BuscarparejaCtrl'            
                    
        })

      .state('buscarPareja', {
            url: '/buscar-pareja',
            templateUrl: 'views/appface/buscar-pareja.html',
            controller: 'BuscarparejaCtrl'            
                    
        })

      .state('registro', {
            url: '/registro',
            templateUrl: 'views/pages/registro.html',
            controller: 'RegistrouserCtrl'            
                    
        })

      .state('perfil', {
            url: '/perfil',
            templateUrl: 'views/appface/perfil.html',
            controller: 'PerfilCtrl'            
                    
        })
      .state('addAdoptar', {
            url: '/add-adoptar',
            templateUrl: 'views/appface/add-adoptar.html',
            controller: 'PerfilCtrl'            
                    
        })

        // multi-step-form 1: registro usuario
      .state('datosReg', {
            url: '/reg-usuario',
            templateUrl: 'views/pages/registro-usuario.html',
            controller: 'RegistroCtrl'            
                    
        })
        
        // multi-step-form 2: registro a que veterinaria pertenecera
      .state('veterinariaReg', {
            url: '/veterinaria',
            templateUrl: 'views/pages/registro-usuario-vet.html',
            controller: 'RegistroCtrl'
        })
        
        // multi-step-form 3: registro de las mascotas
      .state('mascotaReg', {
            url: '/mascotas',
            templateUrl: 'views/pages/registro-usuario-mascotas.html',
            controller: 'RegistroCtrl'
        })


      .state('dashboard', {
        url:'/dashboard',
        templateUrl: 'views/dashboard/main.html',
        resolve: {
            loadMyDirectives:function($ocLazyLoad){
                return $ocLazyLoad.load(
                {
                    name:'sbAdminApp',
                    files:[
                    'scripts/directives/header/header.js',
                    'scripts/directives/header/header-notification/header-notification.js',
                    'scripts/directives/sidebar/sidebar.js',
                    'scripts/directives/sidebar/sidebar-search/sidebar-search.js'
                    ]
                }),
                $ocLazyLoad.load(
                {
                   name:'toggle-switch',
                   files:["bower_components/angular-toggle-switch/angular-toggle-switch.min.js",
                          "bower_components/angular-toggle-switch/angular-toggle-switch.css"
                      ]
                }),
                $ocLazyLoad.load(
                {
                  name:'ngAnimate',
                  files:['bower_components/angular-animate/angular-animate.js']
                })
                $ocLazyLoad.load(
                {
                  name:'ngCookies',
                  files:['bower_components/angular-cookies/angular-cookies.js']
                })
                $ocLazyLoad.load(
                {
                  name:'ngResource',
                  files:['bower_components/angular-resource/angular-resource.js']
                })
                $ocLazyLoad.load(
                {
                  name:'ngSanitize',
                  files:['bower_components/angular-sanitize/angular-sanitize.js']
                })
                $ocLazyLoad.load(
                {
                  name:'ngTouch',
                  files:['bower_components/angular-touch/angular-touch.js']
                })
            }
        }
    })
      .state('dashboard.home',{
        url:'/home',
        controller: 'MainCtrl',
        templateUrl:'views/dashboard/home.html',
        resolve: {
          loadMyFiles:function($ocLazyLoad) {
            return $ocLazyLoad.load({
              name:'sbAdminApp',
              files:[
              'scripts/controllers/main.js',
              'scripts/directives/timeline/timeline.js',
              'scripts/directives/notifications/notifications.js',
              'scripts/directives/chat/chat.js',
              'scripts/directives/dashboard/stats/stats.js'
              ]
            })
          }
        }
      })
      .state('dashboard.form',{
        templateUrl:'views/showHistoria/form.html',
        url:'/form',
        controller: 'HistorialCtrl'
    })
      .state('dashboard.blank',{
        templateUrl:'views/pages/blank.html',
        url:'/blank'
    })
      .state('login',{
        templateUrl:'views/pages/login.html',
        url:'/login',
        controller: 'RegistrouserCtrl'
    })
      /*
      .state('dashboard.chart',{
        templateUrl:'views/chart.html',
        url:'/chart',
        controller:'ChartCtrl',
        resolve: {
          loadMyFile:function($ocLazyLoad) {
            return $ocLazyLoad.load({
              name:'chart.js',
              files:[
                'bower_components/angular-chart.js/dist/angular-chart.min.js',
                'bower_components/angular-chart.js/dist/angular-chart.css'
              ]
            }),
            $ocLazyLoad.load({
                name:'sbAdminApp',
                files:['scripts/controllers/chartContoller.js']
            })
          }
        }
    }) */
      .state('dashboard.search',{
        templateUrl:'views/table.html',
        url:'/search',
        controller: 'BuscadorCrtl'
    })
      .state('dashboard.panels-wells',{
          templateUrl:'views/ui-elements/panels-wells.html',
          url:'/panels-wells'
      })
      .state('dashboard.buttons',{
        templateUrl:'views/ui-elements/buttons.html',
        url:'/buttons'
    })
      .state('dashboard.notifications',{
        templateUrl:'views/ui-elements/notifications.html',
        url:'/notifications'
    })
      .state('dashboard.typography',{
       templateUrl:'views/ui-elements/typography.html',
       url:'/typography'
   })
      .state('dashboard.icons',{
       templateUrl:'views/ui-elements/icons.html',
       url:'/icons'
   })
      .state('dashboard.grid',{
       templateUrl:'views/ui-elements/grid.html',
       url:'/grid'
   })
      .state('dashboard.propietario',{
       templateUrl:'views/showHistoria/datosPropietario.html',
       url:'/historia/propietario',
       controller: 'HistorialCtrl'
   })
      .state('dashboard.historiaClinica',{
       templateUrl:'views/showHistoria/historiaClinica.html',
       url:'/historia/clinica',
       controller: 'HistorialCtrl'
   })
      .state('dashboard.laboratorio',{
       templateUrl:'views/showHistoria/laboratorio.html',
       url:'/historia/laboratorio',
       controller: 'laboratorioCtrl'
   })
      .state('dashboard.vacunas',{
       templateUrl:'views/showHistoria/vacunas.html',
       url:'/historia/vacunas',
       controller: 'vacunasCtrl'
   })
      .state('dashboard.create',{
       templateUrl:'views/createHistoria/create-mascota.html',
       url:'/create-mascota'
   })
      //.state('dashboard.createHistoria',{
      // templateUrl:'views/createHistoria/create-historia.html',
      // url:'/create-historia'
 //})
      .state('dashboard.createLaboratorio',{
       templateUrl:'views/createHistoria/create-laboratorio.html',
       url:'/create-laboratorio'
   })
      .state('dashboard.createVacuna',{
       templateUrl:'views/createHistoria/create-vacuna.html',
       url:'/create-vacuna'
   })
      
   

      

  }]);

    
