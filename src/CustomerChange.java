import java.util.Scanner;

public class CustomerChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int pricePennies = 0;
		int cashPennies = 0;

		System.out.println("Price: ");
		pricePennies = (int) (scanner.nextDouble() * 100);

		System.out.println("Cash: ");
		cashPennies = (int) (scanner.nextDouble() * 100);

		if (cashPennies < pricePennies) {
			System.out.println("Not enough cash. Goodbye.");
		} else if (cashPennies > pricePennies) {
			int change = cashPennies - pricePennies;
			System.out.println("\nChange: \n");
			if (change % 2000 >= 0) {
				System.out.println("Twenties: " + change / 2000);
				change %= 2000;
			}
			if (change % 1000 >= 0) {
				System.out.println("Tens: " + change / 1000);
				change %= 1000;
			}
			if (change % 500 >= 0) {
				System.out.println("Fives: " + change / 500);
				change %= 500;
			}
			if (change % 100 >= 0) {
				System.out.println("Ones: " + change / 100);
				change %= 100;
			}
			if (change % 25 >= 0) {
				System.out.println("Quarters: " + change / 25);
				change %= 25;
			}
			if (change % 10 >= 0) {
				System.out.println("Dimes: " + change / 10);
				change %= 10;
			}
			if (change % 5 >= 0) {
				System.out.println("Nickels: " + change / 5);
				change %= 5;
			}
			if (change % 1 >= 0) {
				System.out.println("Pennies: " + change / 1);
				change %= 1;
			}
		} else if (cashPennies == pricePennies) {
			System.out.println("Thank you. Goodbye.");
		}
		scanner.close();
	}
}
