package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = new int[]{10, 5, 2, 1};
        int[] result = new int[100];
        int change = money - price;
        int size = 0;

        for (int coin : coins) {
            while (change >= coin) {
                change -= coin;
                result[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
