package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to20Then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to11Then4Point12() {
        double expected = 4.12;
        int x1 = 0;
        int y1 = 5;
        int x2 = 1;
        int y2 = 1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when286to663Then4Point12() {
        double expected = 5.385;
        int x1 = 2;
        int y1 = 8;
        int z1 = 6;
        int x2 = 6;
        int y2 = 6;
        int z2 = 3;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}