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
		if (favoriteColor.toLowerCase().equals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.");
			System.out.println("What is your favorite ROYGBIV color?");
			favoriteColor = input.nextLine();
		}

		System.out.println("How many siblings do you have?");
		int numberSiblings = input.nextInt();

		String resultRetire;
		if (age % 2 == 0) {
			resultRetire = "20 years";
		} else {
			resultRetire = "25 years";
		}

		String resultVacationHome = "";
		if (numberSiblings == 0) {
			resultVacationHome = "Naples, FL";
		} else if (numberSiblings == 1) {
			resultVacationHome = "Hawaii";
		} else if (numberSiblings == 2) {
			resultVacationHome = "Rio de Janero, Brazil";
		} else if (numberSiblings == 3) {
			resultVacationHome = "Portland, Oregon";
		} else if (numberSiblings >= 4) {
			resultVacationHome = "Baton Rouge, LA";
		} else if (numberSiblings < 0) {
			resultVacationHome = "Moscow, Russia";
		}

		String resultTransportation = "";
		if (favoriteColor.toLowerCase().equals("red")) {
			resultTransportation = "Maserati";
		} else if (favoriteColor.toLowerCase().equals("orange")) {
			resultTransportation = "stallion";
		} else if (favoriteColor.toLowerCase().equals("yellow")) {
			resultTransportation = "chariot";
		} else if (favoriteColor.toLowerCase().equals("green")) {
			resultTransportation = "taxi";
		} else if (favoriteColor.toLowerCase().equals ("blue")) {
			resultTransportation = "rickshaw";
		} else if (favoriteColor.toLowerCase().equals("indigo")) {
			resultTransportation = "motor scooter";
		} else if (favoriteColor.toLowerCase().equals("violet")) {
			resultTransportation = "flying saucer";
		}

		String resultBankBalance = "";
		if (birthMonth <= 4 && birthMonth > 0) {
			resultBankBalance = "$256,000.76";
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			resultBankBalance = "$3,687,105.42";
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			resultBankBalance = "$86.23";
		} else if (birthMonth == 0 || birthMonth >= 13) {
			resultBankBalance = "0.00";
		}
		
		System.out.println(firstName + " " + lastName + " will retire in " + resultRetire + " with " +
		resultBankBalance + " in the bank, a vacation home in " + resultVacationHome + ", and travel by " + 
				resultTransportation + ".");
	}

}
