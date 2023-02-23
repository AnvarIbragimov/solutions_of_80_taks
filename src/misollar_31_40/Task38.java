package misollar_31_40;

import java.util.Random;
import java.util.Scanner;

public class Task38 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("38-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int[] array = new int[n];
        fillMatrix(array);
        show(array);

        int current, counter;

        int[] result = new int[n];
        int mover = 0;

        boolean isCounted;
        for (int i = 0; i < array.length - 1; i++) {

            current = array[i];
            counter = 1;

            isCounted = false;
            for (int j = 0; j < mover; j++) {
                if (current == result[j]) {
                    isCounted = true;
                    break;
                }
            }
            if (!isCounted) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (j != i && current == array[j]) counter++;
                }
                System.out.println(current + " soni " + counter + " ta");
                result[mover++] = current;
            }
        }

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
