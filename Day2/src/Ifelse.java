//basics of if else

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		System.out.println(" Enter age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age<18) {
			System.out.println("Not Adult");
		}
		else {
			System.out.println("Adult");
		}
	}

}
