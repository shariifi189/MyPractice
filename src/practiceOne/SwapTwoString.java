package practiceOne;

public class SwapTwoString {

	
	public static void main(String[] args) {
		
	
		String x = "hello";
		String y = "how are you";
		
		
		System.out.println(" x value is: " + x + " \t y value is: " + y );
		
		System.out.println("******************************");
		x = x + y;
		
		y = x.substring(0,(x).length()-y.length());
		
		x = x.substring(y.length());
		
		System.out.println(" x value is: " + x + " \t y value is: " + y );
		
	
		
	
	}
}


