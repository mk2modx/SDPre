public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, z;
		double seconds, e, checking, lucky;
		String firstName, lastName, title, who, what;

		x = 10;
		y = 400;
		z = 99; //added
		age = 39;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		lucky = 777;  //added

		firstName = "Mark";
		lastName = "Agbayani";
		title = "Mr.";
		who = "new"; // added
		what = "york"; //added

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y. " );
		System.out.println( "The experiment took " + seconds + "seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "Added items : " + z + " " + lucky + " " + who + " " + what);
	}
}
