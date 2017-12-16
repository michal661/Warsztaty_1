package number;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random r = new Random();
		int r1 = r.nextInt(101);

		System.out.println("Zgadnij liczbę ");
		Scanner scan = new Scanner(System.in);
		int a = getNumber(scan);

		System.out.println(r1);

		while (r1 != a) {

			if (r1 > a) {

				System.out.println("Za mało!");
				a = getNumber(scan);

			} else {

				System.out.println("Za dużo!");
				a = getNumber(scan);

			}
			
		}
		scan.close();
		System.out.println("Brawo udało Ci się :)");
	}

	private static int getNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("To nie jest liczba");
		}

		return scan.nextInt();

	}

}
// Napisz prostą grę w zgadywanie liczb. Komputer musi wylosować liczbę w
// zakresie od 1 do 100. Następnie:
//
// Zadać pytanie: "Zgadnij liczbę" i pobrać liczbę z klawiatury.
// Sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu
// wyświetlić komunikat "To nie jest liczba", po czym wrócić do pkt. 1
// Jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana,
// wyświetlić komunikat "Za mało!", po czym wrócić do pkt. 1.
// Jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić
// komunikat "Za dużo!", po czym wrócić do pkt. 1.
// Jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić
// komunikat "Zgadłeś!", po czym zakończyć działanie programu.
