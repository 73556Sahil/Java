// For a given matrix of n,m print its transpose. 

import java.util.Scanner;

public class Array_2DQ1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter rows");
		int m=sc.nextInt();
		System.out.println(" Enter Colms");
		int n=sc.nextInt();
		//give input equal rows and columns if you give input different rows it will give error index out of bound.  
		
		int arr[][]=new int[m][n];
		for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
	            arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(" The Transpose is : ");
		for(int j=0; j<m;j++) {
			for(int i=0; i<n;i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
