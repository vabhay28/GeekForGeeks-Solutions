package schoollevelcode;


import java.util.Scanner;

public class FindMedian 
{
	public int find_median(int[] v)
	{
		int len = v.length;
		int temp;
		int mid = (len/2);
		for(int j =0 ; j <len; j++)
		{
			for(int k = j; k<len; k++)
			{
				if(v[j] > v[k])
				{
					temp = v[j];
					v[j] = v[k];
					v[k] = temp;
				}
			}
		}
		
		if(len % 2 == 0)
		{
			return (v[mid] + v[mid-1])/2;
		}
		return v[mid];
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements to add :");
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		for(int i=0; i<n; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		FindMedian fm = new FindMedian();
		System.out.println(fm.find_median(nums));
		sc.close();
	}
}
