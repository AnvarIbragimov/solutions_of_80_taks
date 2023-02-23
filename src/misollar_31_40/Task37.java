package misollar_31_40;

import java.util.Random;
import java.util.Scanner;

public class Task37 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("37-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        System.out.print("r=");
        int r = scanner.nextInt();

        int[] array = new int[n];
        fillMatrix(array);
        show(array);

        int current;
        int mostLowDif = Integer.MAX_VALUE;
        int mostLowDifIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            current = array[i];
            if (mostLowDif > Math.abs(current - r)) {
                mostLowDif = Math.abs(current - r);
                mostLowDifIndex = i;
            }
        }
        System.out.println(r + " songa eng yaqin element:" + array[mostLowDifIndex]);

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
