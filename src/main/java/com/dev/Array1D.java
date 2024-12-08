package com.dev;

public class Array1D {
    private final double[] array;
    public Array1D(double[] array) {
        this.array = array;
    }
    public boolean checkPredicate() {
        for (int i = 0; i < array.length - 1; i++) {
            if (!f(array[i], array[i + 1])) {
                return false;
            }
        }
        return true;
    }
    private boolean f(double a, double b) {
        return a < b;
    }
    public void printArray() {
        System.out.print("Масив: ");
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}