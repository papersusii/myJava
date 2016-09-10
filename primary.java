import java.util.Random;
import java.util.Scanner;

public class primary{
	

	public static void main(String args[]){
		//secondary callSecondary = new secondary();
		//callClass.enteraName();
		//callSecondary.printing();
		Random dice = new Random();
		
		
		for(int count=0; count<50; count++){
			
			int x = dice.nextInt(8)+1;
			
			
		if ((x==1) || (x==3) || (x==5) || (x==6) || (x==9) || (x==8))
		{
			System.out.println(x);
		} else {
			System.out.println("The number is not 1,3,5,6,9, or 8. It it:" + x);
		}
		}
		
	}
	
	public void printName(String sentName){
		System.out.println(sentName);
	}
	
	public void requestInput(){
		Scanner sc = new Scanner(System.in);
		String userin;
		userin=sc.nextLine();
		System.out.println(userin);
		sc.close();
	}
	//public void printName(String recievedName){
	//	System.out.println("You entered " + recievedName);
	//}
}
