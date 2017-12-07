package javaPrograms;

import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
		
			char ch[] = new char[s.length()];
			for(int i=0;i<ch.length;i++)
			{
			ch[i] = s.charAt(i);
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				
				 x = 1;
				 System.out.println(x);
			}
			if(ch[i]!='a'||ch[i]!='e'||ch[i]!='i'||ch[i]!='o'||ch[i]!='u')
			{
				 y = 2;
				 System.out.println(y);
			}
			
		
		}		
			sc.close();
	}
     

}
