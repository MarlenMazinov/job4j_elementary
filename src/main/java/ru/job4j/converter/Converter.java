package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
        in = 3;
        expected = 210;
        out = Converter.euroToRuble(in);
        System.out.println("3 euro are 210 rubles. Test result : " + passed);
        in = 4;
        expected = 240;
        out = Converter.dollarToRuble(in);
        System.out.println("4 dollars are 240 rubles. Test result : " + passed);
    }
}
