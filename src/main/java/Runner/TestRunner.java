package Runner;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {


        // Load the XML suite
        List<String> suites = new ArrayList<>();
        suites.add(System.getProperty("user.dir")+"\\testng.xml");
        // Create a TestNG instance
        TestNG testng = new TestNG();

        // Set suites to be executed
        testng.setTestSuites(suites);

        // Run the tests
        testng.run();
//java -jar ContinousIntegration-1.0-SNAPSHOT-jar-with-dependencies.jar
        //java -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
        //java -cp ContinousIntegration-1.0-SNAPSHOT-tests.jar Demo.TestCaseUI
    //java -Denvironment=RT -DgroupName=Test1 -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
    //java -Denvironment=RT -DgroupToRun=Test1 -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
    //java -Denvironment=RT -DmethodName=Test1 -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
    //java -Denvironment=RT -DmethodName=Test1,Test2 -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
    }

}