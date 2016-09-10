import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
//import java.util.Arrays;



public class ActiveText{

	public void gameTime(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		//	public static void main(String[] args){
		boolean programRunning = true;
		boolean action = false;
		boolean hasWon=false;

		int sidelength=28; // must be even for now
		int xpos=(sidelength/2); //starting position
		int ypos=xpos;

		int targetXPos = 10;
		int targetYPos = 10;

		ArrayWork arrayControls = new ArrayWork();
		System.out.println("1-9 (z-e) to move. 5 (s) shoots. Hit the asteroid (#) to win.");
		System.out.println("Note: you must press enter after each movement");
		System.out.println("0 (f) quits the game");
		System.out.println("Press a key to begin");
		System.out.print(">> ");

		while(programRunning){
			try {
				String userIn = input.nextLine ();

				char charZero=userIn.charAt(0);
				//System.out.println(userIn); //for troubleshooting

				if (userIn.charAt(0)=='w'){ypos--;}
				else if (charZero=='a'){xpos--;}
				else if (charZero=='x'){ypos++;}
				else if (charZero=='d'){xpos++;}
				else if (charZero=='q'){xpos--;ypos--;}
				else if (charZero=='e'){xpos++;ypos--;}
				else if (charZero=='z'){xpos--;ypos++;}
				else if (charZero=='c'){xpos++;ypos++;}
				else if (charZero=='s'){action=!action;}
				else if (charZero=='f'){programRunning=false;}

				if (action==true){
					System.out.println("X=" + xpos);
					System.out.println("Y=" + ypos);
				}	
				System.out.println("X=" + xpos);
				System.out.println("Y=" + ypos);
				/* Favourite things about fallout:
				 * Sierra Madre
				 * Cars
				 * Music
				 * Architecture of Buidlings
				 * Overall feel (walking out in the wasteland listening to ink spots shooting at ghouls, overcast sky, etc)
				 * Abandond Vaults (seeing the story behind it, what happened, what they were made for)
				 * Little stories of people (bones with a 10mm and a glass of rum nearby)
				 * Music again (It's just so good, all around)
				 * Tech of the time (vacuum tubes, big CRT tv's, old typewriter style keyboards, room sized red computers, etc)
				 * 
				 */

				if (action==true){
					hasWon = arrayControls.showBullet(ypos, xpos, sidelength, action, targetXPos, targetYPos);
					action=false;
				} else {
					arrayControls.showField(ypos, xpos, sidelength, targetXPos, targetYPos);

				}

				System.out.print(">> ");

				if (hasWon==true){
					System.out.println("YOU WIN!!!");
					programRunning=false;
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bounds");		
			}
		}
		//input.close();
		System.out.println("Game Terminated");

		//}
	}
}