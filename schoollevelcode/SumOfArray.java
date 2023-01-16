package schoollevelcode;

import java.util.Scanner;

 class SumOfArray 
{
	
	public long getSum(long a[], long n)
    {
        long res=0;
        // Your code goes here
        for(int i=0;i<n;i++)
        {
            res += a[i];
        }
        return res;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements to add :");
		long n = sc.nextLong();
		
		long arr[] = new long[(int) n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextLong();
		}
		
		SumOfArray sa = new SumOfArray();
		System.out.println(sa.getSum(arr, n));
		sc.close();
	}

	
}
