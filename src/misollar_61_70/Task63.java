package misollar_61_70;

import java.util.Scanner;

public class Task63 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("63-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("File yo'lini kiriting: ");
        String s = scanner.nextLine();

        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (prev == ' ') prev = s.charAt(i);
                else {
                    if ((int) prev > (int) s.charAt(i)) {
                        System.out.println(s.charAt(i));
                        return;
                    }
                    prev = s.charAt(i);
                }
            }
        }
        System.out.println(0);

    }

}