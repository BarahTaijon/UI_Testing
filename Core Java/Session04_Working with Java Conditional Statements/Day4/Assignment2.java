package Day4;

public class Assignment2 {

	public static void main(String[] args) {
		
		//1. Use ternary operator the largest value of 2 numbers
		
		int x = 10, y = 9;
		
		System.out.println(x>y?x:y);
		
	   // 2. find the smallest number of 3
		
		int a = 2, b = 4, c = -6;
		
		if(a<b && a<c)
			System.out.println("a = "+a+ " is the smallest");
		else if(b<a && b<c)
			System.out.println("b = "+b+ " is the smallest");
		else 
			System.out.println("c = "+c+ " is the smallest");
		
	  // 3. print week number based on week name.  (ex. take Sunday and print 2)

		String day = "Tuesday";
		
		switch(day)
		{
		case "Saturday":
			System.out.println(1);
			break;
		case "Sunday":
			System.out.println(2);
			break;
		case "Monday":
			System.out.println(3);
			break;
		case "Tuesday":
			System.out.println(4);
			break;
		case "Wednesday":
			System.out.println(5);
			break;
		case "Thursday":
			System.out.println(6);
			break;
		case "Friday":
			System.out.println(7);
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
