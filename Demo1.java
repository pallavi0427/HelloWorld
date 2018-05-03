package exceptiondemo;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(" firstline");
		float j;
		for  (j=0 ; j<5; j++ )
		{
	       try {
		         System.out.println((1/j));
	           }
	       catch (Exception e) {
	        	System.out.println(" An execptions occured");
	          }
		}	
	
	System.out.println("last line");	
	

}
}