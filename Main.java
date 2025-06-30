import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] matrix = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }

        printMatrix(matrix);
        printRotate(matrix);
    }

    public static void printMatrix(int[][] cell) {
        System.out.println("Дана следующая матрица:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", cell [i][j]);
            }
            System.out.println();
        }
    }

    public static void printRotate(int[][] cell) {
        System.out.println("Повернутая на 90 градусов матрица:");
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[j][SIZE - 1 - i] = cell [i][j];
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotatedMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
