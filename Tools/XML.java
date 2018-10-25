			====================== XML ======================

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="Loan Department" verbose="2">

	<test name="Personal Loan">

	<packages>
		<packages name = "packageName"/> //->Regression test(to run all tests in pacakage)
	</packages>

		<classes>
			ex.//<class name ="packageName.className">
			<class name ="test.day1">
			
			<methods>
			<exclude name = "methodName" /> //->removing methods from test execution
			<include name = "methodName" /> //->adding methods for testing
			<exclude name = "firstWordFromMethodName.*" /> //-> eliminate all methods with this part name 
			</methods>
			</class>
			
		</classes>
	</test>

</suite>
'

Follow to the convention begin all methods names with keyword what functionality we working on

====================================================================
@Test(groups={"Smoke"}) //->put tag after each @Test needs to be execute 
	public void test1{

	}
__________________________________________________

<test name="Personal Loan">

	<groups>
		<run>
			<include name = "Smoke"/>
		//	<exclude name = "Smoke"/> 
		</run>
	</groups>
		
</test>
====================================================================
@Test(dependsOnMethods = {"nameOfNeededMethod"})
// ->means current method will execute after "nameOfNeededMethod"
__________________________________________________
@Test(enabled = false/true) 
// ->skip current execution or run agane
__________________________________________________
@Test(timeOut = 400)
__________________________________________________
Parameterizing Testcases
// -> avoid hard coding(like .properties)
@Parameters({"URL", "userName"})
@Test
public void googleLogin(String urlName, String userName){}
- - - - - - - - - - - - 
<parameter name = "URL", value = "google.com"/>
<parameter name = "userName", value = "Alex "/>
-->location can be inside of <suite> or <test>
Multible Parameterizing Testcases
@DataProvider
public Object[][] getData(){
	//1 -> userName,password - good credit history
	//2 -> userName,password - no credit history
	//3 -> userName,password - bag credit history
	Object [][]data = new Object[3][2]
// --> [3]-3 combinations/[2]-2 values in each combination
	//1 -> set combination
	data[0][0] = "firstSetUpUserName";
	data[0][1] = "password";
	//2 -> set combination
	data[1][0] = "secondSetUpName";
	data[1][1] = "secondPassword";
	//3 -> set combination
	data[2][0] = "thirdSetUpName";
	data[2][1] = "thirdPassword";
	return data;
}
@Test(DataProvider = "getData")
	public void test55(String a, String b){
}


'
RUNNING FROM COMMAND LINE

To run the test using cmd we enter command :
    
    mvn test
sequence of calls when we run testng test using command line:
    
    1. mvn test --> this command run the pom xml

    2. in the pom xml we have a plugin called maven-surefire-plugin 
    which is pointing to testng_runner.xml. That means pom xml will 
    trigger testng_runner.xml 
        <suiteXmlFile>testng_runner.xml</suiteXmlFile>


    3. testng_runner.xml will run all the tests inside the test tag.
        <test name="Order smoke tests">
        <packages>
            <package name="com.cbt.tests.order"/>
        </packages>
    </test>


__________________________________________________

<build>
	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-surefire-plugins</artifactId>
			<version>2.21.0</version>
			<configuration>
				<suiteXmlFiles>
					<suiteXmlFile>testng_runner.xml</suiteXmlFile>
				</suiteXmlFiles>
		</plugin>
	</plugins>
</build>

<suiteXmlFile>${runner}</suiteXmlFile> -> means going to use String variable called runner
${runner} --> variable with name. runner needs to be passed from terminal.
Passing the smoke test runner as parameter to pom file:
mvn test -Drunner = smoke_test_runner.xml

















