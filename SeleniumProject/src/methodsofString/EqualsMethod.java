package methodsofString;

public class EqualsMethod {

	public static void main(String[] args) {
		

		String jk ="Tanvir_Shinde";
		
		String jk1 ="Tanvir_Shinde";
		
	       // Use of equals method.
		
	     boolean equals = jk.equals(jk1);
		     
		     System.out.println(equals);
		     
		     // 2nd way to define equality
		  if (jk==jk1) {
			  
			  System.out.println("We have same String");
		  }   
		  
		  else {
			  
			  System.out.println("We have different  String");
		  }
		
	}
	
}
