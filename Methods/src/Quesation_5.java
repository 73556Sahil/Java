// Write a function that takes in age as input and returns if that person is eligible to vote or not. 
// A person of age >18 is eligible to vote 

import java.util.Scanner;

public class Quesation_5 {

	public static void main(String[] args) {
	System.out.println(" Enter age");
	Scanner sc= new Scanner(System.in);
	int age=sc.nextInt();
    eligibility(age);
	 }

	private static void eligibility(int age) {
	if(age>18) 
		System.out.println(" A Person is Eligible for vote");
	else 
		System.out.println(" A Person is Eligible for vote ");
	
	}

}
