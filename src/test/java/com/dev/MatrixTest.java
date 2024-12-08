package com.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void testIsSymmetric_SymmetricMatrix() {
        int[][] symmetricMatrix = {
                {3, 6, 8},
                {6, 3, 7},
                {8, 7, 3}
        };
        Matrix matrixHandler = new Matrix(symmetricMatrix);
        assertTrue(matrixHandler.isSymmetric(), "Матриця має бути симетричною");
    }

    @Test
    void testIsSymmetric_NonSymmetricMatrix() {
        int[][] nonSymmetricMatrix = {
                {1, 0, 3},
                {21, 7, 88},
                {3, 4, 9}
        };
        Matrix matrixHandler = new Matrix(nonSymmetricMatrix);
        assertFalse(matrixHandler.isSymmetric(), "Матриця має бути несиметричною");
    }

    @Test
    void testIsSymmetric_EmptyMatrix() {
        int[][] emptyMatrix = {};
        Matrix matrixHandler = new Matrix(emptyMatrix);
        assertTrue(matrixHandler.isSymmetric(), "Порожня матриця вважається симетричною");
    }

    @Test
    void testIsSymmetric_SingleElementMatrix() {
        int[][] singleElementMatrix = {{5}};
        Matrix matrixHandler = new Matrix(singleElementMatrix);
        assertTrue(matrixHandler.isSymmetric(), "Матриця з одним елементом вважається симетричною");
    }
}
