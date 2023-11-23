//Write Function to print the sum of all odd numbers from 1to n.

import java.util.Scanner;

public class Quesation_2 {

	public static void main(String[] args)
	{
		System.out.println(" Enter A number ");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		
		printSum(num);
	 }		

	private static void printSum(int num) 
	{
		int sum=0;
		for( int i=1; i<=num; i++) 
		{
			
			
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);  
		
	}

}
