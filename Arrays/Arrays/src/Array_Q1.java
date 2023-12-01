// Take an array as input from the user , search for a given number x and print the index at which it occurs. 

import java.util.Scanner;

public class Array_Q1 {

	public static void main(String[] args) {
		System.out.println(" Enter Array Size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int []arr= new int[size];
		for(int i=0; i<arr.length; i++) {
			System.out.println(" Enter Array of Elements : "+(i+1));
			arr[i]=sc.nextInt();
			}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("Enter elements for search : ");
        int x=sc.nextInt();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]==x) {
        		System.out.println(" Found at position : "+i);
        	}
        }
	}

}
