package methodsofString;

public class EqualsMethodWithNotCaseSenstive {

	
	public static void main(String[] args) {
		
		
        String a="TANVIR";
		
		String b="tanvir";
		
		String c="TANVIR";
		
		
		       boolean equals = a.equalsIgnoreCase(b);
		       
		       System.out.println(equals);
		       
		       
		       boolean equals1 = a.equalsIgnoreCase(c);
		       
		       System.out.println(equals1);
	}
}
