package number;

import java.util.Scanner;

public class zgaduje_liczbe {
	public static void main(String[] args) {
		System.out.println("Pomyśl liczbę od 1 do 1000");

		int min = 1;
		int max = 1001;
		int steps = 0;
		Scanner scan = new Scanner(System.in);
		boolean found = false;

		while (!found) {
			int guess = ((max - min) / 2) + min;
			System.out.println("Zgaduje " + guess);
			String answer = scan.nextLine();
			switch (answer) {
			case "Zgadłeś":
				steps++;
				System.out.println("Zgadłes w " + steps + " probach");
				found = true;
				break;
			case "za duzo":
				steps++;
				max = guess;
				break;
			case "za mało":
				min = guess;
				break;

			default:
				System.out.println("Nie oszukuj");
			}

		}
		scan.close();

	}

}
