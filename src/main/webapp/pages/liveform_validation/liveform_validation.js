Application.$controller("liveform_validationPageController", ["$scope", function($scope) {
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


    $scope.button1Tap = function($event, $isolateScope) {

        $scope.Widgets.liveform1.formWidgets.username.required = true;

    };

}]);


Application.$controller("liveform1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;



    }
]);