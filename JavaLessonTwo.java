import java.util.Scanner;
import java.util.*; 
public class JavaLessonTwo
{
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Your favourite number: ");
		
		if (userInput.hasNextInt())
		{
			int numberEntered = userInput.nextInt();
			
			System.out.println("you entered " + numberEntered);
			
			int numberEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numberEnteredTimes2);
			
			int numberEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - 2 = " + numberEnteredMinus2);
			
			int numberEnteredTimesItself = numberEntered*2;
			System.out.println(numberEntered + "*" + numberEntered + " = " + numberEnteredTimesItself);
			
			numberEntered += 2;
			numberEntered--;
			
			int whichIsBigger = Math.max(5,  7);
			int whichIsSmaller = Math.min(5,  7);
			
			double numSqrt = Math.sqrt(5.23);
			
			int numCeiling = (int) Math.ceil(5.23);
			int numFloor = (int) Math.floor(5.23);
			int numRound = (int) Math.round(5.23);
			
			int randomNumber = (int) (Math.random() * 11);
			
					System.out.println(randomNumber);
		} else {
			
			System.out.println("Enter an integer next time");
		}
	}
}