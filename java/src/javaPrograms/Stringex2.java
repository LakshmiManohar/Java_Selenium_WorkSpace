package javaPrograms;

import java.util.Scanner;

public class Stringex2 {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.nextLine();
        int k = sc.nextInt();
        String f = s.substring(0,k);
        int j = k-1;
        for(int i=0;i<s.length()-j;i++)
        {
            int x = s.substring(i, i+3).compareTo(f);
            System.out.println(x);
            
            
        }
        sc.close();
    }

}
