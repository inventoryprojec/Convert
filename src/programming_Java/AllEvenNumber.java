package programming_Java;

public class AllEvenNumber {
	public static void main(String[] args) {

		checkGivenNumOddOrEven(0);
		checkAllNumbersOddOrEven();

	}

	public static void checkGivenNumOddOrEven(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is the even numver");

		}

		else {
			System.out.println(num + " is the odd number");
		}
	}

	private static void checkAllNumbersOddOrEven() {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 23, 34, 45, 56, 67, 78, 89 };
		int arrayLenth = num.length;
		for (int i = 0; i < arrayLenth; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i] + " even number");

			} else {
				System.out.println(num[i] + " odd numver");
			}
		}

	}

}
