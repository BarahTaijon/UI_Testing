package Day6;

public class Assignment2_LargestAndLowest_NumInArray {

	public static void main(String[] args) {
		
		int arr[] = { 12, 11, 13, 5, 6 };
		
		int largest = arr[0], lowest = arr[0];
		
		int n = arr.length;
		
		for (int i=1; i<n; i++)
		{
			if (arr[i]>largest)
				largest = arr[i];
			if(arr[i]<lowest)
				lowest = arr[i];
		}

		System.out.println("The largest number is : "+largest);
		System.out.println("The lowest number is : "+lowest);
	}

}
