package com.bootCamp.matrix;

import java.util.ArrayList;

public class Matrix {
    private ArrayList<ArrayList<Integer>> matrix;

    Matrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    Matrix add(Matrix anotherMatrix) {
        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < matrix.size(); rowIndex++) {
            ArrayList<Integer> rowOfSameMatrix = matrix.get(rowIndex);
            ArrayList<Integer> rowOfAnotherMatrix = anotherMatrix.matrix.get(rowIndex);
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int columnIndex = 0; columnIndex < rowOfSameMatrix.size(); columnIndex++) {
                Integer elementOfSameMatrix = rowOfSameMatrix.get(columnIndex);
                Integer elementOfAnotherMatrix = rowOfAnotherMatrix.get(columnIndex);
                newRow.add(elementOfSameMatrix + elementOfAnotherMatrix);
            }
            resultMatrix.add(newRow);
        }
        return new Matrix(resultMatrix);
    }

    Matrix subtract(Matrix anotherMatrix) {
        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < matrix.size(); rowIndex++) {
            ArrayList<Integer> rowOfSameMatrix = matrix.get(rowIndex);
            ArrayList<Integer> rowOfAnotherMatrix = anotherMatrix.matrix.get(rowIndex);
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int columnIndex = 0; columnIndex < rowOfSameMatrix.size(); columnIndex++) {
                Integer elementOfSameMatrix = rowOfSameMatrix.get(columnIndex);
                Integer elementOfAnotherMatrix = rowOfAnotherMatrix.get(columnIndex);
                newRow.add(elementOfSameMatrix - elementOfAnotherMatrix);
            }
            resultMatrix.add(newRow);
        }
        return new Matrix(resultMatrix);
    }

    Matrix transpose() {
        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        final int noOfColumns = this.matrix.get(0).size();
        for (int columnIndex = 0; columnIndex < noOfColumns; columnIndex++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (ArrayList<Integer> row : this.matrix) {
                final Integer element = row.get(columnIndex);
                newRow.add(element);
            }
            resultMatrix.add(newRow);
        }
        return new Matrix(resultMatrix);
    }

    Matrix multiply(Matrix anotherMatrix){
        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < matrix.size(); rowIndex++) {
            ArrayList<Integer> rowOfSameMatrix = matrix.get(rowIndex);
            final int noOfColumns = anotherMatrix.matrix.get(0).size();
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int columnIndex = 0; columnIndex < noOfColumns; columnIndex++) {
                int sum = 0;
                for(int columnIndex1 = 0; columnIndex1 < anotherMatrix.matrix.size(); columnIndex1++){
                Integer elementOfSameMatrix = rowOfSameMatrix.get(columnIndex1);
                Integer elementOfAnotherMatrix = anotherMatrix.matrix.get(columnIndex1).get(columnIndex);
                sum += elementOfSameMatrix*elementOfAnotherMatrix;
                }
                newRow.add(sum);
            }
            resultMatrix.add(newRow);
        }
        return new Matrix(resultMatrix);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix anotherMatrix = (Matrix) o;
        return this.matrix.equals(anotherMatrix.matrix);
    }

}