import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum, zeroNum;
    zeroNum = 0;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    if ( userNum > zeroNum ) {
      System.out.println( "The number is positive");
    }
    if ( userNum == zeroNum ) {
      System.out.println( "The number is Zero");
    }
    if ( userNum < zeroNum ) {
      System.out.println( "The number is negative");
    }


    scanner.close();

  }
}
