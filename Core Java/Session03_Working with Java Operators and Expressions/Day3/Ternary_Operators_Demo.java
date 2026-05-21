package Day3;

public class Ternary_Operators_Demo {

	public static void main(String[] args) {
		
		int a = 100, b = 200;
		
		int x = (a>b)? a: b;
		System.out.println(x);
		
		// this mean if a greater than b [exp is true] then x = a , if not x = b
		
		// ex2:
		int x2 = (1 == 1)? 100 : 200;
		System.out.println(x2);  	
		
		//ex3
		int person_age = 30;
		String res = (person_age >= 18)? "Eligible" : "not Eligible";
		
	}

}
