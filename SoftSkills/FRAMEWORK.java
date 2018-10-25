		================== FRAMEWORK ==================

Programing language
Types of framework
Test base class
Page Object Design Model
Functions(utility classes)
Property files
TestNG(what annotations using)
Parametarization usig excel files
How capture screenShots
Sending emails(generate reports)
Version control(git)
Continious integration tools(Jenkins)


In our Selenium project we are using Java language, even Selenium WD compartible with 
multiple programing languages we are using Java just because most of automations 
developers has knowledge on Selenium with Java.
Also, we use Data Drive Project by using Page Object Model Design patern with 
PageFactory(for initializing webElements). With POM we have maintain the class for
every web page. Each web page has a separate class which holds a functionality and 
members of the web page. 
In my current project I have separate packages for every individual group of classes. 
In src/test/java = I have: 'pages, utility, runner, step definitions'-packages, 
where all of related classes are located. Under src/test/resources = all '.feature' 
files and testData are stored.
--
I use TestNG annotations for assertions, grouping, parallel executions.
I use Maven for build execution and dependency purpose. Integrated the TestNG dependency
in pom.xml file and run it using Jenkins.
In my project we use Git as a repository to store our test scripts on a GitHub
development platform.
Also, by using Jenkins continious integration tool we execute test cases on daily bases
and nighty execution - base on the schedule. Test result send to my email.
For the reporting purpose I use Extent Reports - it is generate beautiful HTML report
with failing screenShots report.

========================================================================================

My current framework build with Java programing language. Also, we use Hybrid Data Driven
which include DD and BD frameworks by using POM design patern.



----------------------------------------
Maven -> management buildind tool.
A Project Object Model or POM is the fundamental unit of work in Maven. 
It is an XML file that contains information about the project and 
configuration details used by Maven to build the project.

 -dependencies(cucumber, selenium, apachi POI, testNG, JUnit, JDBC);
 -properties-to update JDK to 1.8 Version;
 -plugins for reporting, running tests throught terminal, connect to Jenkins;
 -repositories.
-----------------------------------------
Page Object Model POM 
 -enhancing test maintenance;
 -reducing code duplication;
 -avoiding hard coding. 
------------------------------------------
TestNG and JUnit - is a unit testing framework for the Java programming language
------------------------------------------
Parametarization - reading of Excel file
------------------------------------------
Reports - use HTML report, doing screenShots and email from Jenkins
------------------------------------------

			> DESIGN paterns <
Singleton Design Pattern - constructor has the private access modifier. Avoiding to
create new instance. Driver class.















