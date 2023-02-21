package misollar_11_20;

import java.util.Scanner;

public class Task18 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan.
     * Ular orasidan birinchi uchragan eng katta toq element va uning o'rnini chiqaring.
     * Agar toq element bo'lmasa 0 chiqaring.
     */
    public static void main(String[] args) {
        // Bu masala Zafarbek ishlagan masala bilan birlashtirildi

        System.out.println("18-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a;

        boolean toqElementBormi = false;
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();

            if (a % 2 == 1 && max < a) {
                max = a;
                maxIndex = i;
                toqElementBormi = true;
            }
        }

        if (toqElementBormi) {
            System.out.print("Birinchi uchragan eng katta toq element:" + max);
            System.out.println();
            System.out.print("Birinchi uchragan eng katta toq element index:" + (maxIndex + 1));
        } else System.out.println(0);

    }
}
