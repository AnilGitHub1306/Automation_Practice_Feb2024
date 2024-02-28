package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Read_Exls_File<XSSFWorkbook, XSSFSheet> 
{
	@Test
	public void read_Exles_File() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("./testData/book.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
	}
}
