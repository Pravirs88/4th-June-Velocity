package methodsofString;

public class EqualMethodCaseSensitive {

	
	public static void main(String[] args) {
		
		String a="TANVIR";
		
		String b="tanvir";
		
		String c="TANVIR";
		
		         //use of equal method to check case sensitive.
		
		     boolean equals = a.equals(b);
		     
		     System.out.println(equals);
		     
		     
		    
		    boolean   equals1 =a.equals(c);
		    
		    System.out.println(equals1);
	}
}
