Application.$controller("test12122q1PageController", ["$scope", function($scope) {
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

    // should be an array of objects consisting of label, icon, children keys
    // populate the initial data
    $scope.treeData = [{
        "label": "folder1",
        "icon": "fa fa-folder",
        "children": []
    }, {
        "label": "folder2",
        "icon": "fa fa-folder",
        "children": []
    }];


    $scope.tree1Select = function($event, $isolateScope, $item, $path) {

        $scope.activeTreeElement = $item;


    };

}]);

Application.$controller("liveform1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);