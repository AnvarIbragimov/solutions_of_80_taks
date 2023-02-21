package misollar_1_10;

import java.util.Scanner;

public class Task9 {

    /**
     *
     */
    public static void main(String[] args) {
        // Bu masala Samandar Abduvaliev ishlagan masala bilan birlashtirildi

        System.out.println("9-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int sum = 0, soni = 0;

        while (n > 0) {
            sum += n % 10;
            soni++;
            n /= 10;
        }

        System.out.println(n + " soni raqamlari soni:" + soni);
        System.out.println(n + " soni raqamlari yig'indisi:" + sum);
    }
}
