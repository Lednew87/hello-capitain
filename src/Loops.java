import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Loop for.
        System.out.println("Numbers between 1 and 10:");
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        // Loop while.
        System.out.println("Even numbers between 1 and 20:");
            int num = 1;
                while (num <= 20) {
                    if (num % 2 == 0) {
                        System.out.println(num);
                    }
                    num++;
                }

        // Loop do/while.
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You entered: " + number);
        scanner.close();
        }

    }
