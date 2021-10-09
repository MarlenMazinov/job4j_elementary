package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean rsl = false;
        if ((ab + bc) > ac && (ac + bc) > ab && (ab + ac) > bc) {
            rsl = true;
        }
        return rsl;
    }
}
