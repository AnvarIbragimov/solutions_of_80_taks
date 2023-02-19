import java.util.Scanner;

public class Task6 {

    /**
     *
     */
    public static void main(String[] args) {
        // Bu masala Samandar Abduvaliev ishlagan masala bilan birlashtirildi

        Scanner scanner = new Scanner(System.in);

        System.out.println("6-masala");

        System.out.print("N=");
        int n = scanner.nextInt();


        boolean tubmi;
        for (int i = 2; i <= n; i++) {

            double ildiz = Math.sqrt(i);

            tubmi = true;
            for (int j = 2; j <= ildiz; j++) {
                tubmi = i % j != 0;
                if (!tubmi) break;
            }
            if (tubmi) System.out.println(i);
        }
    }
}
