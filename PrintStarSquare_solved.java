import java.util.Scanner;

public class PrintStarSquare_solved {
  public static void main( String args[] ){
    Scanner height = new Scanner(System.in); //scanner object for the height
    Scanner width = new Scanner(System.in); //scanner object for the width
    
    System.out.print("Enter height: ");
    int h = height.nextInt();

    System.out.print("Enter width: ");
    int w = width.nextInt();

      for(int j = 1; j <= h; j++){
        for( int i = 1; i <= w; i++ ){
            System.out.print( "*" );
        }
        System.out.println();
      }

  }
}
