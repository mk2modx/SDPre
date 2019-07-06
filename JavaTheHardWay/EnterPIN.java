import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String typedPassword;
    int pin, entry;

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA. ");

    //passWord
    System.out.print("ENTER YOUR PASSWORD: ");
    typedPassword = keyboard.next();

    while ( ! typedPassword.equals("word") ) {
        System.out.println("\nINCORRECT PASSWORD. TRY AGAIN. ");
        System.out.print("ENTER YOUR PASSWORD: ");
        typedPassword = keyboard.next();
    }




    // pin

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
        System.out.println("\nINCORRECT PIN. TRY AGAIN. ");
        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();
    }

    System.out.println("\nPIN  AND PASSWORD ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
