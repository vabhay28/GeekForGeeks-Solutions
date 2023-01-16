package schoollevelcode;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest 
{
	public static int print2largest(int arr[], int n) 
    {
        // First we will check if the array length is less than 2 then we will print -1
        if(arr.length<2)
		{
		    return -1;
		}

        // Here we will sort the array and then we check the second last element
        Arrays.sort(arr);
        
//        int temp;
//		for(int i = 0; i<n; i++)
//		{
//			for(int j = 0; j < n; j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
        
        
		for(int i = n-2; i >= 0; i--)
		{
		    if(arr[i] != arr[n-1])
		    {
		        return arr[i];
		    }
		}
        
        return -1;
       
    }
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the number of elements of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("\nEnter the elements into Array :");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
//		SecondLargest sl = new SecondLargest();
		System.out.println(print2largest(arr, n));
		
	
		sc.close();
	}
}

