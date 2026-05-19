package Day2;

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		// primitive data type:
		
		
		//1. Number without decimal

		int a = 100, b = 200; 
		System.out.println("the sum of a and b is : "+a+b); // output: the sum of a and b is : 100200
		System.out.println("the sum of a and b is : "+(a+b)); //output: the sum of a and b is : 300		
		
		byte by = 125; 
		System.out.println(by);
		
		short sh = 3535;
		System.out.println(sh);
		
		long l = 123456789L; // literal is needed l/L
		System.out.println(l);
		
		
		// 2. number with decimal
		
		float item_price = 15.4F; // literal is needed F/f
		System.out.println(item_price);
		
		double dbl = 1234.12344; 
		System.out.println(dbl);		
		
		
		// 3. string, char, boolean
		
		char grad = 'A';
		System.out.println(grad);
		
		String name = "John";
		System.out.println(name);
		
		//char ch = 'ABC';		//invalid
		//String ch = 'ABC';	//invalid
		//Sting ch = 'A';		//invalid
		String ch = "C";		//valid
		System.out.println(ch);	
		
		boolean b1 = true;
		System.out.println(b);
		b1 = false;
		System.out.println(b);
		
		
		//boolean bl = "true";	// invalid
		//String bl = true;		// invalid
		String bl = "true"; 
		
		final int f = 200;	
		
		
	}

}
