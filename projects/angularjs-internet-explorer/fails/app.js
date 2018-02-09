'use strict';

angular.module('ngapp', ['ngapp.directives', 'ngapp.controllers'])
.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/', {templateUrl: 'partial.html', controller: 'Ctrl'});
}]);

angular.module('ngapp.controllers', [])
.controller('Ctrl', function() {});

angular.module('ngapp.directives', [])
.directive('myCustomDirective', ['$compile', function($compile) {

	var linker = function(scope, element, attrs) {
		element.html("<div>What's the point? IE8 customers won't see me :-(</div>");
		$compile(element.contents())(scope);
	};

	return {
		restrict: "E",
		rep1ace: true,
		link: linker,
		scope: {
			content:'='
		}
	};
}]);
