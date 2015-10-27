<html data-ng-app="app">
<head>
<title>Show Countries Information</title>
<!-- Use Bootstrap -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link href="include/styles.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script type="text/javascript" src="include/app.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body data-ng-controller="HttpCtrl as app">
	<div class="container">
		<div class="header">
			<h1 class="container jumbotron h1 navbar-default">Country Search Interface</h1>
		</div>
		<div>
			<h2 class="custom">List of Countries that are also Islands:</h2>
			<ul>
				<li data-ng-repeat="island in islands">{{island.name}}</li>
			</ul>
			<ul>
			   <li data-ng-show="!islands.length">No Islands. Refresh to try again</li>
			</ul>
		</div>
		<div>
			<h2 class="custom">Country/Countries that have the most
				bordering and their Borders:</h2>
			<div data-ng-repeat="(key, value) in borders">
				{{key}}
				<ul>
					<li data-ng-repeat="keys in value">{{keys.name}}</li>
				</ul>
			</div>
			
			<ul>
			<li data-ng-show="!borders">No Country</li>
			</ul>
		</div>
		<div>
			<h2>Enter a Region name to get a list of Countries within that Region:</h2>
			  <br />
			  <input id="id" type="text" data-ng-model="id"
				placeholder="Enter a Region Name"> <input type="button"
				data-ng-click="getRegion(id)" value="Get Countries" /> <input
				type="button" data-ng-click="id = null" value="Clear" /> <br />
			<ul>
				<li data-ng-repeat="regin in region">{{regin.name}}</li>
			</ul>
			<ul>
			   <li data-ng-show="!region.length">Invalid Region. Try again</li>
			</ul>
		</div>
		<br />
	    <br />
		<br />
		<div class="footer">Render Countries using AngularJS. copyrights @Rahel Ephrem</div>
	</div>
</body>
</html>