package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import CommonPage.HistoWebsiteCommon;
import Pages.DonorPage;
import Pages.PatientPage;

public class TestCase extends HistoWebsiteCommon{
    
	
	@Test
	
	public void RunTestCase () throws InterruptedException, IOException {
		
		PatientPage PatObj = new PatientPage();
		
		PatObj.RunPatientDetails();
		
		DonorPage DonObj = new DonorPage();
		
		DonObj.closewebsite();
	
	
		
		

	}

}
