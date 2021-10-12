package ru.job4j.live;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
}

class Game {
    public static int checkGame(double percent, int prize, int pay) {
        if (percent * prize > pay) {
            return (int) (percent * prize - pay);
        }
        return 0;
    }
}
