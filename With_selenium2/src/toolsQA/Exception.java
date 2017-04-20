package toolsQA;

public class Exception {
	
	driver.switchTo().Frame("name");
	driver.switchTo().alert().accept();
	driver.switchTo().widow("name");
	Example:-
	WebElement element=driver.findElement(By.id("username"));// Element is available in parent window
	driver.switchTo().window(Child_Window);//Switch to Child Window
	element.sendKeys("Mukesh");//perform the action on the element which is not visible in the child window

try
 
{
 
 // Code which can throw exception
 
 }
 
 catch(ExceptionClass objectname)
 
 {
 
 // Take necessary actions when exception come
 
 }


