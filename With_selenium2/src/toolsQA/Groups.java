package toolsQA;

import org.testng.annotations.Test;

public class Groups  {
	 
	@Test (groups = {"sanity", "regression"}, priority =1)
	public void login(){
	System.out.println("Login Successful");	
	}
	@Test (groups = {"sanity", "smoke"}, priority =6)
	public void logout(){
	System.out.println("Logout Successful");	
	}
	@Test (groups = {"sanity"}, priority = 2)
	public void search(){
	System.out.println("Search is Successful");	
	}
	@Test (groups = {"regression"}, priority = 3)
	public void advancedSearch(){
	System.out.println("Advanced Search is Successful");	
	}
	@Test (groups = {"smoke"}, priority = 4)
	public void billPayment(){
	System.out.println("BillPayment is Successful");	
	}
	@Test (groups = {"sanity", "regression"}, priority =5 )
	public void prepaidRecharge(){
	System.out.println("Prepaid Recharge is Successful");	
	}
	}

