import java.util.Scanner;
public class FirstLastLetterComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string : ");
        String st = scanner.nextLine();
        //Extract the first and last letter of the string
        char firstChar = st.charAt(0);
        char lastChar = st.charAt(st.length()-1);
        firstChar = Character.toLowerCase(firstChar);
        lastChar = Character.toLowerCase(lastChar);
        //Compare the first and last characters
        if(firstChar == lastChar)
        {
            System.out.println("First and last letter same.");
        }else{
            System.out.println("First and last letter different.");
        }
        scanner.close();
    }
}
