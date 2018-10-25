					======= ALERTS =======


1) JavaScripts Alerts --> not developed using HTML -> we can not locate and treat as webElement
			Syntax: Alert --> class that comes from Selenium library and this class will handle 
					any JavaScript alerts.
					Alert alertName = d.switch().alert();


2) Web based popups --> developed using HTML -> we threat them just like any otherwebElement


*** alert().accept
		 ().dismiss
		 ().sendKeys
		 ().getText

================================
How to Login into any site if it is showing an Authentication Pop-Up for Username and Password?
http://username:password@url
e.g. http://myUserName:myPassword@softwaretestingmaterial.com

================================
How to handle hidden elements in Selenium WebDriver?
(JavascriptExecutor(driver)).executeScript("document.getElementsByClassName(ElementLocator).click();");

================================
How to handle browser (chrome) notifications in Selenium?
ChromeOptions options = new ChromeOptions();
options.addArguments("disable-infobars");
WebDriver player = new ChromeDriver(options);




















