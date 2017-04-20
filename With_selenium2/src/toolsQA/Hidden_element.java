package toolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_element {

	public static void main(String[] args) {

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		
		
	int x =	driver.findElement(By.id("male")).getLocation().getX();
		
	
	int y =	driver.findElement(By.id("male")).getLocation().getY();

System.out.println(x);
System.out.println(y);

List<WebElement> e=driver.findElements(By.id("male"));

for (int i=0;i<e.size(); i++){
WebElement element = e.get(i);
	
int z = element.getLocation().getX();

if(z!=0){
	
	e.get(i).click();
	break;
}

}


		
	}

}
