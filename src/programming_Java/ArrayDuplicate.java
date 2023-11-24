package programming_Java;

import java.util.Scanner;

public class ArrayDuplicate {
	public static void main(String[] args) {

		// usingint_Obj();
		findDuplicateEleFrom();
	}

	public static void usingint_Obj() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Size of array");
		int n = in.nextInt();
		int a[] = new int[n];
		System.err.println("Enter " + n + "FS array element");
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

	public static int findDuplicateEleFrom() {
		int num[] = { 2, 3, 4, 5, 6, 5, 7, 5, };
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i] + " is the duplicate Element in the int array");
					count++;
				}

			}

		}
		System.out.println("Duplicate ele count " + count);
		return count;
	}

}
