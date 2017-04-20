package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/*Go to the homepage and verify its title.
Click REGISTER and verify the title of its target page.
Go back to the homepage and verify if it still has the correct title.
Click SUPPORT and verify the title of its target page.
Go back to the homepage and verify if it still has the correct title.
*/
public class TestNg {
	
	public static String url = "http://newtours.demoaut.com/index.php";

	@BeforeMethod
	
	public void Open_browser(){

		public static WebDriver driver = new FirefoxDriver();
		driver.get(url);
	}
	
	
@Test(priority=0)

public void set_up {

	String expected ="Welcome: Mercury Tours";
	String actual = driver.getTitle();

		Assert.assertEquals(actual, expected);
	
  }


@Test(priority=1)
public void Register(){
	driver.findElement(By.linkText("REGISTER"));
	String expected ="Register: Mercury Tours";
	String actual = driver.getTitle();
	Assert.assertEquals(actual, expected);
	
}

@Test
public void Re_Test(){
	String expected ="Welcome: Mercury Tours";
	String actual = driver.getTitle();

		Assert.assertEquals(actual, expected);
	
	
}

}
