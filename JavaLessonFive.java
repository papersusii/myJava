import java.util.Scanner;

public class JavaLessonFive {
	static double myPi = 3.14159; //class variable, accessible anywhere inside this class
	static int randomNumber; //Class variable
	static Scanner userin = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(getRadnomNum());
		//accessModifier static  returnType methodName ()
		//System.out.println("Global " + myPi);

	//	System.out.println(addThem(1,2));
		//int d=5;
		//tryToChange(d); //passes the VALUE of d. equal to tryToChange(5);
	//	System.out.println("main d = " + d);
		System.out.println(getRadnomNum());
		int guessResult = 1;
		int randomGuess = 0;
		while (guessResult != -1){
			System.out.print("Guess a number btwn 0 and 50");
			randomGuess = userin.nextInt();
			guessResult = checkGuess(randomGuess);
		//	Systme.out.println(guess)
		}
	}
	
	public static int getRadnomNum() {
		randomNumber = (int) (Math.random() * 51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess) {
		if(guess == randomNumber){
			return -1;
		} else {
			return guess;
		}
	}
	
	public static void tryToChange (int d) {
		d = d+1;
		System.out.println("tryToChange d = " + d);
	}
	
	public static int addThem(int a, int b) {

		
		System.out.println("Local " + myPi);
		int c = a+b;
		return c;
		//double smallPI = 3.140; //Local variable ONLY accessible by method addThem
		
		//double myPi = 3.0;
		//myPi = myPi + 3;
	}
}