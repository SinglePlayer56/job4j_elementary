package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double delta = 0.01;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when01toMinus10then1Dot41() {
        double expected = 1.41;
        Point a = new Point(0, 1);
        Point b = new Point(-1, 0);
        double delta = 0.01;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when11to2Minus3then4Dot12() {
        double expected = 4.12;
        Point a = new Point(1, 1);
        Point b = new Point(2, -3);
        double delta = 0.01;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when30to03then4Dot24() {
        double expected = 4.24;
        Point a = new Point(3, 0);
        Point b = new Point(0, 3);
        double delta = 0.01;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}