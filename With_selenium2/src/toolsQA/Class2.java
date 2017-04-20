package toolsQA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	@BeforeClass
	public void login1(){
	System.out.println("Login_class Successful");
	}
	@AfterClass
	public void logout1(){
	System.out.println("Logout_class Successful");
	} 
	@BeforeTest
	public void login(){
	System.out.println("Login Successful");
	}
	@AfterTest
	public void logout(){
	System.out.println("Logout Successful");
	} 
	@Test (priority =1)
	public void addVendor(){
	System.out.println("Add Vendor Successful");
	}
	@Test (priority =2)
	public void addProduct(){
	System.out.println("Add Product Successful");
	}
	@Test (priority =3)
	public void addCurrency(){
	System.out.println("Add Currency Successful");
	}
		}


