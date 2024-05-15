package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int number = 5;
        int output = Factorial.calculate(number);
        int expected = 120;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int output = Factorial.calculate(number);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }
}