package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int coin : coins) {
            while (change >= coin) {
                rsl[size] = coin;
                size++;
                change -= coin;
            }
        }
            return Arrays.copyOf(rsl, size);
        }

    class CrossArray {
        public static void printCrossEl(int[] left, int[] right) {
            for (int i : left) {
                for (int j : right) {
                    if (i == j) {
                        System.out.print(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {0, 1, 15, 7, 2};
        CrossArray.printCrossEl(left, right);
    }
    }