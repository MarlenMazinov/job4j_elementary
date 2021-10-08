package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when10more5Then10() {
        int left = 10;
        int right = 5;
        int expected = 10;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3less5Then5() {
        int left = 3;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4equals4Then4() {
        int left = 4;
        int right = 4;
        int expected = 4;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
}