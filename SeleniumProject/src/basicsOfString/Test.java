package basicsOfString;

public class Test {

	
	
	public static void main(String[] args) {
		
		String [] ss = new String [5];
		
		 ss [0] ="Tanvir_Shinde";
		 ss[1]= "Ambika_More";
		 ss[2]="Renuka_Madane";
		 ss[3]="Atul_Mishra";
		 ss[4]="Dhiraj_Master";
		 
		 System.out.println("Tanvir");
		 
		 //Calling of Main Method from Test2 Class As Classname.main(args)
		 
		 Test2.main(ss); // here we provide argument = Array ss as define
		 // for each loop:
		 for (String jk : ss) {
			 
			 System.out.println("Members of our group as :"+ jk);
		 }
	}
	
	
}
