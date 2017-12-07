package Android;
import java.io.FileOutputStream;


import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Create_add_data_excel {
  @Test
  public void f() throws Exception {
	  
	  FileOutputStream f = new FileOutputStream("C:\\Users\\Manohar\\Desktop\\hello.xls");
	  WritableWorkbook b = Workbook.createWorkbook(f);
	  WritableSheet s = b.createSheet("Sheet", 1);
	  Label un = new Label(0,0,"username");
	  Label un2 = new Label(1,0,"password");
	  Label un3 = new Label(2,0,"Results");
	  s.addCell(un);
	  s.addCell(un2);
	  s.addCell(un3);
	  b.write();
	  b.close();
	  
	  
  }
}
