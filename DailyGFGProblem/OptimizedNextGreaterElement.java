package DailyGFGProblem;

import java.util.Scanner;
import java.util.Stack;

public class OptimizedNextGreaterElement 
{
	public long[] nextLargerElement(long[] arr, int n) 
    { 
		long greater[]=new long[n];

        Stack<Long> st = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && st.peek()<arr[i])
            	st.pop();

            if(st.isEmpty())
            	greater[i]=-1;

            else 
            	greater[i]=st.peek(); 

            st.push(arr[i]);

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
		
		OptimizedNextGreaterElement nge = new OptimizedNextGreaterElement();
		long[] res = nge.nextLargerElement(nums,n);
		for(int i=0; i<n; i++)
		{
			System.out.println(res[i]);
		}
		
		sc.close();
	}
}
