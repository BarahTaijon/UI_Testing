package Day6;

import java.util.Arrays;

public class Array_Sorting {

	public static void main(String[] args) {

		int a1[] = {700, 800, 200, 400, 100, 900};
		
		System.out.println("Befor sorting: "+ Arrays.toString(a1));

		Arrays.sort(a1);
		
		System.out.println("After sorting: "+ Arrays.toString(a1));	
		
		System.out.println();
		
		char a2[] = {'A', 'N', 'L', 'B', 'K', 'D', 'C'};
		
		System.out.println("Befor sorting: "+ Arrays.toString(a2));
		
		Arrays.sort(a2);
		
		System.out.println("After sorting: "+ Arrays.toString(a2));
	
		System.out.println();
		
		String a3[] = {"Amir", "Maram", "Nader", "Sami", "Eman", "shahed"};
		
		System.out.println("Befor sorting: "+ Arrays.toString(a3));
		
		Arrays.sort(a3);
		
		System.out.println("After sorting: "+ Arrays.toString(a3));
	

	}

}
