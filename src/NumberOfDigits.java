import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        // If the number is negative, take its absolute value
        if (number < 0) {
            number *= -1;
        }
        // Count the number of digits
        int digitCount = 1;
        int temp = number;
        while (temp >= 10) {
            temp /= 10;
            digitCount++;
        }
        System.out.println("The number has " + digitCount + " digit(s).");
        scanner.close();
    }
}
