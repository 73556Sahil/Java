// take 2 input from user and print addition ,sub,mul,divide.

import java.util.Scanner;

public class HWP {

	public static void main(String[] args) {
		System.out.println(" enter Two numbers");
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	    int operator=sc.nextInt();
	    
	    switch(operator){
	    
	    case 1:
	    	System.out.println(a+b);
	    	break;
	    case 2:
	    	System.out.println(a-b);
	    	break;
	    case 3:
	    	System.out.println(a*b);
	    	break;
	    case 4:
	    	System.out.println(a/b);
	    	break;
	    default :
	    	System.out.println("Invalid");
	    	break;
	    	}

	}

}
