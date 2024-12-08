package com.dev;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        Array1D arrayHandler = new Array1D(array);

        arrayHandler.printArray();
        System.out.println("Усі елементи масиву задовольняють предикату: " + arrayHandler.checkPredicate());

        int[][] matrix = {
                {9, 6, 3},
                {-2, 7, 8},
                {3, 13, 6}
        };
        Matrix matrixHandler = new Matrix(matrix);

        matrixHandler.printMatrix();
        System.out.println("Матриця є симетричною: " + matrixHandler.isSymmetric());
    }
}
