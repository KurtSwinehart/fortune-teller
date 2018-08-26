import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		System.out.println("What month where you born in, using numerals 1-12?");
		int birthMonth = input.nextInt();
		
		input.nextLine();
		
		System.out.println("What is your favorite ROYGBIV color? (Please enter HELP to get a list of ROYGBIV colors.");
		String favoriteColor = input.nextLine();
		if(favoriteColor.toLowerCase().equals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.");
			System.out.println("What is your favorite ROYGBIV color?");
			favoriteColor = input.nextLine();
			}
		
		System.out.println("How many siblings do you have?");
		int numberSiblings = input.nextInt();
		
	}

}
