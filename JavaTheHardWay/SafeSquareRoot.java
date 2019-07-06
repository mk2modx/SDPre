import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String typedYes;
    double x, y;


    // New code asking Are you ready?!?
    System.out.print("Are you ready?!?");
    System.out.print("Type YES!.");
    typedYes = keyboard.next();


    while ( ! typedYes.equals("YES!") ) {
      System.out.println("\nYou're not ready ");
      System.out.print("If you're now ready, type YES!: ");
      typedYes = keyboard.next();
    }
    // rest of the code

    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please.) ");
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
  }
}
