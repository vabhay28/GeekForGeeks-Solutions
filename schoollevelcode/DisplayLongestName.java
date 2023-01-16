package schoollevelcode;

import java.util.Scanner;

public class DisplayLongestName 
{
	public String longest(String names[], int n)
	{
		String longest = "";
		for(int i=0; i<names.length;i++)
		{
			
			if(longest.length() < names[i].length())
			{
				longest = names[i];
			}
			
		}
		return longest;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements to add :");
		int n = sc.nextInt();
		
		String names[] = new String[n];
		for(int i=0; i<n; i++)
		{
			names[i] = sc.next();
		}
		
		DisplayLongestName dln = new DisplayLongestName();
		System.out.println(dln.longest(names, n));
		sc.close();
	}
	
}
