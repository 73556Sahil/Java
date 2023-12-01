//take input from user and print the array

import java.util.Scanner;

public class Define_Array3 {

	public static void main(String[] args) {
		System.out.println("Enter Array Size");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		
		int[]arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter Array elements : "+ (i+1));
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		}

}
