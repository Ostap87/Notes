				============== SCROLL ===============

// creating instance of Javascript executor
-> JavascriptExecutor je = (JavascriptExecutor) driver;

// identify the WebElement witch will be appear after scrolling down
-> WebElement element = driver(.....);

// execute query witch actually will scroll until that element is not appeared on page
-> je.executeScript("arguments[0].scrollIntoView(true);",element);

// will scroll("horizontal,vertical") - by picels
-> je.executeScript("scroll(0,400)");

===========================================================
How to input text in the text box without calling the sendKeys()?

// To enter username
JS.executeScript("document.getElementById('User').value='SoftwareTestingMaterial.com'");
// To enter password
JS.executeScript("document.getElementById('Pass').value='tester'");


































