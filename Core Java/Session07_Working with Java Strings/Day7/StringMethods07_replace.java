package Day7;

public class StringMethods07_replace {

	public static void main(String[] args) {
		
		String s = "welcome to selenium java selenium python";

		System.out.println(s.replace('e', 'X')); //wXlcomX to sXlXnium java sXlXnium python
		System.out.println(s.replace("selenium", "home")); //welcome to home java home python
		

		
		String amount = "$12,88,99";
		System.out.println(amount.replace("$", "").replace(",",""));
		
	}

}
