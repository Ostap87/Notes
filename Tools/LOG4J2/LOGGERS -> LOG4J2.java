LOGGERS -> LOG4J2
-----------------

Logs is very important part of applications and it keeps each step/event happened with timestamp.

Normally logs are written programmatically into .log file.

There are ready tools / libraries to add to any framework or application.

in Java, the most famous logging library/framework is LOG4J from apache.

Purpose of logs is to help us debug the issues that you may have with application.

Sometimes when a bug is found in application, developers firstly check the logs. 
In order to see which steps the user was taking and application did not behave as expected.

Logs may help you find the source of the problem.
================================================

LOG4J IN JAVA.

What is the role of logs in Test automation?

We are looking at console or html report to see the status of our test runs. If anything fails, we find from there.
If we implement logging into our framework, it will be another way of looking at automation execution steps and will help us find the problem whever our test fail.
======================================

1) add dependencies from Maven Central Repo : log4j

2) Configuration of Log4j -> log4j2.properties

3) Implementation of Log4j
=======================================

Normally servers that applications are running are linux.

Search for specific pattern in logs and analyze.

=======================================

How do you do reporting in your framework?

1) I run my tests using jenkins and the html based cucumber report is 
automatically added to jenkins for my review.

2) I use testng runner and it generates html report every time I execute my tests.

3) On top of html reports , my framework also configured to do logging using log4j tool.

Anytime I can check logs and see steps and how there were executed.
--------------------------

How do you keep/track test execution history?

1) Jenkins saves each report from each build and I can go there and verify.

2) My framework backs up old html reports into a different folder with timestamp each time we execute tests.

3) my framework configured to do logging using log4j tool.
And it saves logs for each execution.
=========================================

1) add dependencies from Maven Central Repo : log4j

2) Configuration of Log4j -> log4j2.properties

3) Implementation of Log4j
==========================================


APPENDERS -> Where do you want to write the log messages?
ex: console, rolling
1) Write messages to console 
rolling -> into a file
html -> write into html document

How do you control to which file to write logs?

We can specify in log4j2.properties file

property.filename=logs/automation.log

LEVEL OF LOGGING:

FATAL - ERROR - WARN - INFO - DEBUG - TRACE

 

TRY WITH RESOURCES -> IT WILL AUTOMATICALLY CLOSE ANY OPEN CONNECTIONS/FILES....

YOU DONT NEED TO MANUALLY CLOSE IT.

CONNECTION.CLOSE()
=====================================