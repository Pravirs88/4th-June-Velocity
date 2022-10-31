package methodsofString;

public class MutableImutableConcept {

	
	public static void main(String[] args) {
		
		
		int c=10;
		
		c++;
		
		// here first c=10 then we add c++ post increment operator so primitive datatype 
		// mutable in nature as it changes values
		
		System.out.println(c);
		
	// String Data Type are immutable in nature.
		String s="Tanvir";
		
		String ss=" Shinde";
		
		    String joinValue = s.concat(ss);
		    		
		    		System.out.println(joinValue);
		    
		               System.out.println(s);
		               
		    //The value will be change only in this case we do like this
		               
		         s=s.concat(ss) ; 
		         
		         System.out.println(s);
	}
}
