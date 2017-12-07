/* Loops */
package javaPrograms;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String a [] = new String[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextLine();
			String s = new String(a[i]);
			//System.out.println(a[i]);
			for(int j=0;j<s.length();j++)
			{
				char [] c = new char[s.length()];
				if(j%2==0)
				{
				c[j] = s.charAt(j);
				System.out.print(c[j]);
				}
				
			}
			
			for(int k=0;k<s.length();k++)
			{
				char [] d = new char[s.length()];
				if(k%2!=0)
				{
				d[k] = s.charAt(k);
				System.out.print(" ");
				System.out.println(d[k]);
				}
				
				
			}
			 
			System.out.println();
		}
		
		sc.close();
	}

}
