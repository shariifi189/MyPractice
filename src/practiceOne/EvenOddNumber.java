package practiceOne;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		
		

		evenOddNumber(5);
		evenOddNumber(40);
	}
	
	public static void evenOddNumber(int num) {
		
		if (num % 2 == 0) {
			
			System.out.println( num + "\tNumber is Even:\t");
		}else if (num % 2 != 0) {
			
			System.out.println(num + "\tNumber is Odd");
		
		}
		
	}
	
}
