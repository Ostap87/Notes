						========== Synchronizations ==========

1) Thread.sleep() -> comes from Java, it does have anything to do with the browser.
	pause of execution of Java. Does not effect browser.
	- it is no flexible(sometimes need wair more or less time)
	- make execution of code heavy and slow
_________________________________

2) Implicit wait
		// waits certain time while finding the element
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 -only applies to findElement/s method 
	 -driver will repeatedly try to find element, stop looking it finds the element 
	 before the time given, returns the element immediately.
	 -driver throw exceptiononly after the given time runs out
	 -works until WebDriver alive and accesseble
	 	// waits certain time while the page loading
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	 	// waits certain time while the script/processes in the page are executing
	driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
_________________________________

3) Explicit wait
	WebDriverWait --> it is a class that lets us wait for certain actions or element/locators.

	ex. -wait until element with id "id" becomes visible
		-wait until element with id "id" disappears
		-wait until element with id "id" has certain text
		-wait until element with id "id" becomes clickeble

	WebDriverWait needs two things to work:
	* element or locator
	* condition

	WebDriverWait has two constructor arguments: 
	* WebDriver , time duration(in seconds)
		WebDriverWait wait = new WebDriverWait(driver, 5);
		<wait.until(ExpectedConditions.VisibilityOfElementLocated(by.....))
			- wait.until(). -> starts the wait actions
			- ExpectedConditions.visibilityOfElementLocated() -> condition
			- by..... -> locator used to find element
		<wait.until(ExpectedConditions.invisibilityOfElementLocated(by.....))	

	ExpectedConditions.elementsToBeClickable() -> does not alwayswork as expected, sometimes returns true
			as soon as element is visible and active. It does not always handle the elements blocked by 
			other elements.
_________________________________

4) Fluent wait
	Wait<WebDriver> wait = FluentWait<WebDriver>(driver);
		.withTimout(5, TimeUnit.SECONDS); -> customize the timeouts
		.pollingEvery(100, TimeUnits.MILLISECOND); -> controls how often selenium re-try same operation
		.ignoring(NoSuchElementException.class); -> pass exception which will be ignoredwhile trying same operation

=========================================================================

JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("any string");
















