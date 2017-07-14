Application.$controller("test111PageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
    };


    $scope.currency1Change = function($event, $isolateScope, newVal, oldVal) {
        alert("on change success");
    };


    $scope.currency1Focus = function($event, $isolateScope) {
        alert("on focus success");
    };


    $scope.currency1Blur = function($event, $isolateScope) {
        alert("on blur success");
    };


    $scope.accordion1Change = function($event, $isolateScope, newPaneIndex, oldPaneIndex) {
        alert("on change accordion success");
    };


    $scope.accordionpane1Load = function($event, $isolateScope) {
        alert("on accordionpane1Load success");
    };


    $scope.accordionpane1Expand = function($event, $isolateScope) {
        alert("on accordionpane1Expand success");
    };


    $scope.accordionpane1Collapse = function($event, $isolateScope) {
        alert("on accordionpane1Collapse success");
    };




}]);