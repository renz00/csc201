import java.util.Scanner;

public class Authentication{

	public static void main(String [] args){
		String username = "1234";
		String password = "seven";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type in your username: ");
		
		String userInput = keyboard.next();

		if (userInput.equals(username)){
			System.out.println("Good, now type in your password: ");
			String passInput = keyboard.next();

			if (passInput.equals(password)){
				System.out.println("Welcome " + username);
			}
			else {
				System.out.println("Error password");
			}
		}
		else{
			System.out.println("Error username");
		}

	}
}
