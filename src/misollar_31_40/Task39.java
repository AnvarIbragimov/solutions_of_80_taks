package misollar_31_40;

import java.util.Random;
import java.util.Scanner;

public class Task39 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("39-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Savollar soni m=");
        int m = scanner.nextInt();

        System.out.print("Tasodifiy tanlab olinadiganlar n=");
        int n = scanner.nextInt();

        if (n > m) {
            System.out.println("Savollar soni kam !!!");
            return;
        }

        Random random = new Random();

        int[] array = new int[n];
        int mover = 0;

        int randomNumber;
        boolean isExist;
        while (mover < n) {

            randomNumber = random.nextInt(n + 1);
            if (randomNumber == 0) continue;

            isExist = false;
            for (int i = 0; i < mover; i++) {
                isExist = randomNumber == array[i];
                if (isExist) break;
            }
            if (!isExist) array[mover++] = randomNumber;
        }

        show(array);
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
