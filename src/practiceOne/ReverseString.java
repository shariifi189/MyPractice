package practiceOne;

public class ReverseString {

	public static void main(String[] args) {

		String text = " this is the test to see if we can code";
		String reverse = "";
		
		for (int i = text.length() - 1; i <= 0; i --) {
			reverse = reverse + text.charAt(i);
			System.out.println(reverse);
		}
		
		
	}

}
