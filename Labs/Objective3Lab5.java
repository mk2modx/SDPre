import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    Double one, two, three;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number :");
    one = input.nextDouble();
    System.out.println("Please enter another number :");
    two = input.nextDouble();

    three = (one + two);
    System.out.println("The sum of " + one + " + " + two + " = " + three);
    input.close();
  }
}
