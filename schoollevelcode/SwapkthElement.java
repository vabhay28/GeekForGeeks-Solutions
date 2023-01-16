package schoollevelcode;

import java.util.Scanner;

public class SwapkthElement 
{
	public void swapele(int arr[], int n, int k)
	{
		int len = arr.length;
		int temp = arr[k-1];
		arr[k-1] = arr[len-k];
		arr[len-k] = temp;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements to add :");
		int n = sc.nextInt();
		
		System.out.println("Add Elements");
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element position to be swapped");
		int k = sc.nextInt();
		
		SwapkthElement ste = new SwapkthElement();
		ste.swapele(arr, n, k);
		
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+" ");
		}
		sc.close();
	}
}
