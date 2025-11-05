package Exp_8;
import java.util.Scanner;

class EvenThread extends Thread {
    int[] numbers;

    EvenThread(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        System.out.println("\n--- EVEN THREAD OUTPUT ---");

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
                try {
                    Thread.sleep(2000); // 2 seconds delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println("--- End of Even Thread ---");
    }
}

class OddThread extends Thread {
    int[] numbers;

    OddThread(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        System.out.println("\n--- ODD THREAD OUTPUT ---");

        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
                try {
                    Thread.sleep(2000); // 2 seconds delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println("--- End of Odd Thread ---");
    }
}

public class Question_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Create Thread objects
        Thread even = new EvenThread(arr);
        Thread odd = new OddThread(arr);

        // Start threads (parallel execution)
        even.start();
        odd.start();

        sc.close();
    }
}
