// print all even numbers till n or odd number

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println(" Enter a number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=0; i<=a; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
//			else if(i%2==1) {
//				System.out.println(i);
//			}
		}

	}

}
