package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CommonPage.HistoWebsiteCommon;

public class PatientPage extends HistoWebsiteCommon {
	
	
	public PatientPage RunPatientDetails() throws InterruptedException, IOException
	{
	
	 WebElement SpecimenType = driver.findElementById("HistoNewContentPlaceHolder_ddlSpecimenTypePatientView");
	  
	  Select Specimen1 = new Select(SpecimenType);
	  
	  Specimen1.selectByValue("DNA");
	
	  
	  WebElement drawnon = driver.findElement(By.id("HistoNewContentPlaceHolder_txtDtDrawnOnPatient"));
	  drawnon.sendKeys("01/08/2020");
	  drawnon.sendKeys(Keys.TAB);
	  Thread.sleep(1000);

      
    driver.findElementById("HistoNewContentPlaceHolder_txtMRNoPatient").sendKeys("ECG147");
    
    driver.findElementById("HistoNewContentPlaceHolder_txtLastNamePatient").sendKeys("John");
    
    driver.findElementById("HistoNewContentPlaceHolder_txtFirstNamePatient").sendKeys("Stephen");
    
    
    
    WebElement Gender = driver.findElementById("HistoNewContentPlaceHolder_ddlGenderPatient");
    
    Select GenderCat = new Select(Gender);
    
    GenderCat.selectByValue("Female");
    
    
    
    driver.findElementById("HistoNewContentPlaceHolder_txtPhysicianPatient").sendKeys("MichalGeorge");
    
    
    
	
	  WebElement Ethinicity =
	  driver.findElementById("HistoNewContentPlaceHolder_ddlPatientRacePatient");
	  
	  Select EthinicityTyo = new Select(Ethinicity);
	  
	  EthinicityTyo.selectByValue("18");
	 
    
    
    driver.findElementById("HistoNewContentPlaceHolder_txtDiagnosisPatient").sendKeys("UnPredictable");
    
    
    WebElement HLAGeneA = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_0_ddl0");
    
    Select HLAGeneResolA =new Select(HLAGeneA);
    
    HLAGeneResolA.selectByVisibleText("1X");
    
    
    WebElement HLAGeneB = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_1_ddl1");
    
    Select HLAGeneResolB =new Select(HLAGeneB);
    
    HLAGeneResolB.selectByVisibleText("1X");
    
    
    WebElement HLAGeneC = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_2_ddl2");
    
    Select HLAGeneResolC =new Select(HLAGeneC);
    
    HLAGeneResolC.selectByVisibleText("1X");
    
    
    WebElement HLAGeneDRB1 = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_3_ddl3");
    
    Select HLAGeneResolDRB1 =new Select(HLAGeneDRB1);
    
    HLAGeneResolDRB1.selectByVisibleText("1X");
    
    
    WebElement HLAGeneDRB345 = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_4_ddl4");
    
    Select HLAGeneResolDRB345 =new Select(HLAGeneDRB345);
    
    HLAGeneResolDRB345.selectByVisibleText("None");
    
    
    WebElement HLAGeneDQB1 = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_5_ddl5");
    
    Select HLAGeneResolDQB1 =new Select(HLAGeneDQB1);
    
    HLAGeneResolDQB1.selectByVisibleText("1X");
    
    
    WebElement HLAGeneDPB1 = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_7_ddl7");
    
    Select HLAGeneResolDPB1 =new Select(HLAGeneDPB1);
    
    HLAGeneResolDPB1.selectByVisibleText("1X");
    
    
    driver.findElementById("HistoNewContentPlaceHolder_txtCarrier").sendKeys("Fedex");
    
    driver.findElementById("HistoNewContentPlaceHolder_txtTrackingNo").sendKeys("9047237353");
    
    
    //driver.findElementByXPath("//label [@for='HistoNewContentPlaceHolder_rdbYes']").click();
    
    //driver.findElementById("HistoNewContentPlaceHolder_imgSubmit").click();
    
    Thread.sleep(1000);
    
  
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	
	File dest = new File ("./sanps/snap01.png");
	
	FileUtils.copyFile(screenshotAs, dest);
	
	Thread.sleep(1000);
	
	System.out.println("Please enter the all the required mandatory field");
	
	return new PatientPage();

}

}

