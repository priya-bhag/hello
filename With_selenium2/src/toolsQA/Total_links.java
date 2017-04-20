package toolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Total_links {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com/");


java.util.List<WebElement> Links = driver.findElements(By.tagName("a"));

int total =Links.size();
System.out.println(total);
for(int i=0; i<=total;i++){
	System.out.println(Links.get(i).getText());
}


/*List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
int total_check=checkBox.size();
System.out.println(total_check);
for(int j=1;j<=total_check;j++){
	System.out.println(checkBox.get(j).getText());
}*/

//dropdown = driver.findElements(By.tagName("select")); 
// textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"))



	}

}
