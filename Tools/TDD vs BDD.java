				============== TDD vs BDD ==============

Gherkin

TDD --> Test Driven Development (avoid bugs)
in TDD we write the tests first, then write the code. It is done in the development phase.
 Developers write unit tests before they write the actual code. They write small test, 
 and try to pass ,continue, then same process.
 TDD does not involve all the parties of the software development, it is only includes
 developers and may be BA.


BDD --> Behavier Driven Development
	We need a process thet involved all parties in 	the same conversation.
	Behavier -> format of the behavior: agile/user stories.

Acceptance Criteria --> set of conditions which enables to mark user story to be done.
Created by tree amigos :-)

Three amigos --> when PO, dev, testers meet to discuss the agile story. in three amigos meeting,
 they produce the acceptance criteria for the story.

Cucumber BDD --> tools used facilitate the collaboration during the BDD process. 
 It enables explaning the story and the acceptance criteria in easy language.
_________________________________________________

src/test/resources --> cucumber test will be written in this package.
_________________________________________________

.feature --> cucumber tests will be in this type of file
_________________________________________________

# --> comment sign in .feature
_________________________________________________

CukesRunner --> class name, where we run Cucumber file

Feature: keyword is placed on top of the .feature file, used to describe what functionality
		is being tested in this .feature file
Scenario: keyword - means test case in cucumber
_________________________________________________

@RunWith(Cucumber.class) --> runs .feature file  Comes from jUnit API
Step Definitios --> for each step/line in the scenario, cucumber generated matching java method
	known as step definition for the cucumber step.
	@When("I meet([^\"]*)") --> step definition
_________________________________________________

@CucumberOption --> tag used to customizethe running of the cucumber tests
dryRun --> cucumber option to turn on/off the actual execution.
		druRun = true -> cucumber will not execute the test, only check if cucumber steps are 
						implementedor not. If there are any unimplemented steps the step 
						definitions will be generated for those unimplemented steps.
_________________________________________________




















