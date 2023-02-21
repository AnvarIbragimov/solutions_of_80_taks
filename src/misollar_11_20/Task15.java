package misollar_11_20;

import java.util.Scanner;

public class Task15 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan.
     * Ular ichidan birinchi uchragan extremal element va uning indexini chiqaring.
     * Extramal elementlar deb birinchi uchragan eng kichik yoki eng katta elementga aytiladi.
     */
    public static void main(String[] args) {
        // Bu masala Zafarbek ishlagan masala bilan birlashtirildi

        System.out.println("15-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a;

        int indexMin = 0, indexMax = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();

            if (max < a) {
                max = a;
                indexMax = i;
            }
            if (min > a) {
                min = a;
                indexMin = i;
            }
        }
        if (indexMin < indexMax) {
            System.out.print("Birinchi ucragan extrmal element kichik:" + min);
            System.out.println();
            System.out.print("Birinchi ucragan extrmal element kichik index" + (indexMin + 1));
        } else {
            System.out.print("Birinchi ucragan extrmal element katta:" + max);
            System.out.println();
            System.out.print("Birinchi ucragan extrmal element katta index:" + (indexMax + 1));
        }

    }
}
