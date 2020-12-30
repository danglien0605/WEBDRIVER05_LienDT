package java_API;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class topic_01_checkenv {
	WebDriver webdriver;
  @Test
  public void checkURL_and_title() {
	 String title = webdriver.getTitle();
	 AssertJUnit.assertEquals(title, "Guru99 Bank Home Page");
  }
  @BeforeClass
  public void beforeClass() {
	  webdriver  = new ChromeDriver();
	  webdriver.get("http://demo.guru99.com/V4/");
	  webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  webdriver.manage().window().maximize();
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  webdriver.quit();
  }

}
