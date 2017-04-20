package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*Go to the homepage and verify its title.
Click REGISTER and verify the title of its target page.
Go back to the homepage and verify if it still has the correct title.
Click SUPPORT and verify the title of its target page.
Go back to the homepage and verify if it still has the correct title.
*/
public class TestNg_class1
{
public static String url = "http://newtours.demoaut.com/index.php";
public static WebDriver driver =new FirefoxDriver();
public String Expected =null;
public String Actual=null;

@BeforeTest
public void Start(){
	driver.get(url);
}

@Test(priority=1)
public void verify_title_homePage() throws InterruptedException{
	 Expected ="Welcome: Mercury Tours";
Actual = driver.getTitle();

		Assert.assertEquals(Actual, Expected);
		Thread.sleep(10);
		}



@Test(priority=2)
public void Register() throws InterruptedException{
	driver.findElement(By.linkText("REGISTER")).click();;
Expected ="Register: Mercury Tours";
Actual = driver.getTitle();
	Assert.assertEquals(Actual,Expected);
	Start();
verify_title_homePage();
Thread.sleep(10);
}




@Test(priority=3)
public void support() throws InterruptedException{
	driver.findElement(By.linkText("SUPPORT")).click();;
	Expected ="Under Construction: Mercury Tours";
	Actual = driver.getTitle();
		Assert.assertEquals(Actual, Expected);
		Start();
		verify_title_homePage();
		Thread.sleep(10);
}










	

}
