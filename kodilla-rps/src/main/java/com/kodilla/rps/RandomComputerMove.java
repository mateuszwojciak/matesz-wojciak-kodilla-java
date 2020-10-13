package com.kodilla.rps;

import java.util.concurrent.ThreadLocalRandom;

public class RandomComputerMove {
    public static String generateRandomCPUMove() {
        int randomInt = ThreadLocalRandom.current().nextInt(1, 4);

        RpsRunner rpsRunner = new RpsRunner();

        String computerMove = null;

        switch (randomInt) {
            case 1:
                computerMove = rpsRunner.rock;
                break;
            case 2:
                computerMove = rpsRunner.paper;
                break;
            case 3:
                computerMove = rpsRunner.scissors;
                break;
        }
        return computerMove;
    }
}