package readCSV;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSVfile {
	
	
	public static WebDriver driver;
	
	@Test
	
	public static void readFile() throws IOException{
		
		
		CSVReader cs = new CSVReader(new FileReader("//Users//rameshpriya//Desktop//new.csv"));
		
	List<String[]> data= cs.readAll();
	
	
	Iterator i = new Iterator(data);
	
	for(int i=0; i< data.size(); i++){
		
		
		
		System.out.println(data.get(i));
	}
	
		
		
		
		
	}
	
	

}
