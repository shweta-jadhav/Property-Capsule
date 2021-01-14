package homePage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TC_15_VerifyContactUsLink extends Launch{
  @Test
  public void VerifyContactUsLink() {
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  driver.findElement(By.linkText("Contact Us")).click();

	  WebElement formHead= driver.findElement(By.xpath("//h2[@class=\"contact-us-header-title\"]"));
	  System.out.println(formHead.getText());
	  Assert.assertEquals(formHead.getText(), "Want in? Contact us.","Invalid Form");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  TC_15_VerifyContactUsLink cn=new TC_15_VerifyContactUsLink();
	  cn.hitUrl();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
