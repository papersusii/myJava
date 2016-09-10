import java.util.Scanner;



public class Console{
	private static Scanner input = new Scanner(System.in);
	//public static String[] textFileNames={" "," "," "," "," "};
	//public static String[] textFileData={" "," "," "," "," "};

	public static void main(String[] args){


		boolean prgm = true;
		float valOfCalc =0F;
		String userUsed = "blank"; 
		String userIn = "blank";
		String userInSave = "blank";
		
		String textFile="";
			

		Console_Calculator callCalc = new Console_Calculator();
		Console_TextEditor callText = new Console_TextEditor();
		ActiveText callGame = new ActiveText();
		FalloutStyleTerminal callTerm = new FalloutStyleTerminal();
		LooksLikeWork callWork = new LooksLikeWork();

		System.out.print(">> ");


		while(prgm){
			try {
				
				userIn = input.nextLine ();
				userIn = userIn.toLowerCase();
				
				if (userIn.isEmpty()){
					userUsed=userInSave;
				} else {
					userUsed=userIn;
					userInSave=userIn;
				}
				
				if (userUsed.equals("help")) {
					callText.helpFile();
				}
				else if (userUsed.indexOf("nt")>=0) {
					System.out.println("nt #");
					
					byte fileLocation = Byte.parseByte(userUsed.substring(3,4));
					callText.createTextFile(fileLocation);
					
					System.out.println(callText.textFileNames[fileLocation]);
					System.out.println(callText.textFileData[fileLocation]);
					
				} else if (userUsed.equals("disp textfile")) {
					callText.recallTextFile(textFile);

				}  else if (userUsed.indexOf('+') >=0) {
					valOfCalc = callCalc.addFunction(userUsed,valOfCalc);

				} else if ((userUsed.indexOf('-')) >=0) {
					valOfCalc = callCalc.subFunction(userUsed,valOfCalc);

				} else if ((userUsed.indexOf('*')) >=0) {
					valOfCalc = callCalc.multFunction(userUsed,valOfCalc);

				} else if ((userUsed.indexOf('/')) >=0) {
					valOfCalc = callCalc.divFunction(userUsed,valOfCalc);

				} else if ((userUsed.charAt(0)==('.'))) { //why can't you use .equals with pt char?
					valOfCalc=callCalc.clearFunction();

				} else if ((userUsed.equals("game"))) {
					callGame.gameTime();

				} else if ((userUsed.equals("terminal"))){
					callTerm.runTerminal();

				} else if ((userUsed.indexOf("work")) >=0) {
					callWork.randomWork(Integer.parseInt(userUsed.substring(0,2)), Float.parseFloat(userUsed.substring(8)));
					System.out.println("");
				} else if (userUsed.equals("blank")){
					System.out.println("Your field is blank. Showing helpfile.");
					callText.helpFile();

				} else if ((userUsed.equals("terminate")) || (userUsed.equals("exit"))) {
					prgm = false;

				} else {
					System.out.println("Invalid Command");
				}
				
				System.out.print(">> ");

			}catch(StringIndexOutOfBoundsException e){
				System.out.println("Error: String index out of bounds");
				System.out.print(">>");
				
			}catch(NumberFormatException e){
				System.out.println("If using work function, the first number MUST be 2 digits.");
				System.out.print(">>");
				
			}catch(Exception e){
				//System.out.print(e);
				System.out.println("Something Went Wrong (You did something wrong)");
				System.out.print(">> ");
			}
		}
		System.out.println("Session terminated");
		//System.out.print("Goodbye");

	}
} 