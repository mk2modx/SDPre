import java.util.Scanner;

public class RudeQuestions {
	public static void main(String[] args ) {
		String name, hobby;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello, What's your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println(weight + "! Better keep that quiet!!" );
		System.out.print(" Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + ".");

    //added
    System.out.print(" One last thing, " + name + ". What's your favorite hobby? " );
    hobby = keyboard.next();

    System.out.print( "That sounds like fun. " );
    System.out.println( "I'd like to try " + hobby + ".");
    //1. The program will not blow up if int is entered for Double
    //   because int's are part of the double capacity
    //2. Yes InputMismatchException

	}
}
