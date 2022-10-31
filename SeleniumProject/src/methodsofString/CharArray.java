package methodsofString;

public class CharArray {

	public static void main(String[] args) {
		
		
		String abc ="Tanvir";
		
		  char[] jk  = abc.toCharArray();
		  
		  int size = abc.length();
		  
		  System.out.println(size);
		  // use of basic for loop:
		  for (int i=0 ; i<size ; i++)  {
			  
			  System.out.println("The iterate values are :" + jk[i]);
		  }
		  
		  // use of Advanced for loop:
		  
		  System.out.println("*******Advanced__For__Loop**********");
		  
		  for (char df : jk) {
			  
			  System.out.println("The iterate value for advanced for loop :"+ df);
		  }
		  
		  
	}
}
