package Day3;

public class Assignment1 {

	public static void main(String[] args) {
	
		
		//swapping of 2 numbers without using any temporary variable.
		
		int x = 10 , y = 20;
		
		System.out.println("The value of x before swapping is : " +x);
		System.out.println("The value of y before swapping is : "
				+ "" +y);
		
		x = x + y; 
		
		y = x - y;
		
		x = x - y;
		
		System.out.println("The value of x after swapping is : " +x);
		System.out.println("The value of y after swapping is : " +y);
			

	}

}
