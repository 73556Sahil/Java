// Write a program to enter the numbers till the user wants. 
//and at the end should display the count of positive ,negative and zeros entered.

import java.util.Scanner;

public class Quesation_7 {

	public static void main(String[] args) {
		
	        Scanner input = new Scanner(System.in);
	        int Positive = 0, Negative = 0, Zero = 0;
	        int num;
	        System.out.print("Enter a number (enter 0 to stop): ");
	        num = input.nextInt();
	        while (num != 0) 
	        {
	            if (num > 0) {
	                Positive++;
	            } else if (num < 0) {
	                Negative++;
	            } else {
	                Zero++;
	            }
	            System.out.print("Enter a number (enter 0 to stop): ");
	            num = input.nextInt();
	        }
	        System.out.println("Number of positive numbers: " + Positive);
	        System.out.println("Number of negative numbers: " + Negative);
	        System.out.println("Number of zeros: " + Zero);
	    }
	}


