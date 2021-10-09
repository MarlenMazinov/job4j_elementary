package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenab2ac2bc3Thentrue() {
        double ab = 2;
        double ac = 2;
        double bc = 3;
        boolean rsl = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenab1ac1bc3Thenfalse() {
        double ab = 1;
        double ac = 1;
        double bc = 3;
        boolean rsl = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(rsl);
    }
}