import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] matrix = createMatrix(SIZE, SIZE);//  Создание матрицы

        System.out.println("Дана следующая матрица:");//  Вывод матрицы до поворота
        printMatrix(matrix);

        int[][] rotateMatriix = rotateMatrix(matrix);//  Разворот матрицы

        System.out.println();
        System.out.println("Повернутая на 90 градусов матрица:");//  Вывод матрицы после поворота
        printMatrix(rotateMatriix);
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[j][SIZE - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
        return matrix;
    }

}
