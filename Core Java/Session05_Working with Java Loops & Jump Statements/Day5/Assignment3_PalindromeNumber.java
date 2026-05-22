package Day5;

public class Assignment3_PalindromeNumber {

	
	static boolean isPalindrome(int n) {
		
		String s = Integer.toString(n);
		int len = s.length();
		
		for(int i = 0; i < len / 2; i++)
			 if (s.charAt(i) != s.charAt(len - i - 1))
	                return false;
		return true;
	}
	
	
	public static void main(String[] args) {
        int n = 12321;
        if (isPalindrome(n) == true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

	}

}
