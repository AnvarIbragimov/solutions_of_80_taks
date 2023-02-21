package misollar_21_30;

import java.util.Scanner;

public class Task22 {

    /**
     * isPrime(n) mantiqiy funksiya yozing, bu funksiya sonni tubligini aniqlab bersin.
     * N soni va N ta sonlar to'plamidan nechtasi toq son ekanligni aniqlang.
     */
    public static void main(String[] args) {

        System.out.println("22-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a, counter = 0;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();

            if (isPrime(a)) counter++;
        }

        System.out.print("Tub sonlar soni:" + counter);

    }

    // tub sonni aniqlab beradigan funksiya
    static boolean isPrime(int n) {
        // 1 tub son emas
        if (n == 1) return false;

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            isPrime = n % i != 0;
            if (!isPrime) break;
        }
        return isPrime;
    }
}