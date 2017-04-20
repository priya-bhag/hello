package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over_facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
		
		//create webdriver object
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions builder = new Actions(driver);
		
WebElement txt_user = driver.findElement(By.id("email"));
		
		Action mouse_over = builder
				.moveToElement(txt_user)
				.click()
				//.keyDown(txt_user, Keys.SHIFT)
				.sendKeys("priya")
				//.keyUp(txt_user,Keys.SHIFT)
				.doubleClick(txt_user)
				.contextClick()
				.build();
				mouse_over.perform();
		
		
	}

}
