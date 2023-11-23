// print Area of circle

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		System.out.println("enter radius");
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		double Area= 3.14*radius*radius;
	    System.out.println("Area of the Circle is :"+ Area);
		
		
	}

}
