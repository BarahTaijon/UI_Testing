package Day6;

import java.util.Arrays;

public class Array_PrintInReverse {

	public static void main(String[] args) {
		
		
		int a[] = {100, 200, 300, 400, 500};
		
		for(int v : a)
		System.out.print(v+ " ");
		
		System.out.println();
		
		for(int i = a.length-1 ; i>=0 ; i--)
			System.out.print(a[i]+" ");
		
	}
	}


