package misollar_11_20;

import java.util.Scanner;

public class Task19 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan.
     * Ular orasidan birinchi uchragan eng katta element va udan keyingi elementlar sonini chiqaring.
     * Agar toq element bo'lmasa 0 chiqaring.
     */
    public static void main(String[] args) {
        // Bu masala Zafarbek ishlagan masala bilan birlashtirildi

        System.out.println("19-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a;

        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();

            if (max < a) {
                max = a;
                maxIndex = i;
            }
        }

        System.out.print("Birinchi uchragan eng katta element:" + max);
        System.out.println();
        System.out.print("Birinchi uchragan eng katta elementdan keyingi elementlar soni:" + (n - 1 - maxIndex));

    }
}
