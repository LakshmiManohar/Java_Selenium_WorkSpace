package selenium;

import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;

public class Sikulieg2 {
	
	Screen s = new Screen();
	void Notepad()throws Exception{
		s.click("D:\\WorkSpace\\images.sikuli\\min.png");
		s.find("D:\\WorkSpace\\images.sikuli\\win.png");
		s.click("D:\\WorkSpace\\images.sikuli\\win.png");
		s.type("D:\\WorkSpace\\images.sikuli\\search.png","Notepad");
		Thread.sleep(2000);
		s.click("D:\\WorkSpace\\images.sikuli\\Notepad.png");
		Thread.sleep(2000);
		s.paste("D:\\WorkSpace\\images.sikuli\\text.png","Tech Geeeeeeeek");
		s.type(" Manohar");
		s.paste(" !!!!!!!! ");
		s.find("D:\\WorkSpace\\images.sikuli\\Manu.png");
		s.doubleClick("D:\\WorkSpace\\images.sikuli\\Manu.png");
		s.type("x",KeyModifier.CTRL); // TO Cut the text
		s.click("D:\\WorkSpace\\images.sikuli\\blank.png");
		s.type("v",KeyModifier.CTRL); // To Paste the text
		s.type("c",KeyModifier.CTRL); // To Copy the Text
		s.click("D:\\WorkSpace\\images.sikuli\\blank.png");
		s.type("v",KeyModifier.CTRL); 
		s.find("D:\\WorkSpace\\images.sikuli\\Manu.png");
		s.doubleClick("D:\\WorkSpace\\images.sikuli\\Manu.png");
		s.type("x",KeyModifier.CTRL);
		System.out.println(s.exists("D:\\WorkSpace\\images.sikuli\\Manu.png",10) != null?"Yes":"NO");
		
		
		
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Sikulieg2 e = new Sikulieg2();
		e.Notepad();
		

	}
}
