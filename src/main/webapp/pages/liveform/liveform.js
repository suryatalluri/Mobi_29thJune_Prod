Application.$controller("liveformPageController", ["$scope", function($scope) {
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









    $scope.wizardstep2Load = function($isolateScope, stepIndex) {
        if ($scope.Widgets.checkbox1.datavalue === undefined)

            $scope.Widgets.wizardstep2.disablenext = true;


    };


    $scope.checkbox1Change = function($event, $isolateScope, newVal, oldVal) {
        if ($scope.Widgets.checkbox1.datavalue === true)
            $scope.Widgets.wizardstep2.disablenext = false;
        else
            $scope.Widgets.wizardstep2.disablenext = true;
    };

}]);




Application.$controller("liveform2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);



Application.$controller("liveform4Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("liveform5Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);