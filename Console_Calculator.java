//import java.util.*; 

public class Console_Calculator{
	public Float addFunction(String userin, Float valOfCalc){
		//Console callConsole = new Console();
		
		String userInRight=userin.substring(userin.lastIndexOf("+")+1);
		//System.out.println(Float.parseFloat(userInRight));
		if ((userin.charAt(0)) != '+') {
			int stringVar = userin.indexOf("+");
			String userInLeft=userin.substring(0 , stringVar);
			
			valOfCalc = ((Float.parseFloat(userInRight)) + (Float.parseFloat(userInLeft)));
			System.out.println("= " + valOfCalc);
		} else {
			valOfCalc = valOfCalc + (Float.parseFloat(userInRight));
			System.out.println("= " + valOfCalc);
		}
		return valOfCalc;
		//callConsole.calcMem(valOfCalc);
		
	}
	
	public Float subFunction(String userin, Float valOfCalc){
		String userInRight=userin.substring(userin.lastIndexOf("-")+1);
		if ((userin.charAt(0)) != '-') {
			int stringVar = userin.indexOf("-");
			String userInLeft=userin.substring(0 , stringVar);
			
			valOfCalc = ((Float.parseFloat(userInLeft)) - (Float.parseFloat(userInRight)));
			System.out.println("= " + valOfCalc);
		} else {
			valOfCalc = valOfCalc - (Float.parseFloat(userInRight));
			System.out.println("= " + valOfCalc);
		}
		return valOfCalc;
	}
	
	public Float multFunction(String userin, Float valOfCalc){
		String userInRight=userin.substring(userin.lastIndexOf("*")+1);
		if ((userin.charAt(0)) != '*') {
			int stringVar = userin.indexOf("*");
			String userInLeft=userin.substring(0 , stringVar);
			
			valOfCalc = ((Float.parseFloat(userInRight)) * (Float.parseFloat(userInLeft)));
			System.out.println("= " + valOfCalc);
		} else {
			valOfCalc = valOfCalc * (Float.parseFloat(userInRight));
			System.out.println("= " + valOfCalc);
		}
		return valOfCalc;
	}
	
	public Float divFunction(String userin, Float valOfCalc){
		String userInRight=userin.substring(userin.lastIndexOf("/")+1);
		if ((userin.charAt(0)) != '/') {
			int stringVar = userin.indexOf("/");
			String userInLeft=userin.substring(0 , stringVar);
			
			valOfCalc = ((Float.parseFloat(userInLeft)) / (Float.parseFloat(userInRight)));
			System.out.println("= " + valOfCalc);
		} else {
			valOfCalc = valOfCalc / (Float.parseFloat(userInRight));
			System.out.println("= " + valOfCalc);
		}
		return valOfCalc;
	}
	
	public Float clearFunction(){
		System.out.println("=0");
		return (float) (0F);
	}
}