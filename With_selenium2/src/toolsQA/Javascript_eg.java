package toolsQA;




	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Javascript_eg { {

	public static void main(String[] args) throws InterruptedException {

	// Open Firefox browser
	FirefoxDriver driver=new FirefoxDriver();

	// Maximize the window
	driver.manage().window().maximize();

	// Open applicatiion
	driver.get("enter your application URL");

	// This will execute JavaScript in your script
	((JavascriptExecutor)driver).executeScript("document.getElementById('enter your element id').click();");

	}

	}

}
