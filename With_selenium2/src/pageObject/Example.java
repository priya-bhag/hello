package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.gson.JsonObject;

public class Example {
	public class LoginLogoutPage extends Page {
		
		public static By mainmenu_button = By.cssSelector("button.navbar-toggle");
		public static By logout_link = By.xpath("//a[contains( text(), 'Logout')]");
		public static By logoutyes = By.xpath("//button[contains( text(), 'Yes')]");
		public static By logoutNo = By.xpath("//button[contains( text(), 'Yes')]");
		public static By payment_link= By.linkText("Make Payments");
	    public static By payment_menu = By.xpath(".//*[@id='offcanvas-menu']/div/ul/li[3]/a"); 
	    public static By formentry_link= By.linkText("Form Entry");
	    public static By reporting_menu = By.xpath(".//*[@id='offcanvas-menu']/div/ul/li[2]/a");
		public static By signin_link =By.xpath(".//a[@href='/TDR/internaluser_search.html']");
		public static By report_button = By.xpath("//span[contains( text(), 'REPORT SALES')]");
		public static By accept_button = By.xpath("//button[contains( text(), 'Accept')]");
		public static By acceptno_button = By.xpath("//button[contains( text(), 'Cancel')]");
		
		public LoginLogoutPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected boolean isLoaded() {
			System.out.println(driver.getTitle());
			return driver.getTitle().equalsIgnoreCase("Home");
		}

		@Override
		protected void load() {
				 driver.get(LoadProperties.getProperty("web.url"));			
					   driver.getTitle().equalsIgnoreCase("Home");	 
					   Assert.assertEquals(true,
							   driver.getTitle().equalsIgnoreCase("Home"));
			 System.out.println("Vendor is on TDR Vendor Home Page");
	}
		
		 public boolean isElementPresent(By by) {
			  try {
			   driver.findElement(by);
			   return true;
			  } catch (org.openqa.selenium.NoSuchElementException e) {
			   return false;
			  }
	}

		 public void checkPageIsReady() { 
			 	JavascriptExecutor js = (JavascriptExecutor)driver; 
			 	if (js.executeScript("return document.readyState").toString().equals("complete")){ 
			 	
			 	for (int i=0; i<25; i++){ try { Thread.sleep(1000); }catch (InterruptedException e) {} 
			 	if (js.executeScript("return document.readyState").toString().equals("complete")){ break; } } } }
		 
		 public void clickLogout(){
		  	  
			  checkPageIsReady();
			 WebElement submit= driver.findElement(logout_link); 			
		     (new WebDriverWait(driver, 40)).until(ExpectedConditions.elementToBeClickable(logout_link));
		     submit.click();		     
		     WebElement yes= driver.findElement(logoutyes);   
		     (new WebDriverWait(driver, 40)).until(ExpectedConditions.elementToBeClickable(logoutyes));
		   	 yes.click();
		    /* WebElement no= driver.findElement(submitno);   
		     (new WebDriverWait(driver, 40)).until(ExpectedConditions.elementToBeClickable(submitno));
		   	 no.click();*/
		  } 
		 
		 public void paymentPage() throws InterruptedException {
			 
			 WebElement main = (new WebDriverWait(driver, 20))
					   .until(ExpectedConditions.visibilityOfElementLocated(mainmenu_button));

					  JavascriptExecutor js = (JavascriptExecutor) driver;
					  js.executeScript("var evt = document.createEvent('MouseEvents');" +
					   "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", main);
	Thread.sleep(500);
					  WebElement report = (new WebDriverWait(driver, 10))
					   .until(ExpectedConditions.elementToBeClickable(payment_menu));

					  js.executeScript("var evt = document.createEvent('MouseEvents');" +
					   "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", report);

					  Thread.sleep(500); // report.click();

					  WebElement report1 = (new WebDriverWait(driver, 10))
					   .until(ExpectedConditions.elementToBeClickable(payment_link));

					  js.executeScript("var evt = document.createEvent('MouseEvents');" +
					   "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", report1);
			System.out.println(driver.getTitle());
					  Assert.assertEquals(true,
					   driver.getTitle().equalsIgnoreCase("Payment"));
		 }
		 
		  public void portalPage(){
			  PageUtil.checkPageLoad(driver);
			  checkPageIsReady();
			  Assert.assertEquals(true,
					   driver.getTitle().equalsIgnoreCase("TDR Portal"));
		   	 
		  }
		  
			 public void formEntryPage() throws InterruptedException {
				 
				 WebElement main = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.visibilityOfElementLocated(mainmenu_button));

						  JavascriptExecutor js = (JavascriptExecutor) driver;
						  js.executeScript("var evt = document.createEvent('MouseEvents');" +
						   "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", main);
		Thread.sleep(500);
						  WebElement report = (new WebDriverWait(driver, 10))
						   .until(ExpectedConditions.elementToBeClickable(reporting_menu));

						  js.executeScript("var evt = document.createEvent('MouseEvents');" +
						   "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", report);

