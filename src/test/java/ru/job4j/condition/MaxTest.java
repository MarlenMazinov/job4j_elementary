package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when2Args() {
        int first = 10;
        int second = 5;
        int expected = 10;
        int result = Max.max(first, second);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3Args() {
        int first = 0;
        int second = 8;
        int third = 3;
        int expected = 8;
        int result = Max.max(first, second, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4Args() {
        int first = 0;
        int second = 3;
        int third = 3;
        int fourth = 1;
        int expected = 3;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }
}