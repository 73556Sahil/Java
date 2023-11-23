//Q. Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Quesation_1 {

	public static void main(String[] args) {
		System.out.println(" Enter three numbres : ");
		Scanner sc= new Scanner( System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		average(A,B,C);
	}

	private static void average(int a, int b, int c) {
		 int average=(a+b+c)/3;
		 System.out.println(average);
		
	}

}
