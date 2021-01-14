package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	static WebDriver driver;
	public void hitUrl() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver(); 
driver.get("https://www.propertycapsule.com/");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
System.out.println(driver.getCurrentUrl());	
	}
}
