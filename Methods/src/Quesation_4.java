// Write a function that takes in the radius as input and returns the circumference of a circle

import java.util.Scanner;

public class Quesation_4 {

	public static void main(String[] args) {
		System.out.println("Enter A radius");
		Scanner sc=new Scanner (System.in);
		float r=sc.nextFloat();
		areaOftheCircle(r);

	}

	private static void areaOftheCircle(float r) {
		double area=3.14*r*r;
		System.out.println(" Area of circle is : "+ area);
	}

}
