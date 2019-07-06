import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;


    System.out.println("Please enter a number to determine if odd or even: ");
    num = scanner.nextInt();

    if(num % 2 == 0) {
      System.out.println( "The number is even");
    }
    else {
      System.out.println("Them number is odd");
    }


    scanner.close();

  }
}
