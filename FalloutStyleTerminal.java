import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Set;
//import java.io.PrintStream;
import java.util.HashSet;

public class FalloutStyleTerminal{
	
	private static String[][] optionsArray=new String[16][2];
	private static String[][] randArray=new String[16][2];
	
	private static Scanner input = new Scanner(System.in);
	
	public void runTerminal() throws InterruptedException{
		
		int xKeyOne = 0;
		int xKeyTwo = 0;
		Float timesCharFound = 0F;
		byte sleepTime = 10;
		byte numberOfTries = 0;
		boolean correctAnswer = false;
		String answer = "NIHIL";
		//String userIn;
		
		randArray[0][0]="0x932 @$%&%$#^&%";randArray[1][0]="0x498 &&^%#%^&*(";
		randArray[2][0]="0x482 *(*%$@$^&(";randArray[3][0]="0x948 @$%&%$#^&%";
		randArray[4][0]="0x234 @$%&%$#^&%";randArray[5][0]="0x325 *(*%$@$^&(";
		randArray[6][0]="0x145 @$%&%$#^&%";randArray[7][0]="0x189 @$%&%$#^&%";
		randArray[8][0]="0x000 *(*%$@$^&(";randArray[9][0]="0x487 ^%$#^^%$@#";
		randArray[10][0]="0x234 @$%&%$#^&%";randArray[11][0]="0x325 *(*%$@$^&(";
		randArray[12][0]="0x145 @$%&%$#^&%";randArray[13][0]="0x189 @$%&%$#^&%";
		randArray[14][0]="0x000 *(*%$@$^&(";randArray[15][0]="0x487 ^%$#^^%$@#";
		
		randArray[0][1]="0x426 @$%&%$#^&%";randArray[1][1]="0x247 **&%*^$@$^";
		randArray[2][1]="0x634 *(*%$@$^&(";randArray[3][1]="0x684 &&^%#%^&*(";
		randArray[4][1]="0x721 #$&&$#@!#*";randArray[5][1]="0x149 ^%$#^^%$@#";
		randArray[6][1]="0x715 #%&&%))&%*";randArray[7][1]="0x237 @$%&%$#^&%";
		randArray[8][1]="0x366 &&^%#%^&*(";randArray[9][1]="0x648 @$%&%$#^&%";
		randArray[10][1]="0x721 #$&&$#@!#*";randArray[11][1]="0x149 ^%$#^^%$@#";
		randArray[12][1]="0x715 #%&&%))&%*";randArray[13][1]="0x237 @$%&%$#^&%";
		randArray[14][1]="0x366 &&^%#%^&*(";randArray[15][1]="0x648 @$%&%$#^&%";

		optionsArray[0][0]="BEAST";optionsArray[1][0]="NIHIL";
		optionsArray[2][0]="CARDS";optionsArray[3][0]="ALINE";
		optionsArray[4][0]="FREER";optionsArray[5][0]="YIELD";
		optionsArray[6][0]="JOLTY";optionsArray[7][0]="FREEZ";
		optionsArray[8][0]="LIMOS";optionsArray[9][0]="KILLS";
		optionsArray[10][0]="MISER";optionsArray[11][0]="LIGHT";
		optionsArray[12][0]="MOLDY";optionsArray[13][0]="WICKS";
		optionsArray[14][0]="PRINT";optionsArray[15][0]="SKEET";
		
		optionsArray[0][1]="BUXOM";optionsArray[1][1]="KIOSK";
		optionsArray[2][1]="SERES";optionsArray[3][1]="UNARY";
		optionsArray[4][1]="KYRIE";optionsArray[5][1]="TIMMY";
		optionsArray[6][1]="REUSE";optionsArray[7][1]="FLATS";
		optionsArray[8][1]="PLACE";optionsArray[9][1]="BIGGY";
		optionsArray[10][1]="CREED";optionsArray[11][1]="PIGGY";
		optionsArray[12][1]="SHIED";optionsArray[13][1]="CHIKE";
		optionsArray[14][1]="KILLD";optionsArray[15][1]="MOOSE";
		

		displayIntro(sleepTime);
		
		for (int y=0; y<=1; y++){
			for (int x=0; x<randArray.length; x++){
				displayRand(x,y,sleepTime);
				if ((x % 2)==0){
					xKeyOne=displayKeyOne(xKeyOne, sleepTime);
				} else {
					xKeyTwo=displayKeyTwo(xKeyTwo, sleepTime);
					System.out.println("");
				}
			}
		}
		
		while(correctAnswer!=true) {
			System.out.print(">");
			String userIn=input.nextLine().toUpperCase();
			
			
			if (userIn.length()==answer.length()){
				
				String userInCut = removeDuplicates(userIn);
				
				for (int charOfInput=0; charOfInput<userInCut.length(); charOfInput++){
					char charToFind=userInCut.charAt(charOfInput);
					
					for(int counter=0;counter<answer.length(); counter++){
						char ansCharAtCounter = answer.charAt(counter);
						if (ansCharAtCounter==charToFind){
							timesCharFound++;
						}
					}
				}
				//System.out.println("Likeness: " + ((timesCharFound/userIn.length())*100) + "%");
				displayLikeness(timesCharFound, userIn, sleepTime);
				timesCharFound=0F;


			} else {
				System.out.println(">Invalid, please try again.");
				numberOfTries--;
			}

			if (userIn.equals(answer)){
				displayEnd(sleepTime);
				break;
			}	
			
			if (numberOfTries>=3){
				displayLose(sleepTime);
				break;
			}
			
			numberOfTries++;
			for (int charCount = 0; charCount<20; charCount++){
				System.out.print("Attempts Remaining: ".charAt(charCount));
				TimeUnit.MILLISECONDS.sleep(sleepTime*4);
			
			}
			System.out.println(4-numberOfTries);
			
		}

		/////////////////////////////////////////////////////////////////////
	}
	public static void displayLose(byte sleepTime) throws InterruptedException{
		String [] endingArray =new String [2];
		
		endingArray[0]="TERMINAL LOCKED";
		endingArray[1]="PLEASE CONTACT AN ADMINISTRATOR";
		
		
		for (int i =0; i<endingArray.length; i++){
			for (int charCount = 0; charCount<endingArray[i].length(); charCount++){
				
			System.out.print(endingArray[i].charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime);
			
			}
			System.out.println("");
		}
		
		for (int i=0; i<30; i++){ //i<22 should be changed to the height of your console
			System.out.println("");
			TimeUnit.MILLISECONDS.sleep(sleepTime);

		}

		
	}

