package ru.job4j.calculator;

public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int onePlusTwo = one + two;
        int sixDivTo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
