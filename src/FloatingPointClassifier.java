import java.util.Scanner;
public class FloatingPointClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a floating-point number : ");
        double number = scanner.nextDouble();
        if(number==0){
            System.out.println("Zero");
        }
        else if(number>0){
            System.out.println("Positive");
            if(Math.abs(number) < 1)
            {
                System.out.println("small");
            } else if (number>1000000)
            {
                System.out.println("large");
            }
        }
        else {
            System.out.println("Negative");
            if(Math.abs(number) < 1)
            {
                System.out.println("small");
            } else if (Math.abs(number)>1000000)
            {
                System.out.println("large");
            }
        }
        scanner.close();
    }

}

