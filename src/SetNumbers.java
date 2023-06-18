import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class SetNumbers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numbers Conference");

        System.out.print("Enter a series of numbers (separated by spaces): ");
        String input = scanner.nextLine();

        String[] numberStrings = input.split("\\s+");

        Set uniqueNumbers = new HashSet<>();

        System.out.println("\nNumber\t\tStatus");

        for (String numberString : numberStrings) {
            int number = Integer.parseInt(numberString);

            if (uniqueNumbers.contains(number)) {
                System.out.println(number + "\t\t\tDuplicate");
            } else {
                uniqueNumbers.add(number);
                System.out.println(number + "\t\t\tUnique");
            }
        }
        scanner.close();
    }
}
