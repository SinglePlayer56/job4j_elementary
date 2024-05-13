package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double delta = 0.01;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenP10K4Square4() {
        int expected = 4;
        int p = 10;
        double k = 4;
        double delta = 0.01;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenP20K12Square7Dot1() {
        double expected = 7.1;
        int p = 20;
        double k = 12;
        double delta = 0.1;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}