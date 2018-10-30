angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider


  .state('myStockPortfolio', {
    url: '/page1',
    templateUrl: 'templates/myStockPortfolio.html',
    controller: 'myStockPortfolioCtrl'
  })

  .state('companyStock', {
    url: '/page2',
    params: {
      company: null,
      // name: null,
      // student: null,
      // age: null,
    },
    templateUrl: 'templates/companyStock.html',
    controller: 'companyStockCtrl'
  })

$urlRouterProvider.otherwise('/page1')


});
