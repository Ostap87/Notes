===== API Interview =====


Authentication -> adding login and password
Authorization -> is user authorized to make any changes

https://ostap87api.dev.cc/wp-json/wp/v2/posts?per_page=1
baseURI = "https://ostap87api.dev.cc/wp-json";
basePath = "/wp/v2";
"?per_page=1"-> query parameter


===== API Interview =====


Authentication -> adding login and password
Authorization -> is user authorized to make any changes
payLoad -> request or responce body=json/xml
Serialization -> converting java object to JSON String
Deserialization -> instantiates POJO from JSON String
Headers -> configuration for the accessof the service
jackson library -> helps in serialization and deserialization
-----

https://ostap87api.dev.cc/wp-json/wp/v2/posts?per_page=1
baseURI = "https://ostap87api.dev.cc/wp-json";
basePath = "/wp/v2";
"?per_page=1"-> query parameter

-----
.relaxedHTTPSValidation() -> secured connection, means i trust this url...
-----
hamcrest library -> with Matchers make code easy readable when we doing assert
-----
ObjectMapper mapper = new ObjectMapper(); -> come from jackson library
-----
					=HEADERS=
|		Key				|		Value 			|
|     contentType		|	application/json 	|
|	 authorization 		|		 basic			|
|		force 			|	     true			|
|       title	    	|	   some name 	    |
|	     post 	    	|		   7			|
|		status 			|	   publishe			|

=====

How U gonna start testing?
Me:
-What king of authorization this endpoint need/
	what type of endpoint do I have
	401 status code - not authorized if no access
Roles: admin/editor/subscriber/author/user...
-Test what data are visible for each user. if u not login as admin 
u should not be able to see any other user information

=======================================================================
API vs WebServices
API -> communicator between 2 apps independentlly and transfer all data
WebServices -> specific type of API which communicate specific throw network
-------------
SOAP vs REST
-------------
HTTP methods:
-GET/POST/PUT/DELETE
-------------
HTTP status codes:
-200/201/401/404/500
-------------
API HEADERS
additional information to hit API successfully
-------------
JSON vs XML
-------------
API tools for manual:
-Postman/Ready API/Jmeter/SoupUI
-------------
API tools for auto:
-RestAssured
-------------
Validations API:
-check status code, attrebute and data validation
-------------
API documentations and requirements
-------------
Storing tools for the API documentation:
-SharePoint/Doxygen/Confluence
url and looks like googledrive

























































