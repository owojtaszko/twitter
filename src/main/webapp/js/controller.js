let articleApp = angular.module("articleApp", []);

articleApp.controller("articleController", function ($scope, $http) {
    $scope.init = function () {
        $http({
            method: 'GET',
            url: 'api/articles',
            params: {}
        }).then(
            function (response) {
                $scope.articles = response.data
            }
        );

        $http({
            method: 'GET',
            url: 'https://api.openweathermap.org/data/2.5/weather',
            params: {
                appid: 'a775930919b6f3264b2174c96b047bce',
                q: 'Lublin,pl',
                units: 'metric'
            }
        }).then(
            function (response) {
                // $scope.articles = response.data
                $scope.weather = response.data
            }
        );
    };
});