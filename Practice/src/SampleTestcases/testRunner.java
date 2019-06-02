package SampleTestcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class testRunner 
{
public static void main(String[] args) {
	
	TestNG runner= new TestNG();
	
	List<String> list= new ArrayList<String>();
	
	list.add("C:\\Users\\altaf\\eclipse-workspace-practice\\Practice\\test-output\\Default suite\\testng-failed.xml");
	 
	runner.setTestSuites(list);
	
	runner.run();
	
}
	
	
}
