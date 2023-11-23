//learn how to get input from user

import java.util.Scanner;

public class Input {

	public static void main(String[] args){
		System.out.println(" enter string");
		Scanner sc=new Scanner(System.in);
		String name= sc.nextLine();// to accept one word we use sc.next();otherwise use sc.nextline();		
		System.out.println(name);
		
	}

}
