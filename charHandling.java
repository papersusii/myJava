public class charHandling{
	public void charHandle(String userIn){
		char charZero=userIn.charAt(0);
		//System.out.println(userIn);
		
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
		
	}
}