import java.util.Scanner;

public class Fibonacci {

	private static long[] fibonacciCache;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the fibonacci series: ");
		int n = scan.nextInt();

		fibonacciCache = new long[n + 1];
		System.out.println("The fibonacci series of " + n +  ":");
		for (int i = 0; i <= n; i++) {
			
			System.out.println(fibonacci(i) + " ");
		}
	}

	private static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		if (fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		fibonacciCache[n] = nthFibonacciNumber;
		return nthFibonacciNumber;
	}
}
