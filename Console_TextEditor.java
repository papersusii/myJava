import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Console_TextEditor{
	private static Scanner userinput;

	public String[] textFileNames={" "," "," "," "," "};
	public String[] textFileData={" "," "," "," "," "};	

	public void createTextFile(byte  fileLocation){
		userinput = new Scanner(System.in);

		System.out.print("Title: ");
		
		//https://www.reddit.com/r/IAmA/comments/4rwsnz/iama_sex_worker_who_has_been_reaching_out_to_the/
		
	
		
		textFileNames[fileLocation]=userinput.nextLine();
		
		System.out.println("");
//**----**---*/--*--**-
		
		
		System.out.print("Text: ");
		
		textFileData[fileLocation]=userinput.nextLine();
		//userinput.close();
		//textFileData[1]=textFile;
		//return "textFile";	
	}
	
	public void recallTextFile(String textFile){
		System.out.println("You typed: ");
		System.out.println(textFile);
	}
	
	public void helpFile() throws InterruptedException{
		String[] helpArray = {"Avaliable Commands (Caps Ignored):",">New Textfile [creates a (fake) textfile in memory]",
		">Disp Textfile",">[Basic Arithmatic, RPN style]",">Game [horrible version of asteroid blaster]",
		">Terminal [fallout style terminal game]",">## work $ [##=milliseconds/char (0n-nn; 10 recommended); $= time in minutes (.n-nn)",
		">Exit"};
		System.out.println("");
		for (int i=0; i<helpArray.length; i++){
			for (int charCount=0; charCount<helpArray[i].length(); charCount++){
				System.out.print(helpArray[i].charAt(charCount));
				TimeUnit.MILLISECONDS.sleep(10);

			}
			System.out.println("");
		}
	}
	
	
}