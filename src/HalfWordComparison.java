import java.util.Scanner;
public class HalfWordComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = scanner.nextLine();
        String lowerWord  = word.toLowerCase();
        System.out.println(lowerWord);
        int len = lowerWord.length();
        int halfLenght = len/2;
        String firstHalf = lowerWord.substring(0,halfLenght);
        String secondHalf = lowerWord.substring(len % 2 == 0 ? halfLenght : halfLenght+1);
        if(firstHalf.equals(secondHalf)){
            System.out.println("First and Seconf half same.");
        }else{
            System.out.println("First and Seconf half different.");
        }
        scanner.close();
    }
}
