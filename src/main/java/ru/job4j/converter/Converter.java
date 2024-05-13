package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");
        float inputEuro = 140;
        float inputDollar = 120;
        float expected = 2;
        float outputEuro = rubleToEuro(inputEuro);
        float outputDollar = rubleToDollar(inputDollar);
        boolean passedEuro = expected == outputEuro;
        boolean passedDollar = expected == outputDollar;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("140 rubles are 2. Test result : " + passedDollar);
    }
}
