import java.util.Scanner;

public class FibonacciForLoops {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the series of Fibonacci: ");
		int n = inp.nextInt();

		int firstTerm = 0;
		int secondTerm = 1;

		for (int i = 0; i <= n; i++) {
			System.out.println(firstTerm);
			int lastTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = lastTerm;
		}

	}

}
