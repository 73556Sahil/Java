// Take an array of Strings input from user & find the cumulative (combined)length of all those strings

import java.util.Scanner;

public class Strings1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int n=sc.nextInt();
		String[]arr=new String[n];
		int totallength=0;
		
		for (int i=0; i<n; i++) {
			arr[i]=sc.next();
			totallength +=arr[i].length();
			}
		for (int i=0; i<n; i++) {
				System.out.print(arr[i]+" ");
		
		}
		System.out.println(totallength);

	}

}
