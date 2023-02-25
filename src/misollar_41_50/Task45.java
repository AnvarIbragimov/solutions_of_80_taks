package misollar_41_50;

import java.util.Scanner;

public class Task45 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("45-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("MxM matrissaning m=");
        int m = scanner.nextInt();

        int[][] matrix = new int[m][m];
        fillMatrix(matrix);
        show(matrix);

        moveByCorner(matrix);
    }

    // matrix o'lchami 3x3
    static void moveByCorner(int[][] matrix) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (row != matrix.length && column != -1) {
            // first out row
            for (int i = 0; i <= column; i++) {
                System.out.print(matrix[row][i] + " ");
            }

            // last out column
            for (int i = row + 1; i < matrix.length; i++) {
                System.out.print(matrix[i][column] + " ");
            }

            System.out.println();

            row++;
            column--;
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
