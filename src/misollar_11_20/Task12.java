package misollar_11_20;

import java.util.Scanner;

public class Task12 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan ular ichidan eng katta va eng kichik
     * elementlarni toping
     */
    public static void main(String[] args) {
        // Bu masala Zafarbek ishlagan masala bilan birlashtirildi

        System.out.println("12-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();

            if (max < a) max = a;
            if (min > a) min = a;
        }

        System.out.print("Eng kattasi=" + max);
        System.out.println();
        System.out.print("Kichigi=" + min);
    }
}
