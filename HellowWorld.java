import java.util.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class HellowWorld
{
	public static boolean b = false;

	static String randomString = "String to print";
	
	static final double PINUM = 3.14159;
	public static void main(String[] args)
	

	{
		
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000;
		long bigLong = 9220000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.142456745135;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 65;
		char anotherChar = 'A';
		
		char escapedChars = '\\';
		
		String randomString = "i;m a radnom string'";
		String anotherString = "stuff";
		
		String andAnotherString = randomString + ' ' + anotherString;
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigByte);
		String intString = Integer.toString(bigByte);
		String longString = Byte.toString(bigByte);
		String floatString = Byte.toString(bigByte);
		String doubleString = Byte.toString(bigByte);
		String booleantring = Byte.toString(bigByte);
		
		double aDoubleValue = 30000000000000000000000000.1456454;
		int doubleToInt = (int) aDoubleValue;
		
		int stringToInt = Integer.parseInt(intString);
		
		System.out.println(stringToInt);
		
		/*
		public static void getCh() {  
	        final JFrame frame = new JFrame();  
	        synchronized (frame) {  
	            frame.setUndecorated(true);  
	            frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);  
	            frame.addKeyListener(new KeyListener() {
	                @Override 
	                public void keyPressed(KeyEvent e) {  
	                    synchronized (frame) {  
	                        frame.setVisible(false);  
	                        frame.dispose();  
	                        frame.notify();  
	                    }  
	                }  
	                @Override 
	                public void keyReleased(KeyEvent e) {  
	                }  
	                @Override 
	                public void keyTyped(KeyEvent e) {  
	                }  
	            });  
	            frame.setVisible(true);  
	            try {  
	                frame.wait();  
	            } catch (InterruptedException e1) {  
	            }  
	        }  
	    }
	    */
		
	
		
	}
	
	
	
}