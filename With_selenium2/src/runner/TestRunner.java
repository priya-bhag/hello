package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;



//running failed testcase ...the failed test case will be in the folder 
public class TestRunner {
	
	public static void main(String [] args){
		
		
		TestNG runner = new TestNG();
		
		List<String> list = new ArrayList<String>();
		
		list.add("//Users//rameshpriya//Documents//workspace//With_selenium2//test-output//smoke//testng-failed.xml");
		
		
		runner.setTestSuites(list);
		
		runner.run();
	

}
}