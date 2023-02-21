package misollar_21_30;

import java.util.Scanner;

public class Task28 {

    /**
     * EKUB(a,b) funksiyasidan foydalangan holda EKUB3(a,b,c) funksiya hosil qiling.
     * EKUB3(a,b,c) funksiya a,b va c sonlarning umumiy bo'luvchisini topib bersin.
     */
    public static void main(String[] args) {

        System.out.println("28-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a:");
        int a = scanner.nextInt();

        System.out.print("b:");
        int b = scanner.nextInt();

        System.out.print("c:");
        int c = scanner.nextInt();


        System.out.println(a + ", " + b + " va " + c + " sonlarni ekub:" + ekub3(a, b, c));
    }

    static int ekub3(int a, int b, int c) {
        int ekub = 1;
        int minAvaB = Math.min(a, b);
        int minCvaMin = Math.min(c, minAvaB);
        for (int i = minCvaMin; i >= 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                ekub = i;
                break;
            }
        }

        return ekub;
    }
}
