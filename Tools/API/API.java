							========== API ==========

API -> Application Programming Interface
Enables communication between systems and secure way of sharing data and functionalities.
-----------------------------------------------------
2 types of API:
SOAP
REST (more popural)
RESTFul Api / RESTFul WebServices
-----------------------------------------------------
API -> application without UI
REST - assurted library in java
-----------------------------------------------------
{{baza}}/wp-json/wp/v2/posts'?per_page=1'- green is query parameter
-----------------------------------------------------
Data formats for API:  >>XML and >>JSON
-----------------------------------------------------
JSON -> JavaScript Object Notation - lightweight of XML
=====================================================

How do we test APIs:
______________________

-in API there is request and response communication happens, as a tester -> 
	send request to an API and verify the responce
Types of request of REST API:
* GET request ->to query data like select in SQL =>
* POST request ->to create data =>
* PUT request ->to updates data =>
* DELETE request->to delete data => methods/URLs thats are mappedto them

How and Where send request?
______________________

REST API will have endpoints/URLs/uris

Builders of API will createpublic URLs and Requests to sendre send to that URL
Swagger is a tool for API documentation

Understanding API endpoints/URLs
*Base URL:
		/MethodName
______________________

Make sure that all Breakpoints/ of REST API work as expected. Send GET/POST/PUT/DELETE 
	requests and validate the response.

<<<SWEGGER PETSTORE>>>
It will description of API endpointsand how to use them.
______________________

When an API developer programs an API URL, 
	he will decide if that URLworks with GET/POST/PUT/DELETE requests

=======================================================================================

---<POSTMAN>---
It is REST API client tool - helps to test REST API URLs.
Popular for developers and testers(use mostly for manual)

=======================================================================================
How do you test REST API:
I verify if each REST API endpoints is working as expected
Send requests and veryfy response status code and response body.
Also, do positive and negative testing API:

positive - send valid request parameters, valid headers, valid request JSON body and
verify that response status code is 200 and JSON response body data is as expected

negative - sned invalid request parameters, invalid headers, invalid request JSON body and
verify that response status code is NOT 200 and JSON response body data contains error msg


























