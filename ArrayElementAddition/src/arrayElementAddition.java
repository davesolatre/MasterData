import java.util.Scanner;

public class arrayElementAddition {

	public static void main(String[] args) {
		int n, i;
		int count = 0;
		int count2 = 0;
		int sumOfTwoArray;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Element of Array: ");
		n = scan.nextInt();

		int a[] = new int[n];
		System.out.println("Enter Element: ");
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.print("10 number are: ");
		for (i = 0; i < n; i++) {
			System.out.print(" " + a[i]);

		}
		System.out.println(" ");
		System.out.print("The Even Number: ");
		for (i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(" " + a[i]);
				count++;
			}
		}
		System.out.println(" ");

		System.out.print("The Odd Number Are: ");
		for (i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(" " + a[i]);
				count2++;
			}
		}
		System.out.println(" ");

		System.out.println("The total of Even number: " + count);
		System.out.println("The total of Odd number: " + count2);

		sumOfTwoArray = count - count2;
		System.out.println("The Differce between even and odd are: " + Math.abs(sumOfTwoArray));
		
		scan.close();
		
	}

}
