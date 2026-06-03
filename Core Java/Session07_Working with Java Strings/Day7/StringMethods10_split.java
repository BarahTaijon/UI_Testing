package Day7;

import java.util.Arrays;

public class StringMethods10_split {

	public static void main(String[] args) {
		
		String s = "abc1244@gmail.com";
		
		String a[] = s.split("@");
		
		System.out.println(Arrays.toString(a));	
		
		System.out.println(a[0]); //abc1244
		System.out.println(a[1]); //gmail.com		
		

	}

}
