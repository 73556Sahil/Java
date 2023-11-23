// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Quesation_3 {

	public static void main(String[] args) {
	System.out.println(" Enter a two Numbers ");
	Scanner sc=new Scanner( System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	comparegreat(a,b);
	System.out.println(comparegreat(a,b ));
	}

	private static int comparegreat(int a, int b) {
		if(a>b)
			return a ;
		else 
			return b;
		
		}

}
