package misollar_21_30;

import java.util.Scanner;

public class Task24 {

    /**
     * Buttun qiymat qaytaruvchi digitN(k, n) funksiya hosil qiling, bu funksiya k sonni n-o'rindagi raqamini qaytarsin.
     * Agar bunday o'rindagi raqam bo'lmasa -1 qaytarilsin.
     */
    public static void main(String[] args) {

        System.out.println("24-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("k=");
        int k = scanner.nextInt();

        System.out.print("n=");
        int n = scanner.nextInt();

        System.out.print(k + " soni " + n + "-o'rnidagi raqam:" + digitN(k, n));

    }

    // k sonning n-o'rindagi raqami qaytaradigan funksiya
    static int digitN(int k, int n) {
        // k ni boshlang'ich qiymatini saqlab qolish kerak
        // va uning raqamlar sonini topish kerak

        int initialValue = k;
        int digitCount = 0;
        while (k > 0) {
            k = k / 10;
            digitCount++;
        }

        // agar k son raqamlar soni n dan kam bo'lsa unda -1 qaytarish kerak, aks holda uni topish kerak
        if (digitCount < n) return -1;

        k = initialValue;
        int counterFromBack = 0;
        int nDigit = -1;
        while (k > 0) {
            if (digitCount == n + counterFromBack) {
                nDigit = k % 10;
                break;
            }

            k = k / 10;
            counterFromBack++;
        }
        return nDigit;
    }
}