						  Thread.sleep(500); // report.click();

						  WebElement report1 = (new WebDriverWait(driver, 10))
						   .until(ExpectedConditions.elementToBeClickable(formentry_link));

						  js.executeScript("var evt = document.createEvent('MouseEvents');" +
						   "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", report1);
				System.out.println(driver.getTitle());
						  Assert.assertEquals(true,
						   driver.getTitle().equalsIgnoreCase("Data Entry"));
			 }
			 
			public void internalPage(){
				
				 driver.get(LoadProperties.getProperty("web.url"));			
		          driver.navigate().to("https://gsar1.karsun-csb.com:49014/TDR/internaluser_search.html");
		          String url= driver.getCurrentUrl();
					System.out.println(url);
			}
			
			public void tdrPortal() {
				driver.get(LoadProperties.getProperty("web.url"));
				 String tdr = driver.getCurrentUrl();
					String[] portal =tdr.split("/TDR");
					System.out.println(portal[0]);
					String page = portal[0];
					String portalpage = page.concat("/index.html");
					System.out.println("Vendor page is " + portalpage + " Prortal Page");
					driver.get(portalpage);
			}
			
			 public void clickSignIn() throws InterruptedException{
			  	  
				  checkPageIsReady();
				 WebElement submit= driver.findElement(signin_link); 			
			     (new WebDriverWait(driver, 40)).until(ExpectedConditions.elementToBeClickable(signin_link));
			     
			     Actions click = new Actions (driver);		     
			     click.moveToElement(driver.findElement(signin_link)).doubleClick().build().perform();
			     
			     Thread.sleep(1000);
			    		 
			     //submit.click();	
		  } 

			 public void clickReport() throws InterruptedException{
			  	  
				  checkPageIsReady();
				 WebElement submit= driver.findElement(report_button); 			
			     (new WebDriverWait(driver, 40)).until(ExpectedConditions.elementToBeClickable(report_button));
			     
			     Actions click = new Actions (driver);		     
			     click.moveToElement(driver.findElement(report_button)).doubleClick().build().perform();
			     
			     Thread.sleep(1000);
			     //submit.click();	
			     }
			
			 public void assertPopUp(JsonObject obj) {
				 
				 checkPageIsReady();	 
				  PageUtil.checkPageLoad(driver);
				  
		Assert.assertTrue(driver.findElement(By.cssSelector(".modal-note")).isDisplayed());	
		
							PageUtil.checkPageLoad(driver);		
			       String popupmessage=obj.get("message").getAsString();
			       WebElement balance = (new WebDriverWait(driver, 40))
			       		  .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-note")));
			       String message= driver.findElement(By.cssSelector(".modal-note")).getText();
			       
			       if (message.contains(popupmessage)){
			    	   Assert.assertTrue(true);	   
			       }
			       
			 }
			 public void acceptTerms() throws InterruptedException{
			  	  
				  checkPageIsReady();
				  
					Assert.assertTrue(driver.findElement(accept_button).isDisplayed());	
					Assert.assertTrue(driver.findElement(accept_button).isEnabled());	

				 WebElement submit= driver.findElement(accept_button); 			
			     (new WebDriverWait(driver, 40)).until(ExpectedConditions.elementToBeClickable(accept_button));	
			     Thread.sleep(500);
			     submit.click();
			     
			 }
			 
			 public void declineTerms() throws InterruptedException{
			  	  
				  checkPageIsReady();
				  
					Assert.assertTrue(driver.findElement(acceptno_button).isDisplayed());	
					Assert.assertTrue(driver.findElement(acceptno_button).isEnabled());	

				 WebElement decline= driver.findElement(acceptno_button); 			
			     (new WebDriverWait(driver, 40)).until(ExpectedConditions.elementToBeClickable(acceptno_button));	
			     Thread.sleep(500);
			     decline.click();
			     
			 }
			 public void assertVendorPage() {
				 
				 checkPageIsReady();	
				 
				 Assert.assertEquals(true,
						   driver.getTitle().equalsIgnoreCase("DUNS Search"));
		 System.out.println("Vendor is on TDR Vendor Home Page");
		 System.out.println(driver.getTitle());
			 }
			 
				public void tdrInternalPortal() {
					//driver.get(LoadProperties.getProperty("web.url"));
			          driver.navigate().to("https://gsar1.karsun-csb.com:49014/TDR/internaluser_search.html");
					 String internaluser = driver.getCurrentUrl();
						String[] portal =internaluser.split("/TDR");
						System.out.println(portal[0]);
						String intern = portal[0];
						String internalpage = intern.concat("/index.html");
						System.out.println("Vendor page is " + internalpage + " Portal Page");
						driver.get(internalpage);
				}
				 public void assertVendorInternPage() {
					 
					 checkPageIsReady();	
					 
					 Assert.assertEquals(true,
							   driver.getTitle().equalsIgnoreCase("DUNS Search"));
			 System.out.println("Vendor is on TDR Internal Home Page");	 
				 }		 
	}

}
