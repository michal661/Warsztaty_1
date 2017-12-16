package number;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {

        int[] generated = generateNumbers();
        System.out.println("Wygenerowane liczby: ");
        System.out.println(Arrays.toString(generated));

        int[] numbers = getNumbers();
        System.out.println("Wylosowane liczby: ");
        System.out.println(Arrays.toString(numbers));

        checkScore(generated, numbers);

    }

    static void checkScore(int[] generated, int[] numbers) {
        int counter = 0;
        for (int element : generated) {
            if (contains(numbers, element)) {
                counter++;
            }
        }
        switch (counter) {
        case 3:
            System.out.println("Trafiłeś 3...");
            break;
        case 4:
            System.out.println("Trafiłeś 4...");
            break;
        case 5:
            System.out.println("Trafiłeś 5...");
            break;
        case 6:
            System.out.println("Trafiłeś 6...");
            break;
        default:
            System.out.println("Spróbuj jutro :)");
        }
    }

    static int[] generateNumbers() {
        Random random = new Random();
        int index = 0;
        int[] numbers = new int[6];
        while (index < 6) {
            int number = random.nextInt(49) + 1;
            if (!contains(numbers, number)) {
                numbers[index++] = number;
            }
        }
        return numbers;
    }

    static int[] getNumbers() {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[6];
        int index = 0;
        while (index < 6) {
            System.out.println("Podaj liczbę na pozycji " + (index + 1) + ".");

            int number = getNumber(scan);
            if (number < 1 || number > 49) {
                System.out.println("Liczba nie jest z przedziału 1-49...");

            } else if (contains(numbers, number)) {
                System.out.println("Liczba została już podana...");
            } else {
                numbers[index++] = number;
            }

        }
        return numbers;
    }

    static int getNumber(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();

            System.out.println("To nie jest liczba.");
        }
        return scan.nextInt();
    }

    static boolean contains(int[] tab, int value) {
        for (int element : tab) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

}
