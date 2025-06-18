import java.util.Random;
public class Main {
    
    public static final int SIZE = 8;
    public static void main(String[] args) {
        
        int[][] colors = new int[SIZE][SIZE];
        
        Random random = new Random();
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
      colors[i][j] = random.nextInt(256);
                }
            }
        
        printColors(colors);
        printRotate(colors);
    }
        
        public static void printColors(int[][] colors){
            System.out.println("Дана следующая матрица:");
            for (int i = 0; i < SIZE; i++){
                for (int j = 0; j < SIZE; j++){
                    System.out.format("%4d", colors[i][j]);
                }
                System.out.println();
            }
        }
        
        public static void printRotate(int[][] colors){
            System.out.println("Повернутая на 90 градусов матрица:");
            int[][] rotatedColors = new int[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++){
        for (int j = 0; j < SIZE; j++){
            rotatedColors[j][SIZE -1 - i] = colors[i][j];
        }
    }

    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            System.out.format("%4d", rotatedColors[i][j]);
        }
        System.out.println();
    }
        }
}