package Day7;

public class StringMethods03_trim {

	public static void main(String[] args) {

		String s = "   welcome   ";
		
		System.out.println(s);
		System.out.println("Before trimming :"+s.length());
		
		System.out.println(s.trim());
		System.out.println("After trimming :"+s.trim().length());
		
	}

}
