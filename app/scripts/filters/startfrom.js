'use strict';

/**
 * @ngdoc filter
 * @name sbAdminApp.filter:startFrom
 * @function
 * @description
 * # startFrom
 * Filter in the sbAdminApp.
 */
angular.module('sbAdminApp')
  .filter('startFrom', function() {
    return function(input, start) {
        if(input) {
            start = +start; //parse to int
            return input.slice(start);
        }
        return [];
    }
});
