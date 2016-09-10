//import java.util.concurrent.TimeUnit;

public class ArrayWork{

	public void showField(int ypos, int xpos, int sidelength, int targetXPos, int targetYPos){
		String[][] field=new String[sidelength][sidelength];

		
		for(byte x = 0; x < field.length; x++){
			for(byte y=0; y < field[x].length; y++){
				field[x][y] = " ";
			}
		}
		
		
		field[ypos][xpos] = "^";				
		field[ypos+1][xpos] = "|";
		field[ypos+1][xpos+1] = "\\";
		field[ypos+1][xpos-1] = "/";
		field[ypos+2][xpos] = "$";
		field[ypos+2][xpos+1] = "$";
		field[ypos+2][xpos-1] = "$";
		
		field[targetYPos][targetXPos] = "#";
		
		
		for(byte x = 0; x < field.length; x++){
			for(byte y=0; y<field[x].length; y++){
				System.out.print("(" + field[x][y] + ") ");
			}
			System.out.println("");
		}
		
	}

	public boolean showBullet(int ypos, int xpos, int sidelength, boolean hasWon, int targetXPos, int targetYPos){
		
		for(int counter=(ypos-1); counter>=0; counter--){
			
			try {
				String[][] field=new String[sidelength][sidelength];

				for(byte x = 0; x < field.length; x++){
					for(byte y=0; y < field[x].length; y++){
						field[x][y] = " ";
					}
				}
				
				field[ypos][xpos] = "|";				
				field[ypos+1][xpos] = "|";
				field[ypos+1][xpos+1] = "\\";
				field[ypos+1][xpos-1] = "/";
				field[ypos+2][xpos] = "$";
				field[ypos+2][xpos+1] = "$";
				field[ypos+2][xpos-1] = "$";
				
				field[counter][xpos] = "^";
				field[counter+1][xpos] = "|";
				
				field[targetYPos][targetXPos] = "#";
				
				for(byte x = 0; x < field.length; x++){
					for(byte y=0; y<field[x].length; y++){
						System.out.print("(" + field[x][y] + ") ");
					}
					System.out.println("");
				}
				//
				Thread.sleep(100);
				System.out.println(">> ");



			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("ERROR ERROR ERROR");
			}
			
			//ypos--;
			//System.out.print(">> ");

		}
		if ((targetXPos == xpos) && (ypos > targetYPos)) {
			hasWon=true;
		} else {
			hasWon=false;
		}
		
		return hasWon;
		//action=false;
		//return action;
	}
}