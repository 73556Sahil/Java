//print/

//*****
//*****
//*****
//*****

public class SolidRectangle {

	public static void main(String[] args) {
		
     int a=4;
     int b=5;
     //outer loop for rows
     for(int i=1; i<=a; i++) {
     //inner loop to print *
    	 for(int j=1; j<=b; j++ ) {
    		 System.out.print("*");
    	 }
    	System.out.println(); 
     }

	}

}
