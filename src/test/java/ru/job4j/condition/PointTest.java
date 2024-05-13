package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double delta = 0.01;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when01toMinus10then1Dot41() {
        double expected = 1.41;
        int x1 = 0;
        int y1 = 1;
        int x2 = -1;
        int y2 = 0;
        double delta = 0.01;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when11to2Minus3then4Dot12() {
        double expected = 4.12;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = -3;
        double delta = 0.01;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when30to03then4Dot24() {
        double expected = 4.24;
        int x1 = 3;
        int y1 = 0;
        int x2 = 0;
        int y2 = 3;
        double delta = 0.01;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}