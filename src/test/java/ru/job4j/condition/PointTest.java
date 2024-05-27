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

    @Test
    void when000to023then3Dot60() {
        double expected = 3.60;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 3);
        double delta = 0.01;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when132to351then3Dot00() {
        double expected = 3.00;
        Point a = new Point(1, 3, 2);
        Point b = new Point(3, 5, 1);
        double delta = 0.01;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when11to35then4Dot47() {
        double expected = 4.47;
        Point a = new Point(1, 1);
        Point b = new Point(3, 5);
        double delta = 0.01;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}