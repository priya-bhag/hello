package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Refresh {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/");
Thread.sleep(5);

driver.navigate().refresh();
driver.findElement(By.id("lst-ib")).sendKeys(Keys.F5);
driver.get(driver.getCurrentUrl());
driver.navigate().to(driver.getCurrentUrl());
driver.findElement(By.id("lst-ib")).sendKeys("\uE035");

	}
	}
