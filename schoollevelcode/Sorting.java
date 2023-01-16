package schoollevelcode;

import java.util.Scanner;

public class Sorting 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to add : ");
		int n = sc.nextInt();
		int temp;
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for(int i = 0; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j =0 ; j <n; j++)
		{
			for(int k = j; k<n; k++)
			{
				if(arr[j] > arr[k])
				{
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		
		for(int i = 0; i<n ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
