package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5Elem() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Elem() {
        int[] data = new int[] {5, -5, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-5, 0, 5};
        Assert.assertArrayEquals(expected, result);
    }
}