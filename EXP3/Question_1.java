import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and read input
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        int letterCount = 0;
        int digitCount = 0;

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Output the results
        System.out.println("Letters: " + letterCount);
        System.out.println("Digits: " + digitCount);
    }
}
