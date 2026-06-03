package Day7;

public class StringMethods05_contiains {

	public static void main(String[] args) {
		
		String s = "Welcome";
		
		System.out.println(s.contains("me"));
		System.out.println(s.contains("you"));
		System.out.println(s.contains("WE"));
		
		//check if the ‘john’ in a string 
		String s_name = "John Kendedy";                              
		System.out.println(s_name.toLowerCase().contains("john"));	
	}

}
