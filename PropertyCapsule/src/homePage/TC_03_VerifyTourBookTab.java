package homePage;

import org.testng.annotations.Test;


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TC_03_VerifyTourBookTab extends Launch{
  @Test
  public void VerifyTourBookTab() {
	  driver.findElement(By.linkText("Tourbooks")).click();
	  Set<String> handler=driver.getWindowHandles();
	  Iterator<String> it= handler.iterator();
	  String ParentWindowId=it.next();
	  System.out.println("Parent Window Id:"+ParentWindowId);
	  
	  String ChildWindowId=it.next();
	  System.out.println("Child Window Id:"+ChildWindowId);
	  driver.switchTo().window(ChildWindowId);
	  System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://tours.propertycapsule.com/", "Invalid Page");
	  
	  
	  
	  
		
		  }
  @BeforeMethod
  public void beforeTest() {
	  TC_03_VerifyTourBookTab tb=new TC_03_VerifyTourBookTab();
	  tb.hitUrl();
	   }
  
  @AfterMethod
  public void afterTest() {
	  driver.quit();
	  
  }

}
