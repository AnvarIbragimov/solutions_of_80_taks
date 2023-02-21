package misollar_11_20;

import java.util.Scanner;

public class Task13 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan ular ichidan eng kichik element va uning o'rnini toping.
     */
    public static void main(String[] args) {
        // Bu masala Zafarbek ishlagan masala bilan birlashtirildi

        System.out.println("13-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a;

        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();

            if (min > a) {
                min = a;
                minIndex = i + 1;
            }
        }
        System.out.print("Kichigi=" + min);
        System.out.println();
        System.out.print("O'rni=" + minIndex);
    }
}
