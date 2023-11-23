// Take a number from user and if the number is Even print bazinga. 

import java.util.Scanner;

public class Elseif1 {

	public static void main(String[] args) {
		
		System.out.println(" Enter A number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println(" Bazinga");
			}
		else {
			System.out.println(" num is not even");
		}

	}

}
