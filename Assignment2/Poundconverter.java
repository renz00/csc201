import java.util.Scanner;

public class Poundconverter{
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		double kilograms = 0.454;

		System.out.println("Input a number of pounds to be converted into kilograms");
		double pounds = keyboard.nextDouble();
		System.out.println("You typed: " + pounds);
		double conversion = pounds * kilograms;
		System.out.println("Since 1 pound = 0.454 kilograms, " + pounds + " pounds = " + conversion + " kilograms. Thank you.");

	}
}
