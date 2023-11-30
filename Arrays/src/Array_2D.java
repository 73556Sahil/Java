//Take a matrix as input from the user. search for a given number x & print the indices at which occurs

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		System.out.println("Enter rows");
		System.out.println("Enter cloms");
		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		int colms=sc.nextInt();
		
		int arr[][]=new int[rows][colms];
		for(int i=0; i<rows;i++) {
			for(int j=0; j<colms;j++) {
	            arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<rows;i++) {
			for(int j=0; j<colms;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Enter number for search");
		int x=sc.nextInt();
		
		for(int i=0;i<rows; i++) {
			for (int j=0; j<colms; j++) {
				if (x==arr[i][j]) {
					System.out.println("x found at locations (" + i +"," + j +")");
				}
			}
		}
	}

}
