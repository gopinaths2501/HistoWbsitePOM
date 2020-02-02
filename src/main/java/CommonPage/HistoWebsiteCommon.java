package CommonPage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HistoWebsiteCommon {
	
	    public static ChromeDriver driver;
	
	       @BeforeMethod
	    
		   public void RunWebSite(String[] args) throws InterruptedException, IOException {
			
	        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://clients.histogenetics.com/ClientService/Patient");
			
			//driver.get("https://www.histogenetics.com/");
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
		
			Thread.sleep(2000);
	         
			driver.findElementByXPath("//a [text()='Log in']").click();
			
			Thread.sleep(1000);
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			windowHandles.size();
			
			System.out.println(windowHandles);
			
			List<String> ListOfWindows = new ArrayList<>();
			
			ListOfWindows.addAll(windowHandles);
			
			driver.switchTo().window(ListOfWindows.get(1));
			
			Thread.sleep(1000);
	          
			
			  driver.findElementById("txtUserName").sendKeys("HistoIndia");
			  
			  driver.findElementById("txtPassword").sendKeys("Histoindia123$");
			 
		      driver.findElementById("ImgSignIn").click();
				        	
		      Thread.sleep(1000);
	    }
		  
	         
				  
		}
