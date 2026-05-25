package Day6;

public class Array_Search {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 6};
		
		int search_element = 5;
		boolean status = false;
		
		for(int val:a)
		{
			if(val == search_element)
			{
				status = true;
				break;
			}
		}
		if(status)
			System.out.println("element is found");
		else
			System.out.println("element isn't found");
		

	}

}
