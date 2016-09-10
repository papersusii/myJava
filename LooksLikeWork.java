import java.util.Random;
import java.util.concurrent.TimeUnit;
public class LooksLikeWork{
	private Random getRan = new Random();
	public void randomWork(int charsPerMS, float minutes) throws InterruptedException{
		String[] charArray = {"1","2","3","4","5","6","7","8","A","B","C","D","E","F","G","0"," ","_","?","-","1","2","3","4","5","6","7","8","A","B","C","D","E","F","G","0"," ","_","?","-","\n"};
		for (int i=0; i<((60000*minutes)/charsPerMS); i++){
			System.out.printf(charArray[getRan.nextInt(41)]);
			TimeUnit.MILLISECONDS.sleep(charsPerMS);
		}	
	}	
}


/*
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class LooksLikeWork{
	private Random getRan = new Random();
	public void randomWork(int iterations, int time) throws InterruptedException{
		String[] charArray = {"1","2","3","4","5","6","7","8","A","B","C","D","E","F","G","0"," ","_","?","-"};
		for (int i=0; i<iterations; i++){
			System.out.printf(charArray[getRan.nextInt(20)]);
			if (getRan.nextInt(50)==0){
				System.out.println("");	}
			TimeUnit.MILLISECONDS.sleep(time);
			}	}	}
*/

