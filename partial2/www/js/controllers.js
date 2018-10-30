angular.module('app.controllers', [])

.controller('myStockPortfolioCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])

.controller('companyStockCtrl', ['$scope', '$stateParams', '$http', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams, $http) {

  var company = $stateParams.company;
  var apiKey = "TNY4YJ5ARNG41K20";
  //
  url = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + company + "&apikey=" + apiKey;

  // alert(url);
  // alert($stateParams.company);

  if(company != null){
    $scope.company = $stateParams.company;
    
    $http.get(url).then(function(response){
      $scope.symbol = response.data["Global Quote"]["01. symbol"];
      $scope.day = response.data["Global Quote"]["07. latest trading day"] ;
      $scope.price = response.data["Global Quote"]["05. price"];
      $scope.difference = response.data["Global Quote"]["09. change"];

      if(response.data["Global Quote"]["09. change"] < 0){
        $scope.recomendation = "You should sell it now."
        $scope.recomendationColor = "red";
      }else{
        $scope.recomendation = "You should keep it."
        $scope.recomendationColor = "green";
      }
    }, function(error){

    });
  }else{
    $scope.company = "NO COMPANY SELECTED";
  }

}])
