package schoollevelcode;

import java.util.Scanner;

public class NextGreaterElement 
{
	public long[] nextLargerElement(long[] arr, int n) 
    { 
        long[] greater = new long[n];
		
        for(int i=0; i<n;i++)
        {
        	for(int j = i; j<n ; j++)
        	{
        		if(arr[i]<arr[j])
        		{
        			greater[i] = arr[j];
        			break;
        		}
        		else
        			greater[i] = -1;
        	}
        	
        }
        
		return greater;
    } 
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements to add :");
		int n = sc.nextInt();
		
		long nums[] = new long[n];
		for(int i=0; i<n; i++)
		{
			nums[i] = sc.nextLong();
		}
		
		NextGreaterElement nge = new NextGreaterElement();
		long[] res = nge.nextLargerElement(nums,n);
		for(int i=0; i<n; i++)
		{
			System.out.println(res[i]);
		}
		
		sc.close();
	}
}
