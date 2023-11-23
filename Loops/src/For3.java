// print the sum of first n natural numbers.

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		System.out.println(" Enter A number");
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int sum=0;
		for( int i=1; i<=a; i++ ) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
