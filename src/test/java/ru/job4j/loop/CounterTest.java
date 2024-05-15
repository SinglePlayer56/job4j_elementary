package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void start0finish5equal15() {
        int start = 0;
        int finish = 5;
        int output = Counter.sum(start, finish);
        int expected = 15;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void start5finish0equal0() {
        int start = 5;
        int finish = 0;
        int output = Counter.sum(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void start0finish0equal0() {
        int start = 0;
        int finish = 0;
        int output = Counter.sum(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void start23finish56equal0() {
        int start = 23;
        int finish = 56;
        int output = Counter.sum(start, finish);
        int expected = 1343;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void startMinus3finish6equal15() {
        int start = -3;
        int finish = 6;
        int output = Counter.sum(start, finish);
        int expected = 15;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void startMinus1finishMinus6equal0() {
        int start = -1;
        int finish = -6;
        int output = Counter.sum(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void startMinus3finishMinus1equalMinus6() {
        int start = -3;
        int finish = -1;
        int output = Counter.sum(start, finish);
        int expected = -6;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom5To9Then14() {
        int start = 5;
        int finish = 9;
        int result = Counter.sumByEven(start, finish);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus5To5Then0() {
        int start = -5;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus5To10Then24() {
        int start = -5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10ToMinus5ThenMinus24() {
        int start = -10;
        int finish = -5;
        int result = Counter.sumByEven(start, finish);
        int expected = -24;
        assertThat(result).isEqualTo(expected);
    }

}