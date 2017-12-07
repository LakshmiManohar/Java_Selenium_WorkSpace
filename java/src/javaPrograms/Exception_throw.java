// throw Keyword is used hand over the user created Exception object to JVM
package javaPrograms;

import java.util.Scanner;

public class Exception_throw {
	
	//changing predefined Exception using throw
	static void case1(int age){
		
		if(age>=25)
		{
			System.out.println("Marriage");
		}
		else
		{
			throw new ArithmeticException("Not Marriage");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = s.nextInt();
		Exception_throw.case1(age);
		s.close();

	}

}
