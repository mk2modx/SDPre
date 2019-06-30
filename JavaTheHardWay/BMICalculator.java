import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, lbs, feet, inches, inchT;

		// 1ft = 0.3048m
		// 1lb = 0.453592
		// 1in = 0.0254

		System.out.print( "Your height in feet (only): " );
		feet = keyboard.nextDouble();

		System.out.print( "Your height in inches: " );
		inches = keyboard.nextDouble();

		System.out.print( "Your weight in pounds: " );
		lbs = keyboard.nextDouble();

		kg = lbs * 0.453592;
		inchT = (feet * 12) + inches;
		m = inchT * 0.0254;
		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}
