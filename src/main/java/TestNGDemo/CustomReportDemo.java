package TestNGDemo;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class CustomReportDemo implements IReporter {
	public void GenerateReport(List<XmlSuite> xmlSuites,List<ISuite> suites, String outputDirectory) {
		
			for(ISuite suite: suites) {
				String suite_name = suite.getName();
				Map<String, ISuiteResult> suiteResults = suite.getResults();
				for(ISuiteResult is: suiteResults.values()) {
					ITestContext testContext = is.getTestContext();
					int passed_count = testContext.getPassedTests().getAllResults().size();
					int failed_count = testContext.getFailedTests().getAllResults().size();
					System.out.println("Total tests passed:" + passed_count);
					System.out.println("Total tests failed:" + failed_count);
					
				}
			}
		
		    
	}
}
