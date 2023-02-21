package misollar_11_20;

import java.util.Scanner;

public class Task20 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan (n>2).
     * To'plamdagi ikkita qo'shni sonlari eng katta bo'ladi qiymatni chiqaring.
     */
    public static void main(String[] args) {

        System.out.println("21-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a;

        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();

            if (minFirst > a) {
                minSecond = minFirst;
                minFirst = a;
            } else if (minSecond > a) minSecond = a;
        }

        System.out.print("Birinchi uchragan eng kichik element:" + minFirst);
        System.out.println();
        System.out.print("Ikkinchi uchragan eng kichik element:" + minSecond);



    }
}

// 9 8 5 1 9 4 6 2 3