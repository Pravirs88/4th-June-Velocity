package methodsofString;

public class TrimMethod {

	public static void main(String[] args) {
		
		
		String a ="   Tanvir";
		
		String b= "Shinde";
		
		
		String new1 =a.trim();   //here by use trim method remove spaces.
		
		// System.out.println(new1);
		
		        
	String beforeTrim =	 a.concat(b);
	
	String afterTrim = new1.concat(b);
	
	System.out.println(beforeTrim);
	
	System.out.println(afterTrim);
		
		
		
	}
	
	
}
