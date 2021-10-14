package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasnot5ThenMinus1() {
        int[] data = {8, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSearch2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOfInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSearch8ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 8;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOfInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}