	public static void displayLikeness(Float timesCharFound, String userIn, byte sleepTime) throws InterruptedException{
		///String likeness = "Likeness:";

		for (int charCount = 0; charCount<9; charCount++){
			System.out.print("Likeness:".charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime*4);
		}
		System.out.printf("%.0f", ((timesCharFound/userIn.length())*100));
		System.out.print("%");
		System.out.println(" (" + timesCharFound +")");
	}
	
	public static void displayRand(int x, int y, byte sleepTime) throws InterruptedException{
		for (int charCount = 0; charCount<(randArray[0][0].length()); charCount++){
			System.out.print(randArray[x][y].charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		}
	}
	
	public static int displayKeyOne(int xKeyOne, byte sleepTime) throws InterruptedException{
		String spaces = "     ";
		
		for (int charCount = 0; charCount<(optionsArray[0][0].length()); charCount++){
			System.out.print(optionsArray[xKeyOne][0].charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		}
		
		for (int charCount = 0; charCount<(spaces.length()); charCount++){
			System.out.print(spaces.charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		}
		
		xKeyOne++;
		return xKeyOne;
		
	}
	
	public static int displayKeyTwo(int xKeyTwo, byte sleepTime) throws InterruptedException{
		
		for (int charCount = 0; charCount<(optionsArray[0][0].length()); charCount++){
			System.out.print(optionsArray[xKeyTwo][1].charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		}
		
		xKeyTwo++;
		return xKeyTwo;
		
	}

	public static void displayIntro(byte sleepTime) throws InterruptedException{
		String introOne="Welcome to ROBCO Industries (TM) Termlink";
		String introTwo="Password Required";
		for (int charCount = 0; charCount<introOne.length(); charCount++){
			System.out.print(introOne.charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		}
		System.out.println("");
		System.out.println("");
		for (int charCount = 0; charCount<introTwo.length(); charCount++){
			System.out.print(introTwo.charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static void displayEnd(byte sleepTime) throws InterruptedException{
		String [] endingArray =new String [11];
		
		endingArray[0]="ROBCO INDUSTRIES UNIFIED OPERATING SYSTEM";
		endingArray[1]="COPYRIGHT 2075-2077 ROBCO INDUSTRIES";
		endingArray[2]="-SERVER #1-";
		endingArray[3]="=========================================";
		endingArray[4]=">\\ WELCOME, Overseer";
		endingArray[5]="=========================================";
		endingArray[10]=">\\ DEFENSE SYSTEM: STATUS AND CONTROL";
		endingArray[6]=">\\ MUSIC: STATUS AND CONTROL";
		endingArray[7]=">\\ LIFE SUPPORT: STATUS AND CONTROL";
		endingArray[8]=">\\ VAULT DOOR: STATUS AND CONTROL";
		endingArray[9]=">\\ OVERSEER'S SAFE: STATUS AND CONTROL";
		
		for (int i =0; i<endingArray.length; i++){
			for (int charCount = 0; charCount<endingArray[i].length(); charCount++){
				
			System.out.print(endingArray[i].charAt(charCount));
			TimeUnit.MILLISECONDS.sleep(sleepTime);
			
			}
			System.out.println("");
		}
		
		for (int i=0; i<22; i++){ //i<22 should be changed to the height of your console
			System.out.println("");
			TimeUnit.MILLISECONDS.sleep(sleepTime/2);

		}
	}
	
	public static String removeDuplicates(String str){
		Set<Character> set = new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		for(int i=0; i<str.length();i++){
			Character c=str.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
	}

}



