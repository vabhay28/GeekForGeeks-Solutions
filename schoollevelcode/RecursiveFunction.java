package schoollevelcode;
import java.util.Scanner;

public class RecursiveFunction 
{
		  public static void main(String[] args) 
		  {
			  Scanner sc = new Scanner(System.in);
			  int n = sc.nextInt();
			  callMyself(n);
			  sc.close();
		  }
		  /* The recursive Java method */
		  public static void callMyself(long i) {
		    if (i > 1) {
		      callMyself(i-1);
		    }
		    System.out.print(i);
			/*
			 * i = i - 1; callMyself(i);
			 */
		  }
		
}
