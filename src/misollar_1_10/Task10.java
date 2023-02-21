package misollar_1_10;

import java.util.Scanner;

public class Task10 {

    /**
     *
     */
    public static void main(String[] args) {
        // Bu masala Samandar Abduvaliev ishlagan masala bilan birlashtirildi

        System.out.println("10-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a=");
        int a = scanner.nextInt();

        System.out.print("b=");
        int b = scanner.nextInt();

        int ekub = 0;
        // qolgan holatlar example a=18 b=12
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ekub = i;
                System.out.println("EKUB:" + ekub);
                return;
            }
        }
    }
}
