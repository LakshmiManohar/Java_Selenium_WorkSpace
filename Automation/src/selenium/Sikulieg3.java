package selenium;
import org.sikuli.script.Screen;

public class Sikulieg3 {

	Screen s = new Screen();
	void action()throws Exception{
		s.click("D:\\WorkSpace\\images.sikuli\\min.png");
		s.doubleClick("D:\\WorkSpace\\images.sikuli\\Resume.png");
		s.wheel("D:\\WorkSpace\\images.sikuli\\openResume.png", 250,0);
		s.click("D:\\WorkSpace\\images.sikuli\\closeResume.png");
	
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
           Sikulieg3 e = new Sikulieg3();
           e.action();
	}

}
