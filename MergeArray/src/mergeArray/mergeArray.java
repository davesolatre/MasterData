package mergeArray;

import java.util.Scanner;

public class mergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of First Array: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the values of Second Array: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the values of Second Array: ");
		int n3 = sc.nextInt();

		int n4 = n2 + n3;
		
		int temp = 0;

		int a[] = new int[n1];
		int b[] = new int[n2];
		int c[] = new int[n3];
		int d[] = new int[n4];

		System.out.println("Enter " + n1 + " values for array A");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		System.out.println("Enter " + n2 + " values for array B");
		for (int i = 0; i < n2; i++)
			b[i] = sc.nextInt();

		System.out.println("Enter " + n3 + " values for array B");
		for (int i = 0; i < n3; i++)
			c[i] = sc.nextInt();

		for (int i = 0; i < n1; i++)
			d[i] = 0;

		for (int i = 0; i < n2; i++)
			d[i] = b[i];

		for (int i = 0; i < n3; i++)
			d[n2 + i] = c[i];

		// System.out.println("This is a merge array in descending order: ");
		// System.out.printf("Original Array: %s", Arrays.toString(d));
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] < d[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Element of array descending order: ");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i] + " ");
		}
		// for(int i= 0; i<d.length; i++)

	}

}