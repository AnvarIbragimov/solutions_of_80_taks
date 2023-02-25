package misollar_61_70;

import java.util.Scanner;

public class Task61 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("56-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("File yo'lini kiriting: ");
        String s = scanner.nextLine();

        int firstBackslashIndex = s.indexOf("\\");
        int lastBackslashIndex = s.lastIndexOf("\\");

        if (firstBackslashIndex == lastBackslashIndex) {
            System.out.println("\\");
            return;
        }

        int secondBackslashIndex = s.indexOf("\\", firstBackslashIndex + 1);
        System.out.println(s.substring(firstBackslashIndex + 1, secondBackslashIndex));


    }

}