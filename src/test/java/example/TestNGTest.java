package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;;
public class TestNGTest {
  private WebDriver driver;
  @Test
  public void test() {
	  driver.get("http://www.baidu.com");
	  String title=driver.getTitle();
	  AssertJUnit.assertTrue(title.contains("百度一下"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
