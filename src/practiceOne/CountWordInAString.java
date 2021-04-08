package practiceOne;

public class CountWordInAString {

	public static void main(String[] args) {

		String text = "you made it the tekshool interview session";

		System.out.println(text.length());

		String [] allWords = text.split(" ");
		System.out.println(allWords.length);
		
		for(int i = 0;  i < allWords.length; i++) {

			System.out.println(i + " " + allWords[i]);
		}
		
		
		
	}

}
