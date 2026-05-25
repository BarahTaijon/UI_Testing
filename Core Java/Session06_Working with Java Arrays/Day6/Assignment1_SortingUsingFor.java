package Day6;

import java.util.Arrays;

public class Assignment1_SortingUsingFor {

	public static void main(String[] args) {
		
		 int arr[] = { 12, 11, 13, 5, 6 };

		 System.out.println(Arrays.toString(arr));
		 
		 int len = arr.length;
		 
		 for (int i = 1; i < len; ++i) 
		 {
	            int key = arr[i];
	            int j = i - 1;
	            
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
		 }
		 
		 System.out.println(Arrays.toString(arr)); 
	}

}

