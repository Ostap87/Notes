		================== PAGE OBJECT MODEL ====================
							 Design Patern
To make our framework more cleaner 


Creating the Java classes that represents each page on the application



SuitCRM project:

-> pages
	-loginPage.java
	-homePage.java
	-accountCreationPAge.java

*inside the page classes we will be store WebElements and methods related to that specific page.

======
PageFactory --> initializing the WebElements, class that comes from Selenium library
we find by annotations -> locations

public LoginPage(WebDriver driver){
	PageFactory.initElements(driver, this) 
}

=====================================================

When you have a test case to automate:
1. Manually execute it and make sure it is working/passingUnderstand that case.
2. Automation:
	- create page object classes, if it not already exists;
	- add all elements that are affected by the test as variables for the page object class
	- specify locators using @FindBy annotation.
	- create a TestNG test and use page objects and elements according to test case.
	- executeTestNg tests


















