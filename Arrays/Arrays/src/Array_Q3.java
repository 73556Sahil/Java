//Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class Array_Q3 {

	public static void main(String[] args) {
	 System.out.println(" Enter Array size");
	 Scanner sc=new Scanner(System.in);
	 int size =sc.nextInt();
	 
	 int arr[]=new int[size];
	 for(int i=0; i<size; i++) {
		 System.out.println("Enter Array of elements");
		 arr[i]=sc.nextInt();
		 }
	 boolean isAscending=true;
	 for(int i=0; i<arr.length-1; i++) {
		 if (arr[i]>arr[i+1]) {
			 isAscending=false;
		 }
	 }
	 if(isAscending) {
		 System.out.println("Ascending order");
	 }else {
		 System.out.println(" Not Sorted");
	 }
 }
}
