package com.bootCamp.matrix;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {

    @Test
    @DisplayName("should return sum of two matrices")
    void add() {
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        list1.add(new ArrayList<>(asList(1,2,3)));
        list2.add(new ArrayList<>(asList(1,2,3)));
        Matrix matrix1 = new Matrix(list1);
        Matrix matrix2 = new Matrix(list2);

        ArrayList<ArrayList<Integer>> expectedList = new ArrayList<>();
        expectedList.add(new ArrayList<>(asList(2,4,6)));
        Matrix expected = new Matrix(expectedList);
        assertEquals(expected, matrix1.add(matrix2));

    }

    @Test
    @DisplayName("should return difference of two matrices")
    void subtract() {
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        list1.add(new ArrayList<>(asList(1, 2, 3)));
        list2.add(new ArrayList<>(asList(1, 2, 3)));
        Matrix matrix1 = new Matrix(list1);
        Matrix matrix2 = new Matrix(list2);

        ArrayList<ArrayList<Integer>> expectedList = new ArrayList<>();
        expectedList.add(new ArrayList<>(asList(0, 0, 0)));
        Matrix expected = new Matrix(expectedList);
        assertEquals(expected, matrix1.subtract(matrix2));

    }

    @Test
    @DisplayName("should return transpose of matrix")
    void transpose() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(asList(1, 2, 3)));
        Matrix matrix1 = new Matrix(list);

        ArrayList<ArrayList<Integer>> expectedList = new ArrayList<>();
        expectedList.add(new ArrayList<>(asList(1)));
        expectedList.add(new ArrayList<>(asList(2)));
        expectedList.add(new ArrayList<>(asList(3)));
        Matrix expected = new Matrix(expectedList);
        assertEquals(expected, matrix1.transpose());

    }

    @Test
    @DisplayName("should return product of two matrices")
    void multiply() {
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        list1.add(new ArrayList<>(asList(1, 2,3)));
        list2.add(new ArrayList<>(asList(1, 2)));
        list2.add(new ArrayList<>(asList(1, 2)));
        list2.add(new ArrayList<>(asList(1, 2)));
        Matrix matrix1 = new Matrix(list1);
        Matrix matrix2 = new Matrix(list2);

        ArrayList<ArrayList<Integer>> expectedList = new ArrayList<>();
        expectedList.add(new ArrayList<>(asList(6, 12)));
        Matrix expected = new Matrix(expectedList);
        assertEquals(expected, matrix1.multiply(matrix2));

    }
}