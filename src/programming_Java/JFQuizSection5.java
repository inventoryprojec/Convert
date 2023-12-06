package programming_Java;

public class JFQuizSection5 {
	public static void main(String[] args) {

		String[] words = { "Yes", "No" };
		String s = (words.length < words[1].length()) ? words[0] : words[1];
		System.out.println(s);
	}

	public static void seg14() {
		String gender = "female";
		System.out.println((gender == "female") ? "ms." : "mr.");

	}

}
