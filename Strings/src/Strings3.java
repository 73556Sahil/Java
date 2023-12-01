// Input an email from the user.
// you have to create a user name from the email by deleting the part that comes after '@'
// Display that user name to the user 

import java.util.Scanner;

public class Strings3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter email");
		String email = sc.nextLine();
	    String Username=" ";
		
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				break;
			}else {
				Username +=email.charAt(i);
				
			}
		}
		System.out.println(Username);
	}

}
