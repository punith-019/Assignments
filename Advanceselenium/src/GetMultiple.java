import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetMultiple {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fi=new FileInputStream("./Excel/testdata.xlsx");
		
		Workbook book = WorkbookFactory.create(fi);
		int count =0;
		Sheet sh = book.getSheet("Sheet1");
		for(int i=0; i<sh.getLastRowNum();i++)
		{
			Row ro = sh.getRow(i);
			Cell cel = ro.getCell(0);
			String value = cel.getStringCellValue();
			System.out.println(value);
			count = i;
		}
	System.out.println("The Total count of link is "+count);
		
	}}
