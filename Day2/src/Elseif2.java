// take input from user and print namaste, hello, bonjour.

import java.util.Scanner;

public class Elseif2 {

	public static void main(String[] args) {
		System.out.println("Enter a choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		if(ch==1) {
			System.out.println(" Namaste");
		}
		else if(ch==2) {
			System.out.println(" Hello");
		}
		else if(ch==3) {
			System.out.println(" Bonjour");
		}
		else {
			System.out.println("Invalid");
		}
		

	}

}
