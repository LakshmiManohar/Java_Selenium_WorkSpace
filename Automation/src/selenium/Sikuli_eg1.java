package selenium;

import org.sikuli.script.Screen;

public class Sikuli_eg1 {
	public Screen s = new Screen();
    
	public void cl() throws Exception
	{
		
		
		s.click("D:\\WorkSpace\\images.sikuli\\min.png");
		s.doubleClick("D:\\WorkSpace\\images.sikuli\\skype.png");
		s.type("D:\\WorkSpace\\images.sikuli\\email.png","manu.manohar53");
		s.type("D:\\WorkSpace\\images.sikuli\\password.png","Manohar7*");
	    s.click("D:\\WorkSpace\\images.sikuli\\click.png");
	}
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Sikuli_eg1 e = new Sikuli_eg1();
		e.cl();

	}

}
