import java.util.Scanner;

public class Countdown {
	
	private static int target = 0;
	private static int val1 =1;
	private static int val2 =2;
	private static int val3 =3;
	private static int val4 =4;
	private static int sum1=0;
	private static int sum2;
	private static int sum3;
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		
		boolean isBreak=false;
		
		
		for (int operator=0; operator<4; operator++){
			
			isBreak = operations1(operator);
			
			if (isBreak==true){
				break;
			}
		}

	
		/*
	
		
		for (int val1Count=0; val1Count<4; val1Count++){
			sum1 = opOne(val1, val2, val3, val4);
			
			for (int val2Count=0; val2Count<4; val2Count++){
				
				for (int val3Count=0; val3Count<4; val3Count++){
					
				}
			}
		}
		
		
	}
	
	
	
	public static int opOne(int val1, int val2, int val3, int val4){
		
		
		
		int sum1=1;
		return sum1;
	}
		
		*/
		
		/////////////////////////////////////////
///////////////////////////////////////
/////////////////////////////////////
		
		
		/*
		int numberOfInts=4;
		
		int[] optionsArray=new int[numberOfInts];
		
		System.out.println("new");
		
		for (int userInCount=0; userInCount<numberOfInts; userInCount++){
			optionsArray[userInCount]=Integer.parseInt(input.nextLine());
		}
		
		for (int userInCount=0; userInCount<numberOfInts; userInCount++){
			System.out.println(optionsArray[userInCount]);
		}
		
		
		for (int signA = 0; signA<4; signA++){
			if (signA==0){
				
			}
			if (signA==0){
				
			}
			if (signA==0){
				
			}
			if (signA==0){
				
			}
			for (int signB = 0; signB<4; signB++){
				
				for (int signC = 0; signC<4; signC++){
					
					optionsArray[0] signA optionsArray[1] signB optionsArray[2] signC optionsArray[3] signD
				}
			}
		}
		*/
		
		
	}
	
	public static boolean operations1(int operator){
		boolean bool = false;
		if (operator==0){
			sum1=val1+val2;
			if (sum1==target){
				System.out.println(target + "=" + val1 + "+" + val2);
				bool = true;
			} else {
				bool = false;
			}
		}
		if (operator==1){
			sum1=val1*val2;
			if (sum1==target){
				System.out.println(target + "=" + val1 + "*" + val2);
				bool = true;
			} else {
				bool = false;
			}
		}
		if (operator==2){
			sum1=val1-val2;
			if (sum1==target){
				System.out.println(target + "=" + val1 + "-" + val2);
				bool = true;
			} else {
				bool = false;
			}
		}
		if (operator==3){
			sum1=val1/val2;
			if (sum1==target){
				System.out.println(target + "=" + val1 + "/" + val2);
				bool = true;
			} else {
				bool = false;
			}
		} 
		return bool;
		
	}
	
}