public class FloatingPointTest {
	public static void main( String args[] ) {
		float myF = 1.36f;
		double myD = 1.36;

		System.out.println( myF == myD );

		float myF1 = 0.1f;
		myF1 += 0.6f;
		System.out.println( myF1 );

		float myF2 = 1/49f;
		double myD1 = 1/49d;

		System.out.println( myF2 * 49 );

		System.out.println( myD1 * 49 );
	}
}
