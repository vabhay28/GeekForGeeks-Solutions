package schoollevelcode;

import java.util.Scanner;

public class PallindromicArray 
{
	public int reverse(int num)
	{
		int reverse=0;
    	while(num>0)
    	{
    		reverse = reverse * 10 + num % 10;
    		num = num/10;
    	}
    	
    	return reverse;
	}
	
	public int pallin(int num)
	{
		int rev = reverse(num);
    	if(num != rev)
    	{
    		return 0;
    	}
    	return 1;
	}
	
	public int palinArray(int a[], int n)
    {
		// Your code goes here
		int array[] = new int[n];
		int flag=1;
        for(int i=0;i<n;i++)
        {      	
        	array[i] = pallin(a[i]);
        }
        
        for(int j = 0; j< array.length; j++)
        {
        	if(array[j] == 0)
        	{
        		flag = 0;
        		break;
        	}
        }
        if(flag == 0)
        {
        	return 0;
        }
        return 1;
        
    }
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements to add :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		PallindromicArray pa = new PallindromicArray();
		System.out.println(pa.palinArray(arr, n));
		sc.close();
	}

}
