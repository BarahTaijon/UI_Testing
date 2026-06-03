package Day7;

public class StringMethods06_equals_equalsIgnoreCase {

	public static void main(String[] args) {
		
		String s = "welcome";
		String s1 = "welcome";
		
		System.out.println(s ==s1);	//true 	
		System.out.println(s.equals(s1)); //true 	
		System.out.println(s.equals("welcome")); //true		
		System.out.println(s.equals("Welcome")); //false		
		System.out.println(s.equalsIgnoreCase("Welcome")); //true		
				
	

	}

}
