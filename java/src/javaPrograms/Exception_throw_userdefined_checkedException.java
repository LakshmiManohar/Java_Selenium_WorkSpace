package javaPrograms;

import java.util.Scanner;

public class Exception_throw_userdefined_checkedException {

 void case1(int age) throws Invalid_Exception{
		
		if(age>=25)
		{
			System.out.println("Marriage");
		}
		else
		{
			throw new Invalid_Exception("Not Eligiable Mano");
		}
	}

	public static void main(String[] args) throws Invalid_Exception {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = s.nextInt();
		new Exception_throw_userdefined_checkedException().case1(age);
		s.close();

	}

}
