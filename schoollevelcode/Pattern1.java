package schoollevelcode;
/*
You are given a number N. You need to print the pattern for the given value of N.

For N = 2 the pattern will be 
2 2 1 1
2 1

For N = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
 * */

import java.util.Scanner;

public class Pattern1 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--)
        {
            for(int j = n; j>0 ; j--)
            {
            	for(int k=i; k>0 ;k--)
            	{
            		System.out.print(j+" ");
            	}
            }
            System.out.print("$");
     
        }
		
		sc.close();
	}
}
