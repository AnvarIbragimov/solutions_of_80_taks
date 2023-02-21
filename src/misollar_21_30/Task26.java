package misollar_21_30;

import java.util.Scanner;

public class Task26 {

    /**
     * Butun qiymat qaytaruvchi EKUB(a,b) funksiya hosil qiling.
     * Funksiya a va b sonlarning eng katta umumiy bo'luvchisini aniqlab qatarsin.
     */
    public static void main(String[] args) {

        System.out.println("26-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a:");
        int a = scanner.nextInt();

        System.out.print("b:");
        int b = scanner.nextInt();


        System.out.println(a + " va " + b + " sonlarni ekub:" + ekub(a, b));
    }

    // a va b sonlarning ekub ni qaytaradigan funksiya
    static int ekub(int a, int b) {
        int ekub = 1;
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ekub = i;
                break;
            }
        }

        return ekub;
    }
}
