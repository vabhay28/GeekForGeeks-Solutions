package schoollevelcode;

import java.util.Scanner;

public class AlternateElementOfArray 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Elements to add");
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0; i<n ;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		GfG gfg = new GfG();
		gfg.print(arr, n);
				
	}
		
}


class GfG
{
    public static void print(int arr[], int n)
    {
        // your code here
        for(int i=0; i <n; i++)
        {
            if(i%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}