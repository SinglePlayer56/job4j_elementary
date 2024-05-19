package ru.job4j.calculator;

/**
 * Класс для расчета идеального веса.
 */
public class Fit {
    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    /**
     * Расчет идеального веса для мужчины.
     *
     * @param height рост мужчины в сантиметрах
     * @return идеальный вес мужчины
     */
    public static double calculateManWeight(short height) {
        if (height <= BASE_HEIGHT_MAN) {
            throw new IllegalArgumentException("Height must be greater than " + BASE_HEIGHT_MAN);
        }
        double result = (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
        return result;
    }

    /**
     * Расчет идеального веса для женщины.
     *
     * @param height рост женщины в сантиметрах
     * @return идеальный вес женщины
     */
    public static double calculateWomanWeight(short height) {
        if (height <= BASE_HEIGHT_WOMAN) {
            throw new IllegalArgumentException("Height must be greater than " + BASE_HEIGHT_WOMAN);
        }
        double result = (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = calculateManWeight(height);
        System.out.println("Man 187 is " + man);
    }
}
