// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class Array_Q2 {

	public static void main(String[] args) {
		System.out.println(" Enter Array Size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		String[]names=new String[size];
		for (int i=0; i<names.length; i++) {
			System.out.println(" Enter names to stored in the array : ");
			names[i]=sc.next();
			}
		for(int i=0; i<names.length; i++) {
			System.out.println("Names : " +names[i] );
		}
	}

}
