package fileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class ReadDataFromCSV_Textfile
{
	@Test
	public void readDataFromCSV_Textfile() throws Exception 
	{		
//		FileReader fr = new FileReader("./testdata/csvFile.csv");  	//Step1: Create an object of FileWriter class 
//		BufferedReader br = new BufferedReader(fr);						//Step2 : Create an object of buffer reader
//		System.out.println(br.readLine());								//Step3 : Read Data
//		br.close();														//Step4 : close the file
//			
//		System.out.println("pringting done");
//		
	//*******************************************************8
	
		FileInputStream f = new FileInputStream("./testdata/csvFile.csv");
		InputStreamReader r = new InputStreamReader(f);
		r.read();
		System.out.println(r.read());
		r.close();
	}

}
