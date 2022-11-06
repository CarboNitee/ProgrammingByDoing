import java.util.Scanner;
public class BMICalculator
{
	public static void main( String[] args )
	{
        //I will make another seperate file for inches and pounds. 
		Scanner keyboard = new Scanner(System.in);

		double weight, height;

		System.out.print( "What is your height in meters? " );
		height = keyboard.nextDouble();

		System.out.print( "What is your weight in kg? " );
		weight = keyboard.nextDouble();

		System.out.println( "Your BMI is " + ( weight / (height * height) ));
		keyboard.close();
	}
}