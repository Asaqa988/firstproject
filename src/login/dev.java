package login;

import java.util.Random;

public class dev {

	public static void main(String[] args) {

		
		String myname = "abdulraheem"; 
		
		char myfirstletter = 'a'; 
		
		int myage = 31 ;
		
		double myscore = 75.0;
		
		boolean iloveJava = true ; 
		
		
		String [] mynames = {"anas","mohammad","omar","ali"}; 
		
		Random rand = new Random(); 
		
		int myrandomNumber = rand.nextInt(mynames.length); 
		
		
		System.out.println(mynames[myrandomNumber]);; 
		
	}

}
