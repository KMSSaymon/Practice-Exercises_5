import java.util.Scanner;

public class OrderChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user whether increasing/decreasing should be "strict" or "lenient"
        System.out.print("Enter mode (strict/lenient): ");
        String mode = scanner.nextLine();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if (mode.equals("strict"))
        {
            if (num1 < num2 && num2 < num3)
            {
                System.out.println("Increasing");
            } else if (num1 > num2 && num2 > num3)
            {
                System.out.println("Decreasing");
            } else
            {
                System.out.println("Neither");
            }
        }
        else if (mode.equals("lenient"))
        {
            if(num1 == num2 && num2 == num3)
                {
                    System.out.println("Both increasing and decreasing");
                }
            else if ((num1 <= num2 && num2 <= num3))
            {
                System.out.println("Increasing");
            }
            else if ((num1 >= num2 && num2 >= num3))
            {
                System.out.println("Decreasing");
            }
            else {
                System.out.println("Neither");
            }
        }
            else
            {
            System.out.println("Invalid mode. Please enter 'strict' or 'lenient'.");
        }

        scanner.close();
    }
}
