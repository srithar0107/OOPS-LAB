package Exp_8;
import java.util.Scanner;

class TableThread implements Runnable {
    int num;

    TableThread(int num) 
    {
        this.num = num;
    }

    public void run() 
    {
        System.out.println("\n--- MULTIPLICATION TABLE THREAD OUTPUT ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("--- End of Table Thread ---");
    }
}

class DivisorThread implements Runnable {
    int num;

    DivisorThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("\n--- DIVISOR THREAD OUTPUT ---");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);

                try {
                    Thread.sleep(2000); // 2 seconds delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("--- End of Divisor Thread ---");
    }
}

public class Question_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        // Create Runnable objects
        Runnable table = new TableThread(n);
        Runnable divisor = new DivisorThread(n);

        // Create Thread objects
        Thread t1 = new Thread(table);
        Thread t2 = new Thread(divisor);

        // Start threads (parallel execution)
        t1.start();
        t2.start();

        sc.close();
    }
}
