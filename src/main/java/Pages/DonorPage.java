package Pages;

import CommonPage.HistoWebsiteCommon;

public class DonorPage extends HistoWebsiteCommon {
	 
     public DonorPage closewebsite()
     
     {
   	  driver.close();
   	  
   	  return new DonorPage();
   	  
     }

}
