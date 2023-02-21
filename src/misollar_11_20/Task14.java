package misollar_11_20;

import java.util.Scanner;

public class Task14 {

    /**
     * N va N ta sondan iborat sonlar to'plami berilgan ular ichidan birinchi ucragan eng kichik va
     * oxirgi ucragan eng katta elementlar va ularni o'rnini toping.
     */
    public static void main(String[] args) {
        // Bu masala Zafarbek ishlagan masala bilan birlashtirildi

        System.out.println("14-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a;

        int indexMin = 0, indexMax = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();

            if (max <= a) {
                max = a;
                indexMax = i;
            }

            if (min > a) {
                min = a;
                indexMin = i;
            }
        }
        System.out.print("Eng oxirgi uchragan eng kattasi element:" + max);
        System.out.println();
        System.out.print("Eng oxirgi uchragan eng kattasi element o'rni:" + (indexMax + 1));
        System.out.println();
        System.out.print("Eng birinchi uchragan kichik element:" + min);
        System.out.println();
        System.out.print("Eng birinchi uchragan kichik element indexi:" + (indexMin + 1));
    }
}
