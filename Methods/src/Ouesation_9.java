// Write a function that calculates the Greatest common divisor of two numbers

import java.util.Scanner;

public class Ouesation_9 {

	public static void main(String[] args) {
	System.out.println(" Enter Two Numbers");
	Scanner sc=new Scanner( System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	while(a!=b) {
		if (a>b) {
			a=a-b;
		}else {
			b=b-a;
		}
	}
	System.out.println("GCD is : "+b );
	}

}
