package code3;
import java.util.Scanner;
public class Code3_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double BMI = weightInKilograms/(heightInMeters*heightInMeters);
		System.out.println("BMI is "+BMI);
		if(BMI<18.5)
			System.out.println("Underweight!");
		else if(BMI<25)
			System.out.println("Normal!");
		else if(BMI<30)
			System.out.println("Overweight!");
		else
			System.out.println("Obese!");
	}
}