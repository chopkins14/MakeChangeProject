import java.util.Scanner;

public class CustomerChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double cost = 0.00;
		double cash = 0.00;
		double dollars = 0.00;

		System.out.println("Price: ");
		cost = scanner.nextDouble();

		System.out.println("Cash: ");
		cash = scanner.nextDouble();

		if (cash < cost) {
			System.out.println("Not enough cash. Goodbye.");
		}

		else if (cash > cost) {
			dollars = cash - cost;
			System.out.println("\nChange: \n");
			if ((int) dollars / 20 > 0) {
				System.out.println("Twenties: " + (int) dollars / 20);
				dollars %= 20;
			}

			if ((int) dollars / 10 > 0) {
				System.out.println("Tens: " + (int) dollars / 10);
				dollars %= 10;
			}
			if ((int) dollars / 5 > 0) {
				System.out.println("Fives: " + (int) dollars / 5);
				dollars %= 5;
			}
			if ((int) dollars / 1 > 0) {
				System.out.println("Ones: " + (int) dollars / 1);
				dollars %= 1;
				dollars *= 100;
			}
			if ((int) dollars / 25 > 0) {
				System.out.println("Quarters: " + (int) dollars / 25);
				dollars %= 25;
			}
			if ((int) dollars / 10 > 0) {
				System.out.println("Dimes: " + (int) dollars / 10);
				dollars %= 10;
			}
			if ((int) dollars / 5 > 0) {
				System.out.println("Nickels: " + (int) dollars / 5);
			}
			if ((int) dollars / 1 > 0) {
				System.out.println("Pennies: " + (int) dollars / 1);
			}

		} else if (cash == cost) {
			System.out.println("Thank you. Goodbye.");
		}
		scanner.close();
	}

}
