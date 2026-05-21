package Day4;

public class IfConditionDemo {

	public static void main(String[] args) {

	// 1. If statement
				int person_age = 25;
				
				if (person_age >= 18) 
				{
					System.out.println("eligible for vote");
				}
			
				
	// 2. if else statement 
				person_age = 10;
				
				if (person_age >= 18) 
				{
					System.out.println("eligible for vote");
				}
				else{
					System.out.println("Not eligible for vote");

				}
				
	//3. nested if
				
   //check if the number is positive, negative, or zero.
				
			int x = 758070;
			if (x > 0) 
				System.out.println("positive");
			else if (x < 0)
				System.out.println("negative");
			else 
				System.out.println("zero");
		
  //largest 3 numbers 
			int a = 10, b = 11, c = 3;
		if(a>b && a>c)
			System.out.println("a : "+ a + ", is the largest value");
		else if(b>a && b>c)
			System.out.println("b : "+ b + ", is the largest value");
		else
			System.out.println("c : "+ c + ", is the largest value");	}

}
