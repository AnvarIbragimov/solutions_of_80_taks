import java.util.Scanner;

public class Task3 {

    /**
     * x va y haqiqiy sonlar berilgan.
     * Ularning kichigini sonlar yig'indisining yarmiga,
     * kattasini ko'paytmasining ikkilanganiga almashtiruvchi programma tuzilsin.
     * Agar sonlar teng bo'lsa, o'zgarishsiz qoldirilsin.
     */
    public static void main(String[] args) {
        // Bu masala Samandar ishlagan masala bilan birlashtirildi

        Scanner scanner = new Scanner(System.in);

        float x, y;

        System.out.print("x=");
        x = scanner.nextFloat();

        System.out.print("y=");
        y = scanner.nextFloat();

        if (x > y) {
            // x kattasi va y kichigi
            x = 2 * x * y;
            y = (x + y) / 2;
        } else {
            if (y > x) {
                // y kattasi va x kichigi
                y = 2 * x * y;
                x = (x + y) / 2;
            } else {
                // x va y o'zaro teng, o'zgarishiz qoladi
            }
        }

        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
