package Day6;

import java.util.Scanner;

public class Insertion_Statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");	
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.print("Enter a double number : ");	
		double d_num = sc.nextDouble();
		System.out.println(d_num);
		
		System.out.print("Enter your city : ");		 
		String city = sc.next();
		System.out.println(city);
		
		//Enter unknown data type
		
		System.out.print("Enter ِanything : ");		 
		Object num4 = sc.next();
		System.out.println("anything : "+num4); 
		
		
	}

}
