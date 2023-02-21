package misollar_11_20;

import java.util.Scanner;

public class Task17 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan.
     * Ular eng kichik musbat sonni aniqlang, agar musbat son bo'lmasa 0 chiqaring.
     */
    public static void main(String[] args) {
        // Bu masala Zafarbek ishlagan masala bilan birlashtirildi

        System.out.println("17-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a;

        boolean musbatBormi = false;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();

            if (a > 0 && min > a) {
                min = a;
                musbatBormi = true;
            }
        }

        if (musbatBormi) System.out.print("Eng kichik son=" + min);
        else System.out.println(0);

    }
}
