package javaPrograms;

public class Expectionhandling_Finally {
	
	void case1(){
		try{
			System.out.println("Executed Try----1");
		}catch(Exception e){e.printStackTrace();}
		finally{
			System.out.println("Finally Executed");
		}
	}
	void case2(){
		
		try{
			System.out.println(7/0);
		}catch(Exception e){
			System.out.println("Executed catch-----1");
		}
		finally{
			System.out.println("Finally Executed");
		}
	}
	void case3(){
		try{
			System.out.println("Excecuted Try---2");
		}
		finally{
			System.out.println("Finally Executed");
		}
	}
	void case4(){
		try{
			System.out.println(7/0);
		}finally{
			System.out.println("Finally Executed-!");
		}
	}
	
	void case5(){ 
		try{
			System.out.println(5/0);
		}
		catch(Exception e){
			System.out.println("Hello");
			System.out.println(6/0);
		}
		finally{
			System.out.println("Finally Executed...!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Expectionhandling_Finally e = new Expectionhandling_Finally();
		e.case1();
		e.case2();
		e.case3();
		e.case5(); //Program terminates after running this method
		e.case4(); ////Program terminates after running this method
	}

}
