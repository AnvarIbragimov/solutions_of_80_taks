package misollar_41_50;

import java.util.Scanner;

public class Task44 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("44-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix satrlar soni m=");
        int m = scanner.nextInt();

        System.out.print("Matrix ustunlar soni n=");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        fillMatrix(matrix);
        show(matrix);

        sotPutLikeSpreal(matrix);
    }

    static void sotPutLikeSpreal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) System.out.print(matrix[i][j] + " , ");
                else {
                    System.out.print(matrix[i][n - 1 - j] + " , ");
                }
            }
            System.out.println();
        }
    }

    static void show(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void fillMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int mover = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = mover++;
            }
        }
    }
}
