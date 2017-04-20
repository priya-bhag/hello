package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

//to connect to a Db connector
//mysql connector external jar files 


public class Database_connec {
	
@Test


public void db() throws ClassNotFoundException, SQLException{
	
	
	
	Class.forName("com.mysql.jdbc.Driver")  ;   //here we have to pass the driver of the database 
	System.out.println("driver loaded");
	Connection con=DriverManager.getConnection("jdbc:mysql://hostname:port/dbName","username","password") ;
	
System.out.println("connected to mysql Db");
Statement st = con.createStatement();	
	ResultSet rs = st.executeQuery("select * from sakila");
	
	while(rs.next()){
		String firstName =rs.getString("firstname");
		
		System.out.println("first name is "+ firstName);
		
String email =rs.getString("email");
		
		System.out.println("first name is "+ email);
	
	
	}
}
}
