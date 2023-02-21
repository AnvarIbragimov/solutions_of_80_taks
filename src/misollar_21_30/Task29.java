package misollar_21_30;

import java.util.Scanner;

public class Task29 {

    /**
     * N soni va N ta natural son berilgan EKUB funksiyadan foydalangan holda n ta soni ekub ni toping.
     */
    public static void main(String[] args) {

        System.out.println("29-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int a = 0, ekub = 1;
        for (int i = 0; i < n; i++) {

            a = scanner.nextInt();
            if (i > 0) {
                ekub = ekub(a, ekub);
            } else ekub = a;
        }

        System.out.println("Toplam sonlarni ekub:" + ekub);
    }

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
