package com.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1DTest {

    @Test
    void testCheckPredicate_AllElementsSatisfy() {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        Array1D arrayHandler = new Array1D(array);
        assertTrue(arrayHandler.checkPredicate(), "Предикат має бути істинним для масиву");
    }

    @Test
    void testCheckPredicate_NotAllElementsSatisfy() {
        double[] array = {4.0, 2.0, 3.0, 1.0};
        Array1D arrayHandler = new Array1D(array);
        assertFalse(arrayHandler.checkPredicate(), "Предикат має бути хибним для масиву");
    }

    @Test
    void testEmptyArray() {
        double[] array = {};
        Array1D arrayHandler = new Array1D(array);
        assertTrue(arrayHandler.checkPredicate(), "Порожній масив вважається істинним");
    }

    @Test
    void testSingleElementArray() {
        double[] array = {5.0};
        Array1D arrayHandler = new Array1D(array);
        assertTrue(arrayHandler.checkPredicate(), "Масив із одним елементом вважається істинним");
    }
}
