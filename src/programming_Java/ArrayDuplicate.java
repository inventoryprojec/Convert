package programming_Java;

import java.util.Scanner;

public class ArrayDuplicate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Size of array");
		int n = in.nextInt();
		int a[] = new int[n];
		System.err.println("Enter " + n + " array element");
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate element are founds : " + a[i] + ",");
				}
			}
		}

	}

}
