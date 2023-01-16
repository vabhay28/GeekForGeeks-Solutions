package schoollevelcode;
import java.util.Scanner;

public class SumOfSeries 
{
	static long seriesSum(int n) {
        // code here
        long res=0;
		for(long i = n; i>0; i--)
        {
            res += i;
        }
        return res;
        
        //===Another Logic===
        
        //return (long)((n*(n+1))/2);
    }
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(seriesSum(n));
	}
}
