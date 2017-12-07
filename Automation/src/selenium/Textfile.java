package selenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;


public class Textfile {
  @Test(enabled = false)
  public void fileWrite() throws IOException {
	  
	  File f = new File("C:\\Users\\Manohar\\Desktop\\Apps.txt");
	  FileWriter fw = new FileWriter(f,true);
	  BufferedWriter bw = new BufferedWriter(fw);
	  bw.write("Manu");
	  bw.newLine();
	  bw.write("Manohar");
	  bw.close();
	  
	  
	  
  }
  @Test
  public void fileRead() throws Throwable{
	  
	  File f = new File("C:\\Users\\Manohar\\Desktop\\Apps.txt");
	  FileReader fr = new FileReader(f);
	  BufferedReader br = new BufferedReader(fr);
	  String str;
	  
	 try{
	  while( (str= br.readLine())!=null){
		  System.out.println(str);
		  if(str.equalsIgnoreCase("Manu"))
		  {
			  System.out.println(str + "///////////");
		  }
	  }
	 }
	 catch(Exception e){e.printStackTrace();}
	   br.close();
	  
  }
  

}
