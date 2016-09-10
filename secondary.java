import java.util.Scanner;

public class secondary {
	public void enteraName(){
		String name;
		Scanner sc = new Scanner(System.in);
		
		primary sendName = new primary();
		
		System.out.println("Enter your name:");
		name = sc.nextLine();
		
		sendName.printName(name);
		
		sc.close();
	}
	
	public void printing(){
		System.out.println("printing words");
		primary callPrimary = new primary();
		
		Scanner sc = new Scanner(System.in);
		String userin;
		userin=sc.nextLine();
		
		callPrimary.printName(userin);
		sc.close();
	}
	
	
}