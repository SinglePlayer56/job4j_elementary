package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] nestedArray : array) {
            for (int number : nestedArray) {
                result += number;
            }
        }
        return result;
    }
}
