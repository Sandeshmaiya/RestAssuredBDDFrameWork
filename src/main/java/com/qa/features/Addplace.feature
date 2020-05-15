Feature: Validiating place apis

@AddPlace @Regression
Scenario Outline: Verify if place been added 

	Given Add place payload with "<name>" and  "<language>" and "<address>"
	When user calls "AddPlaceAPI" api with Post http request
	Then api call is success with status code 200
	Then "status" value is "OK"
	Then "scope" value is "APP"
Examples: 
|name		|language	|address|
|sandesh	|English	|maruthiexten banalore|
|sandesh123	|Tamil		|maruthiexten3 banalore|