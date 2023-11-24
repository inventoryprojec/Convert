package programming_Java;

public class AllEvenNumber {
	public static void main(String[] args) {
		checkGivenNumOddOrEven(0);

	}

	public static void checkGivenNumOddOrEven(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is the even numver");

		}

		else {
			System.out.println(num + " is the odd number");
		}
	}

}
