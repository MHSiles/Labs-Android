angular.module('app.controllers', [])

.controller('pageCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])

.controller('page2Ctrl', ['$scope', '$stateParams', '$http', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams, $http) {

  var apiKey = "4efa75e89a1f379b2f67e447e0e5b1fa";
  var city = $stateParams.city;
  url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid="+ apiKey + "&units=metric";
  $http.get(url).then(function(response){
    $scope.cityname = response.data.name;
    $scope.temperature = response.data.main.temp;
    $scope.commentary = response.data.weather[0].description;
    $scope.icon = response.data.weather[0].icon;
    $scope.image = 'https://openweathermap.org/img/w/' + $scope.icon +'.png';
  }, function(error){
    //alert('UNABLE TO RETRIEVE WEATHER');
  });

  // http://api.openweathermap.org/data/2.5/weather?q=queretaro&APPID=4efa75e89a1f379b2f67e447e0e5b1fa

  // $scope.name = $stateParams.name;
  // $scope.student = $stateParams.student;
  // $scope.age = $stateParams.age;
}])
