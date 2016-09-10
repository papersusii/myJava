//ArithmeticException
//ClasNotFoundException
//IllegalArgumentException
//IndexOutOfBoundsException
//InputMismatchException
//IOException
import java.io.FileNotFoundException;
import java.util.*;

public class JavaLessonSix {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		//divideByZero(2);
		//int age = checkValidAge();
		getAFile("./something.txt");
		
		
	}
	
	public static void getAFile(String fileName){
		try {
		FileInputStream file = new FileInputStream(fileName);
		}catch(FileNotFoundException e){
			System.out.println("404");
		}catch(Exception e){
			System.out.println("some error occurred");
		}
	}
	
	//public static char getAFile(String fileName){
	
	public static int checkValidAge() {
		try {
			return userInput.nextInt();
		} catch (InputMismatchException e) {
			userInput.next();
			System.out.print("That isn't a number");
			return 0;
		}
	}
	public static  void divideByZero(int a) {
		try {
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			System.out.println("You can't do that");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}