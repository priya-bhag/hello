package toolsQA;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestNG_DataDriven {
	
	

		public static WebDriver driver;
		
		
		
		@Test (dataProvider = "testData")
		
		public void adminLogin (String uname, String pwd){
			
		driver = new FirefoxDriver();
		
		driver.get("http://gcrit.com/build3/admin/");
		
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("tdb1")).click();
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
		if (s.contains("http://www.gcrit.com/build3/admin/index.php")){
		System.out.println("Login Successful");
		}
		else
		{
		System.out.println("Login Unuccessful");	
		}
		}
		
		@AfterMethod
		
		public void closeBrowser(){
		driver.close();	
		}
		
		@DataProvider (name = "testData")
		
		public Object [] [] readExcel() throws BiffException, IOException{
			
		File f = new File ("C:/Users/gcreddy/Desktop/Input.xls");
		
		Workbook w = Workbook.getWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
		
		int columns = s.getColumns();
		
		int rows = s.getRows();
		
		//System.out.println(columns +", " + rows);

		String inputData [] [] = new String [rows] [columns];

		for (int i=0; i < rows; i++){
			for (int j = 0; j < columns; j++){
			   Cell c = s.getCell(j, i);
			    inputData [i] [j] = c.getContents();
			    //System.out.println(inputData[i][j]);
			}
		}
		return inputData;

		}
		}


