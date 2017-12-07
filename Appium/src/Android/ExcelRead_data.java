package Android;

import java.io.FileInputStream;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelRead_data {
  @Test
  public void f() throws Exception{
	  
	 FileInputStream f = new FileInputStream("C:\\Users\\Manohar\\Desktop\\Manu.xls");
	 Workbook wb = Workbook.getWorkbook(f);
	 Sheet s = wb.getSheet("Sheet2");
	 for(int i=0;i<s.getRows();i++)
	 {
		 for(int j=0;j<s.getColumns();j++){
			 
			 System.out.print(s.getCell(j,i).getContents()+"\n");
		 }
	 }
	 
	 
	  
  }

}
