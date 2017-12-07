package Android;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class copy_excel {
  @Test
  public void f() throws Exception {
	  
	  FileInputStream f = new FileInputStream("C:\\Users\\Manohar\\Desktop\\Manu.xls");
	  Workbook wb = Workbook.getWorkbook(f);
	  Sheet s = wb.getSheet("Sheet2");
	  FileOutputStream fo= new FileOutputStream("C:\\Users\\Manohar\\Desktop\\hello2.xls");
	  WritableWorkbook wbo = Workbook.createWorkbook(fo);
	  WritableSheet sh = wbo.createSheet("sheet", 0);
	  for(int i=0;i<s.getRows();i++)
	  {
		  Label Result = new Label(2,i,"Pass");
		  sh.addCell(Result);
		  
		  for(int j=0;j<s.getColumns();j++)
		  {
			  System.out.println(s.getCell(j,i).getContents());
			  Label l = new Label(j,i,s.getCell(j,i).getContents());
			  sh.addCell(l);
		  }
	  }
	  
	  Label rs = new Label(2,0,"Results");
	  sh.addCell(rs);
	  wbo.write();
	  wbo.close();
  }
}
