package Day7;

public class StringMethods02_concat {

	public static void main(String[] args) {
		
	        String s1 = "welcome";
			String s2 = " to java";
			String s3 = "  and testing";	
			
			System.out.println(s1+s2);
			System.out.println(s1.concat(s2));
			
			System.out.println(s1+s2+s3);
			System.out.println(s1.concat(s2).concat(s3));
			System.out.println(s1.concat(s2+s3));

	}

}
