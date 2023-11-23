// Take two numbers from user and check the numbers are equal or greater or lesser.

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		System.out.println(" enter two numbers ");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a==b) {
		System.out.println(" numbers are equal");	
		}
		else if(a<b) {
			System.out.println(" a is lesser");
		}
		else {
			System.out.println("a is greater");
		}

	}	
		
}
