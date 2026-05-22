package Day5;

public class Loops {

	public static void main(String[] args) {
		// 1. while loop
		int i = 1;
		while(i<=10)
		{
			System.out.println("Hello world "+ i);
			i++;
		}
		
	   //2. do.. while loop
	    
		int i2 = 10;
		
		do 
		{
		System.out.println(i2);
		i2++;
			
		}while(i2<=10);
		
	 //3. For loop
		for(int i3 = 2; i3<10; i3+=2)
		{
			System.out.println(i3);
		}
		
		
	// # Jumping statements, continue
		
		int i4 = 0;
		while(true) {
			if (i4==10) 
				break;
			if (i4%2 == 0)
			{   i4++;
				continue;
			}
						
			System.out.println(i4);
			i4++;
		}
		
	}

}
