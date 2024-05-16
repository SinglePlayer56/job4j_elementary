package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        for (int[] item : array) {
            System.out.println(item.length);
        }
    }
}
