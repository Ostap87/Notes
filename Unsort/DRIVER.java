					================== DRIVER ==================

1) standart
	System.setProperty("webdriver.chrome.driver", "/Users/oleksandrostapchuk/Desktop/SELENIUM/chromedriver");
		WebDriver d = new ChromeDriver();
		driver.get(...);
		driver.manage().window().fullscreen();
______________________________________________________

2) utility class
	@Test
	public void test1() {
	
	OODriver.getDriver().get("http://...");
	OODriver.getDriver().findElement(By.id("btn")).click();
	WebDriverWait wait = new WebDriverWait(OODriver.getDriver(), 6);
	boolean checkBox = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));
	System.out.println(checkBox);

______________________________________________________

3) bonnitaGarcia
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(...);
		driver.manage().window().fullscreen();
______________________________________________________































