package com.kodilla.rps;

public class GameLogic {

    public static void startGame(String computerMove, String playerMove) {
        String win;
        String lose;
        RpsRunner rpsRunner = new RpsRunner();

        if (computerMove.equals(playerMove)) {
            System.out.println("It`s a draw!");
        } else {
            boolean playerWon = false;

            if (computerMove.equals("1")) {
                if (
                        playerMove.equals("2"))
                    playerWon = true;
                else
                    playerWon = false;
            } else if (computerMove.equals("2")) {
                if (playerMove.equals("3"))
                    playerWon = true;
                else
                    playerWon = false;
            } else if (computerMove.equals("3")) {
                if (playerMove.equals("1"))
                    playerWon = true;
                else
                    playerWon = false;
            }
            if (playerWon) {
                win = "You win. ";
                rpsRunner.ifPlayerWon = true;
                System.out.println(win + "You choose: " + playerMove + " and computer choose: " + computerMove + ".");
            } else {
                lose = "You lose. ";
                rpsRunner.ifPlayerWon = false;
                System.out.println(lose + "You choose: " + playerMove + " and computer choose: " + computerMove + ".");
            }
        }
    }
}