package javaPrograms;

public class Exceptionhandling_try_catch {
	
	
	void case01(){
		
		try{
			System.out.println("Hello");
			System.out.println(10/0);
			System.out.println("Hi how r u");
		}catch(ArithmeticException e){
			System.out.println(10/2);
			e.printStackTrace();
		}
	}
	
	void case02(){
		
		try{
			System.out.println("Hello---1");
			System.out.println(10/0);
			System.out.println("Hi how r u--1");
			
		}catch(Throwable e){
			System.out.println(10/2);
			e.printStackTrace();
		}
		
	}
	
	void case3(){
		
		try{
			try{
				System.out.println("Hello---2");
				System.out.println(5/0);
			}
			catch(Exception e){
				System.out.println("try in try - catch");
				e.printStackTrace();
			}
		}catch(Exception e){e.printStackTrace();}
	}
	
	void case4(){
		try{
			System.out.println("Hello---3");
			System.out.println(5/0);
		}catch(Exception e){
			try{
				System.out.println(2/0);
				System.out.println("hello in try");
			}catch(Exception a){
				System.out.println("Hello in catch");
			}
		}
	}
	
	void case5(){
		try{
			System.out.println("Hello--4");
			try{
				
				System.out.println("Hello --5");
				
			}catch(Exception e){e.printStackTrace();}
		}catch(Exception e){ e.printStackTrace();
			try{
				System.out.println("Hello--6");
			}catch(Exception a){a.printStackTrace();}
		}
	}
	
	void case06(){
		try{
			System.out.println(7/2);
			System.out.println("Manohar".charAt(7));
		}catch(ArithmeticException e ){
			e.printStackTrace();
			System.out.println("Incorrect divisible");}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("Incorrent index");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exceptionhandling_try_catch e =  new Exceptionhandling_try_catch();
		e.case01();
        e.case02();
        e.case3();
		e.case4();
		e.case5();
		e.case06();
	}

}
