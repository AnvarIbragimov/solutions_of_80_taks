import java.util.Scanner;

public class Task8 {

    /**
     *
     */
    public static void main(String[] args) {
        // Bu masala Samandar Abduvaliev ishlagan masala bilan birlashtirildi

        System.out.println("8-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dastlabki summani kiriting=");
        float s = scanner.nextFloat();

        System.out.print("Oylik foizni kiriting:");
        float p = scanner.nextInt();

        float summa = s;
        int oylarSoni = 0;
        while (summa < 2 * s) {
            summa += summa * (p / 100f);
            oylarSoni++;
        }
        System.out.println(oylarSoni + " - oyda umumiy summa : " + summa);
    }
}
