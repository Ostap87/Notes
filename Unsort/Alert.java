					============ ALERTS ============


1) JavaScripts Alerts --> not developed using HTML -> we can not locate and treat as webElement
			Syntax: Alert --> class that comes from Selenium library and this class will handle 
					any JavaScript alerts.
					Alert alertName = d.switch().alert();


2) Web based popups --> developed using HTML -> we threat them just like any other webElement


*** alert().accept
		 ().dismiss
		 ().sendKeys
-------------------------------------------------

How to verify HTML alert is present? --> 
-> locate and assert isDisplayed();
	assertTrue(d.findElement(By.'locator', isDisplayed));

How to verify JavaScript alert is present? --> 
-> try {
	Alert alert = d.switch().alert();
}catch (NoAlertPresentException e) {
	Assert.fail("Alert NOT present");
}

























