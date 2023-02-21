package misollar_21_30;

import java.util.Scanner;

public class Task21 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan (n>2).
     * To'plamdagi eng kichik 2ta elementni ekranga chiqaring.
     */
    public static void main(String[] args) {

        System.out.println("21-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a = 0, prev = 0;

        int maxSumma = 0;
        for (int i = 0; i < n; i++) {

            if (i > 0) prev = a;
            a = scanner.nextInt();

            if (i > 0 && prev + a > maxSumma) maxSumma = prev + a;
        }

        System.out.print("Summa:" + maxSumma);

    }
}