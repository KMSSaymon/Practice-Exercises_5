import java.util.Scanner;
public class NumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int inputNumber = sc.nextInt();
        if (inputNumber > 0){
            System.out.println("Positive");
        } else if (inputNumber < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}
