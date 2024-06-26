package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double delta = 0.01;
        double output = Fit.calculateManWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double delta = 0.01;
        double output = Fit.calculateWomanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenManLessThanBaseThenException() {
        short height = 99;
        assertThatThrownBy(() -> Fit.calculateManWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Height must be greater than 100");
    }

    @Test
    void whenWoman167Then65Dot55() {
        short height = 167;
        double expected = 65.55;
        double delta = 0.01;
        double result = Fit.calculateWomanWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(delta));
    }
}