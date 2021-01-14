package homePage;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TC_04_VerifyMapMakeTab extends Launch {
  @Test
  public void VerifyMapMakeTab() {
	  driver.findElement(By.linkText("Map Maker")).click();
		driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS);
		for(String MapWindowHandle:driver.getWindowHandles())
		{
			driver.switchTo().window(MapWindowHandle);	
			System.out.println(driver.getCurrentUrl());
			Assert.assertEquals(driver.getCurrentUrl(),"https://maps.propertycapsule.com/","Invalid page");
		
	
		}
		
  
  
  }
  @BeforeMethod
  public void beforeTest() {
	  TC_04_VerifyMapMakeTab mm=new TC_04_VerifyMapMakeTab();
	  mm.hitUrl();
  }


  @AfterMethod
  public void afterTest() {
	  driver.quit();
  }

}
