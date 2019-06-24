public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;

    side1 = 10;
    side2 = 8;

    double num1 = (side1 * side1); //num => 3
    double num2 = (side2 * side2);
    double result = Math.sqrt(num1+ num2); //result => 2 + 3 => 5

    System.out.println( "The hypotnuse of 2 sides; 10 and 8 = " + result);

  }
}
