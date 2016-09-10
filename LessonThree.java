public class LessonThree {
	
	public static void main(String[] args)
	{
		int valueOne = 1;
		int valueTwo = 2;
		
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
				
		System.out.println("The bigger value is " + biggestValue);
		
		char theGrade = 'D';
		
		switch (theGrade) {
		case 'A':
			System.out.println("great job");
			break;
		case 'b':
		case 'B':
			System.out.println("fair job");
			break;
		case 'C':
			System.out.println("okay job");
			break;
		case 'D':
			System.out.println("bad job");
			break;
		default:
			System.out.println("terrible job");
			break;
		}
		
		
		
		
		
		if ((true) ^ (true)){
			System.out.println("at least One are true");
		}

		
		
		/* ! not
		 * & and, always checks both
		 * && and, stops after first false
		 * || or
		 * ^ xor
		 */
	
		}
}