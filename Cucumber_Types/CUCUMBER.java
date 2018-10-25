			===================== CUCUMBER =====================
Eclipse MArket -> Natural 0.7.6
Open source tool for test automation
Tests are written in Gherkin -> language Cucumber uses to define test cases
Parametarization -> using data table with maps

GIVEN	-> precondition (what you need to have to perform action)
WHEN	-> action 	(performs action)
THEN 	-> result	(desired outcome for the user)


Scenario outlines: -> whenever you have to use Data Driven approche with Examples: keyword 
-Example Table -> loop full scenario for each row
-Step Table -> all data is used in at once

Features --> Scenario --> Steps

.feature -> extention for file.

Two parts of CUCUMBER:
Gherkin <-----> Step Definition
_______________________________________________

@Given("^I logged into google home page$")
	^ --> begining of pattern/step
	$ --> ending of pattern/step
_______________________________________________

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:target/cucumber"}, -> create cucumber folder and generate html report
		features = "src/test/resources/feature", -> folder where .feature files are available 
		glue = "src/test/java/stepDefinitions", -> folder where stepDefinitions files are available 
		tags = {"@SmokeGroup","~Regression"} -> ~ means ignore
		monochrome = true/false -> display the consol output in proper readable format
		dryRun = true/false -> Y/N execute code without opening browser/ check the mapping only
		)
RunnerClass
configurations class witch controls the flow of the framework.
Including conecting the feature files/scenarios to step definition code.
Also it will generate certain types of reports witch comes from cucumber
library. It will help us to specify witch group of scripts we want to run.
->to run the features / generate report / 
_______________________________________________

Data Driven Development
--> keeping yout test data or any data out of the code.
_______________________________________________

++++++++ HOOKS ++++++++

Global Hooks - @Before&@After --> execute after and before each scenario;
Local Hooks - @Before(tagName)&@After(tagName) --> execute after and befor 
	any pre conditions for specific scenario by tag name;
--> Concept to control the status of the scenarios. 
Can be used to configure each scenarios in Cucumber.
It will help to generate




@Before
public void setUp() {
	System.out.println("This is Hooks Before annotations");
}

@After
if(scenario.isFailed()) {
		final byte [] screenshot = ((TakesScreenshot)DriverAll.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		scenario.write("This scenario Failed");
	}
	DriverAll.getDriver().quit();
}














