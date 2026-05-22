package Day5;

public class Assignment4_CountEvenOddDigits {

	public static void main(String[] args) {
		
		int num = 123456789;
		int even_count = 0, odd_count = 0, temp;
		
		System.out.println("The number is :"+num);
		
		while(num>0)
		{
			temp = num%10;
			num = num/10;
			
			if(temp%2 ==0)
				even_count++;
			else 
				odd_count++;
		}

		System.out.println("The count Number of even digits : "+even_count);
		System.out.println("The count Number of odd digits : "+odd_count);
	}

}
