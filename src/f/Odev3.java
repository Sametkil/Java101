package f;

import java.util.Arrays;
        public class Odev3 {

    public static void change (int [][] matrix) {
        int [][] newMatrix = new int [matrix[0].length][matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[0].length; col++) {
                newMatrix[col][rows] = matrix [rows][col];
            }
        }
        printArray(newMatrix);
    }
    public static void printArray(int [][] matrix) {
        for (int [] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

            public static void main(String[] args) {
                int [][] matrix = { {1,2,3},
                                    {4,5,6} };
                System.out.println("Eski");
                printArray(matrix);
                System.out.println("Yeni");
                change(matrix);
                System.out.println(Arrays.toString(matrix));
            }
}