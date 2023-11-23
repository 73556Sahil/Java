// using switch case take a choice from user and print message

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println(" Enter a choice ");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch){
		
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Bonjour");
			break;
		default :
			System.out.println("Invalid");
			break;
		
		
		
		}
		
		

	}

}
