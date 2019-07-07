
import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;


    while(true){
printMenu();
      selection = scanner.nextInt();

           if (selection == 1) {
             System.out.println("Hello World");
             printMenu();
          }
          else if (selection == 2) {
             System.out.println("Apple, Banana, Coconut.");
             printMenu();
            }
          else if (selection == 3) {
             System.out.println("Good Bye");
             break;
      }




    }

  }


  public static void printMenu() {
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();


}
}
