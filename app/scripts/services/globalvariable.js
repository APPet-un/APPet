'use strict';

/**
 * @ngdoc service
 * @name sbAdminApp.globalVariable
 * @description
 * # globalVariable
 * Factory in the sbAdminApp.
 */
angular.module('sbAdminApp')
  .factory('globalVariable', function () {
        return {
        raza: {
              criollo: 'Criollo',
              labrador: 'Labrador',
              golden: 'Golden retriever',
              bulldog: 'Bulldog',
              pastor: 'Pastor aleman',
              caniche: 'Caniche',
              beagle: 'Beagle',
              husky: 'husky siberiano',
              rottweiler: 'Rottweiler',
              pitbull: 'Pitbull',
              french: 'french poodle',
              schnauzer: 'Schnauzer',
              doberman: 'Doberman',
              grandanes: 'Gran danes'
        },
        color: {
              blanco: 'blanco',
              negro: 'negro',
              cafe: 'cafe',
              crema: 'crema',
              gris: 'gris',
              albaricoque: 'albaricoque'

        }
        /*hideModal: function (selector) {
          $(selector).modal('hide')
        },
        showModal: function (selector) {
          $(selector).modal('show')
        }
        */
      }

  });
