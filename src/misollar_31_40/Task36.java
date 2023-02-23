package misollar_31_40;

import java.util.Random;
import java.util.Scanner;

public class Task36 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("36-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int[] array = new int[n];
        fillMatrix(array);
        show(array);

        if (n < 3) {
            System.out.println("Massivni lokal max elementi yo'q");
            return;
        }

        int prev, current, next;
        int localMaxMin = Integer.MAX_VALUE;
        for (int i = 1; i < array.length - 2; i++) {
            prev = array[i - 1];
            current = array[i];
            next = array[i + 1];
            if (current > prev && current > next) {
                if (localMaxMin > current) localMaxMin = current;
            }
        }
        if (localMaxMin != Integer.MAX_VALUE) System.out.println("Result lokal max:" + localMaxMin);
        else System.out.println("Massivni lokal max elementi yo'q");
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
            array[i] = rand.nextInt() % 5 + 5;
        }
    }
}
