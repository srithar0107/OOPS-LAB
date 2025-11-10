package Exercise_9_File_Handling_using_Java_Programming;

import java.io.FileReader;
import java.io.IOException;

public class Question_3 {

    public static void main(String[] args) {

        int a = 0, e = 0, i = 0, o = 0, u = 0;
        int ch;

        try {
            FileReader fr = new FileReader("/home/abin/Documents/Java-OOPs-Lab/Exercise_9_File_Handling_using_Java_Programming/notes");

            while ((ch = fr.read()) != -1) {
                char c = Character.toLowerCase((char) ch);

                switch (c) {
                    case 'a': a++; break;
                    case 'e': e++; break;
                    case 'i': i++; break;
                    case 'o': o++; break;
                    case 'u': u++; break;
                }
            }

            fr.close();

            System.out.println("Vowel Count Results (Character Stream)");
            System.out.println("a : " + a);
            System.out.println("e : " + e);
            System.out.println("i : " + i);
            System.out.println("o : " + o);
            System.out.println("u : " + u);

            int max = a;
            String vowel = "a";

            if (e > max) { max = e; vowel = "e"; }
            if (i > max) { max = i; vowel = "i"; }
            if (o > max) { max = o; vowel = "o"; }
            if (u > max) { max = u; vowel = "u"; }

            System.out.println("\nMost frequent vowel is: " + vowel + " (" + max + " times)");

        } catch (IOException ex) {
            System.out.println("Error reading the file: " + ex.getMessage());
        }
    }
}
