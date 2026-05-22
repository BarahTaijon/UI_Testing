package Day5;

public class Assignment1_ReverseNumber {

	public static void main(String[] args) {
		
		int x = 12345678;

		while(x>0){
			
			System.out.print(x%10);		
			x /= 10;
		}
		
	}

}
