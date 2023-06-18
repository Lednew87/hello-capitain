import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main (String[] args) {

        double[] myArray = new double[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 0 of the array: ");
        myArray[0] = scanner.nextDouble();
        System.out.println("Enter number 1 of the array: ");
        myArray[1] = scanner.nextDouble();
        System.out.println("Enter number 2 of the array: ");
        myArray[2] = scanner.nextDouble();
        System.out.println("Enter number 3 of the array: ");
        myArray[3] = scanner.nextDouble();
        System.out.println("Enter number 4 of the array: ");
        myArray[4] = scanner.nextDouble();

        System.out.print("Select the result: ");
        System.out.print("A = Sum every numbers of the array.");
        System.out.print("B = Media between the numbers of the array.");
        System.out.print("C = Maximum number of the array.");
        System.out.print("D = Minimum number of the array.");
        System.out.print("E = Finish the system.");

        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case 'A':
                result = Arrays.stream(myArray).sum();
                break;
            case 'B':
                result = Arrays.stream(myArray).sum() / 5;
                break;
            case 'C':
                result = Arrays.stream(myArray).max().getAsDouble();
                break;
            case 'D':
                result = Arrays.stream(myArray).min().getAsDouble();
                break;
            case 'E':
                System.out.println("Exit.");
                scanner.close();
                break;
        }
        System.out.println("The result is: " + result);
    }

}
