import java.util.Scanner;

public class Task5 {

    /**
     * N natural soni berilgan.
     * Shu songacha bo'lgan mukammal sonlarni chiqaruvchi programma  tuzilsin.
     * O'zidan boshqa bo'luvchilari yig'indisi o'ziga teng bo'lgan son mukammal son deyiladi.
     * Masalan 6,28
     */
    public static void main(String[] args) {
        // Bu masala Samandar ishlagan masala bilan birlashtirildi

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int summa;
        for (int i = 2; i < n; i++) {

            summa = 0;
            for (int j = 1; j <= i / 2; j++) {

                if (i % j == 0) summa += j;

            }

            if (summa == i) System.out.println(i);

        }
    }
}
