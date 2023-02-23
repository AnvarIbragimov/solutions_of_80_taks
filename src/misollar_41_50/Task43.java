package misollar_41_50;

import java.util.Random;
import java.util.Scanner;

public class Task43 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("43-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv elementlar soni n=");
        int n = scanner.nextInt();

        int[] array = new int[n];
        fillMatrix(array);
        System.out.print("Massiv: ");
        show(array);

        seriesCountWithElement(array);
    }

    static void seriesCountWithElement(int[] array) {
        int counter = 1, prev = 0, current = 0;
        for (int i = 1; i < array.length; i++) {
            prev = i - 1;
            current = i;
            if (array[prev] == array[current]) counter++;
            else {
                System.out.println(array[prev] + "-series count:" + counter);
                counter = 1;
            }
        }
        if (array[prev] == array[current])
            System.out.println(array[current] + "-series count:" + counter);
        else System.out.println(array[current] + "-series count: 1");
    }

    static void show(int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    static void fillMatrix(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt() % 2 + 2;
        }
    }
}
