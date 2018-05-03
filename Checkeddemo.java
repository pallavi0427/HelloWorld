package exceptiondemo;

import java.io.FileInputStream;
import java.io.*;

public class Checkeddemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream fls = null;
		try {
			fls = new FileInputStream ("abc.txt");
			//File reader fr = new File reader("abc.txt");
		}
		
		
	 
	catch (java.io.FileNotFoundException fnfe) {
		   System.out.println("Specified file does not exist");
      		fnfe.printStackTrace();
		}
			
		}

}
	
	


