package Day6;

public class Array_Repetition {

	public static void main(String[] args) {
		
		int a[] = {10, 2, 3, 4, 6, 10};
		
		int num = 10;
		int count = 0;
		
		for (int val :a)
			if(val == num)
				count ++;
		
		System.out.print(count);

	}

}
