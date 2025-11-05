package Exp_8;
import java.util.Scanner;

class WordThread implements Runnable {
    String text;
    WordThread(String text) {
        this.text = text;
    }

    public void run() {
        System.out.println("\n--- WORD THREAD OUTPUT ---");
        String[] words = text.split(" ");  // splitting paragraph into words

        for (String word : words) {
            System.out.println(word);
            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("--- End of Word Thread ---");
    }
}

class VowelThread implements Runnable {
    String text;

    VowelThread(String text) {
        this.text = text;
    }

    public void run() {
        System.out.println("\n--- VOWEL THREAD OUTPUT ---");

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                System.out.println(ch);  // print vowel

                try {
                    Thread.sleep(2000); // 2 seconds delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println("--- End of Vowel Thread ---");
    }
}

public class Question_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph of text:");
        String paragraph = sc.nextLine();

        // Create Runnable objects
        Runnable word = new WordThread(paragraph);
        Runnable vowel = new VowelThread(paragraph);

        // Create Thread objects
        Thread t1 = new Thread(word);
        Thread t2 = new Thread(vowel);

        // Start threads
        t1.start();
        t2.start();

        sc.close();
    }
}
