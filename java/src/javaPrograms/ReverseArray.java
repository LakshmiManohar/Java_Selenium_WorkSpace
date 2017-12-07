package javaPrograms;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a  = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int j = a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
		sc.close();
	}

}
