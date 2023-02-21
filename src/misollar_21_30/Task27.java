package misollar_21_30;

import java.util.Scanner;

public class Task27 {

    /**
     * EKUB(a,b) funksiyasidan foydalangan holda EKUK(a,b) funksiya hosil qiling.
     * EKUK bu a va b sonlarining eng kichik umummiy karralisi
     * EKUK = A*B/EKUB(A,B);
     */
    public static void main(String[] args) {

        System.out.println("27-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a:");
        int a = scanner.nextInt();

        System.out.print("b:");
        int b = scanner.nextInt();


        System.out.println(a + " va " + b + " sonlarni ekuk:" + ekuk(a, b));
    }

    // ekuk = a*b/ekub(a,b)
    static int ekuk(int a, int b) {
        return a * b / ekub(a, b);
    }

    // a va b sonlarning ekub ni qaytaradigan funksiya.
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
