package homePage;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TC_02_VerifyEntLoginBtn extends Launch {
  @Test
  public void VerifyEntLoginBtn() {
	  
	  driver.findElement(By.linkText("Enterprise Admin Login")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://propertycapsule.com/property/admin/login/form","Invalid Page");
	  
	  
  }
  @BeforeMethod
  public void beforeTest() {
	  TC_02_VerifyEntLoginBtn enbtn=new TC_02_VerifyEntLoginBtn();
	  enbtn.hitUrl();
	  
  }

  @AfterMethod
  public void afterTest() {
	 driver.quit();
  }
  

}
