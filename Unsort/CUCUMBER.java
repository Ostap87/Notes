			===================== CUCUMBER =====================
Eclipse MArket -> Natural 0.7.6
Open source tool for test automation
Tests are written in Gherkin -> language Cucumber uses to define test cases

GIVEN	-> precondition (what you need to have to perform action)
And
WHEN	-> action 	(performs action)
And
THEN 	-> result	(desired outcome for the user)


Scenario outlines:
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
		features = "src/test/resources/feature",
		glue = "src/test/java/stepDefinitions", -> run everything from this package
		tags = "@SmokeGroup"
		dryRun = true/false -> Y/N execute code without opening browser
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














