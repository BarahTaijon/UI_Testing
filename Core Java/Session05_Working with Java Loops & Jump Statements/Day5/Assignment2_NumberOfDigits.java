package Day5;

public class Assignment2_NumberOfDigits {

	public static void main(String[] args) {
		
		int x = 123456789, count = 0;
		
		while(x> 0) 
		{
			count ++;
			x/=10;
		}
		System.out.print(count);

	}

}
