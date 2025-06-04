package shzeproject.arrays.multiline;

import shzeproject.Utils;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.SimpleTimeZone;


public class MultiDimArray {
    public static Random random = new Random();

    public static double[][] multiDimArray(int row,int colum,  int startIdx, int endIdx){
        final Random random = new Random();

        if(!(startIdx < endIdx)){
            throw new RuntimeException(String.format("End (%d) < Start (%d)", startIdx, endIdx ));
        }

        double[][] matrix = new double[row][colum];

        for (int i = 0; i < row; i++) {
            for(int j = 0; j < colum; j++){
                matrix[i][j] = startIdx + random.nextDouble() * (endIdx - startIdx);
            }
        }

        return matrix;
    }

    public static void printMatrix(double[][] matrix){

        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.printf(" %.2f ", aDouble);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matrix = multiDimArray(3, 4, 5, 10);

        printMatrix(matrix);


        System.out.println(" ");
        String[][] stringMatrix = new String[5][5];
        String matrixString = Utils.matrixToString(stringMatrix);
        System.out.println(matrixString);

        System.out.println(" ");
        String[][] matrixLadder = new String[5][];
        for(int i = 0; i < matrixLadder.length; i++){
            int size = random.nextInt(1, matrixLadder.length);
            matrixLadder[i] = new String[size];
            for(int j = 0; j < matrixLadder[i].length; j++){
                matrixLadder[i][j] = Integer.valueOf(j).toString();
            }
        }

        System.out.println(Utils.matrixToString(matrixLadder));

        String[] stringArray = new String[10];
        stringArray[0] = "String";
        //Невозможно поместить в массив элемент, отличный от String
        // stringArray[1] = new Integer(1); - проверка во время компиляции и во время выполнения

        Object[] objects = new Object[10];
        objects[0] = "String";
        objects[1] = 1; // Автоматическая упаковка примитивов в объект Integer

    }
}
