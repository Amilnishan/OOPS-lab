import java.util.Scanner;

class Multiplication extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Multiplication of 5 and " + i + " is: " + (5 * i));
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Multiplication thread interrupted");
        }
    }
}

class Prime extends Thread {
    private int limit;

    public Prime(int limit) {
        this.limit = limit;
    }

    public void run() {
        try {
            int n = 2, i = 1;
            while (i <= limit) {
                boolean isPrime = true;
                for (int j = 2; j <= n / 2; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Prime number " + i + " is: " + n);
                    i++;
                }
                n++;
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Prime thread interrupted");
        }
    }
}

public class Multiprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Multiplication m = new Multiplication();
        

        m.start();  // Start multiplication thread
        try {
            m.join();  // Wait for multiplication to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for multiplication");
        }

        System.out.print("Enter the limit for prime numbers: " + "\n");
        int limit = sc.nextInt();
        Prime p = new Prime(limit);
        sc.close();

        p.start();  // Start prime number thread after multiplication is done
    }
}


