package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To10Then10() {
        int left = 4;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2To3Then3() {
        int first = 2;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2To2Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To5To3To1Then5() {
        int first = 2;
        int second = 5;
        int third = 3;
        int four = 1;
        int result = Max.max(first, second, third, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2To2To2Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int four = 2;
        int result = Max.max(first, second, third, four);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}