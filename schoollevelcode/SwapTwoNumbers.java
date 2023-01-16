package schoollevelcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTwoNumbers 
{
	public List<Integer> get(int a,int b)
	{
		int temp = a;
		a = b;
		b = temp;
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
				
		return list;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :");
		int a = sc.nextInt();
		System.out.println("Enter second Number :");
		int b = sc.nextInt();
		
		SwapTwoNumbers stn = new SwapTwoNumbers();
		List<Integer> ans = stn.get(a, b);
		System.out.println(ans.get(0)+" "+ans.get(1));
		sc.close();
	}
}
