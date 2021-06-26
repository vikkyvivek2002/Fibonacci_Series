import java.util.Scanner;
public class Fibonacci_Series {

	public static void main(String[] args)
	{
	    System.out.println("enter a number");
	    Scanner s = new Scanner(System.in);
	   int n = s.nextInt();
	    int a=0, b = 1;
	    System.out.println("Fibonacci Series");
	    System.out.println(" "+a );
	    System.out.println(" "+b);

	    
	    for(int i=3;i<=n;i++)
	    {
	        int sum = a +b;
	        System.out.println(" " + sum);
	        a = b;
	        b = sum;
	    }
	}

}
