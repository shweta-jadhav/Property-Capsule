package homePage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TC_08_VerifyLookFamiliarImage extends Launch {
  @Test
  public void VerifyLookFamiliarImage() {
	  
	  WebElement element= driver.findElement(By.xpath("//div[contains(text(),\"Look familiar?\")]/parent::div//..//parent::div[contains(@class,\"section-container\")]/div/div[@class=\"section-image\"]/img"));
	  String path=element.getAttribute("src");
	  System.out.println(path);
	  Assert.assertEquals(path, "https://www.propertycapsule.com/assets/images/Loo%20Familiar.png","Wrong image displayed");
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  TC_08_VerifyLookFamiliarImage ig=new TC_08_VerifyLookFamiliarImage();
	  ig.hitUrl();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
