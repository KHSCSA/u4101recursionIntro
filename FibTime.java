// This program demonstrates the <fibo> method.
// Note that this style of recursion becomes unacceptibly slow when the requested
// Fibonacci number becomes larger.

import java.util.*;

public class FibTime{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
      	long startTime = 0;  long endTime = 0;
      
		System.out.print("Enter requested Fibonacci number (<= 50) ===>>  ");
		long number = input.nextInt();
		
		System.out.println("\n\nCALLING ITERATIVE FIBO METHOD");
      	startTime = System.currentTimeMillis();
		System.out.println("Fibonacci(" + number + ") is  " + fibo1(number));
      	endTime = System.currentTimeMillis();
      	System.out.println("Total execution time: " + (endTime - startTime) + " milliseconds");
      
		System.out.println("\n\nCALLING RECURSIVE FIBO METHOD");
      	startTime = System.currentTimeMillis();
		System.out.println("Fibonacci(" + number + ") is  " + fibo2(number));
      	endTime = System.currentTimeMillis();
      	System.out.println("Total execution time: " + (endTime - startTime) + " milliseconds");

	}

	/***** ITERATIVE FIBO ***************************************/
	public static long fibo1(long n)
	{
		long a = 1;
		long b = 1;
		long c = 0;
		for (long k = 3; k <= n; k++){
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	/***** RECURSIVE FIBO ****************************************/
	public static long fibo2(long n){
		if (n == 1 || n == 2)
			return 1;
		else
			return fibo2(n-1) + fibo2(n-2);
	}

}
