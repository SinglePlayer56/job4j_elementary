package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{1, 2, 3};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas10Then4() {
        int[] data = new int[]{1, 2, 3, 8, 10, 17};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}