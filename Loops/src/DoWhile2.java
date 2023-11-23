// Make a menu driven program The user can enter two numbers either 1or 0
//if the user enters 1 then keep taking input from user for a students marks(out of 100)
//if the enter 0 then stop
//if she scores marks>90 print This is good
//                   89>=marks this id also good
//                   59>=marks This is good as well

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		 int input;
		do {
			System.out.println(" Enter marks");
			int marks=sc.nextInt();
			if(marks>=90 && marks<=100) {
				System.out.println("This is very good");
			}
			else if(marks>=59 && marks<=89) {
				System.out.println("This is good");
			}
			else if(marks>=40 && marks<=59) {
				System.out.println("This is good as well");
			}
			else if(marks>=0 && marks<=40) {
				System.out.println("This is not good");
			}
			else {
				System.out.println(" invalid");
				}
			System.out.println(" do you wany to continue? if yes then press 1 if no then press 0");
			 input=sc.nextInt();
			}while(input==1);

	}

}
