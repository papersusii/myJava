public class LessonFour {
	public static void main(String[] args)
	{
		
		int k=1;
		do {
			System.out.println(k);
			k++;
			
		} while(k<10);
		
		// for (declare iterator; conditional statement; change iterator
		int m,n;
		for (m=1, n=2; m <= 9; m+=2, n+=2) {
			System.out.println(m+ "/n" + n);
		}
		for (int l=10; l >= 1; l--) {
			System.out.println(l);
		}
		//l only exists inside the for loop if you make it inside
		
		
		
		
		/*

		double myPi = 4.0;
		double j = 3.0;
		
		while(j <1000)
		{
			myPi = myPi - (4/j) + (4/(j+2));
			j +=4;
			System.out.println(myPi);
		}
		
		System.out.println("Pi: " + Math.PI);
		
		
		int i=1;
		while(i <=20)
		{
			if(i==3)
			{
				i+=2;
				continue; // jump out and go to top of while
			}
			System.out.println(i);
			i++;
			
			if((i%2)==0)
			{
				i++;
			}
			
			if(i>10)
			{
				break;
			}
		}
		*/
	}
}