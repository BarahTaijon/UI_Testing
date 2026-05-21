package Day3;

public class IncrementDecrement_Operator_Demo {

	public static void main(String[] args) {
		
		//Case 1 - post-increment

		int a = 10;
		int res = a++;
		System.out.println("Post-increment");
		System.out.println(res); // 10
		System.out.println(a); // after assignment increment is happen //11
		
		//Case 2 - pre-increment
		int a2 = 10;
		int res2 = ++a2;
		System.out.println("Pre-increment");
		System.out.println(res2); // 11
		System.out.println(a2); // 11
		
		
		
	}

}
