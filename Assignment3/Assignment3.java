// Are the following statements correct? Which one is better?
import java.util.Scanner;
public class Assignment3{
	public static void main(String [] args){
	
		System.out.println("Type in your age: ");
		Scanner keyboard = new Scanner(System.in);
		int age = keyboard.nextInt();
		//The first option is the code below
		if (age < 16){
			System.out.println("Cannot get a driver's license");}
		if (age >= 16){
			System.out.println("Can get a driver's license");}
		// end of the first option
		//
		// beginning of the second option 
		if (age <16){
			System.out.println("Cannot get a driver's license");}
		else {
			System.out.println("Can get a driver's license");}
		//end of the second option	
		//
		//Both of the statements are correct. The better option is the second option because it requires less code yet still achieves the same objective.
	}
}

