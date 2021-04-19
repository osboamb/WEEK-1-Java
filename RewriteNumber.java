// package import missing
import java.util.Scanner;


public class RewriteNumber {
	public static void main( String args[] ) {
	    Scanner input = new Scanner( System.in );

	    System.out.println( "Enter an integer between 0 and 9" );
	    int num = input.nextInt();
	    
		if (num == 1) {
			System.out.println("One");
		} else if (num == 2){
			System.out.println("Two");
		} else {
			System.out.println("It is bigger");
		}

	    //System.out.println( "You entered " + num);

		switch (num){
			case 1:
			System.out.println("One, switched");
		}
	
	}


}
