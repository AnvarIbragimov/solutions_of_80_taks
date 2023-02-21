package misollar_21_30;

import java.util.Scanner;

public class Task23 {

    /**
     * Buttun qiymat qaytaruvchi digitCount(k) funksiya hosil qiling, bu funksiya sonni raqamlar soni qaytarsin.
     */
    public static void main(String[] args) {

        System.out.println("23-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        System.out.print(n + " soni raqamlar soni :" + digitCount(n));

    }

    // sonning raqamlar soni qaytaradigan funksiya
    static int digitCount(int n) {
        int counter = 0;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        return counter;
    }
}