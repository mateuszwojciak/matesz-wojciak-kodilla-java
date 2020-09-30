package com.kodilla.rps;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RpsRunner {
    String rock = "1";
    String paper = "2";
    String scissors = "3";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Wywołanie zapytania o imię i liczbę wygranych
        System.out.println("Enter your name: ");
        String sayYourName = sc.nextLine().toUpperCase().replace(" ", "");
        System.out.println("Set up number of games: ");
        int numberOfGames = sc.nextInt();
        String word = sc.nextLine(); //W celu zatrzymania działania nextInt()
        System.out.println("Hello " + sayYourName + ". You will play " + numberOfGames + " time(s).");

        //Instrukcja
        System.out.println("Instructions:\n" +
                "Button '1' - ROCK\n" +
                "Button '2' - PAPER\n" +
                "Button '3' - SCISSORS\n" +
                "Button 'x' - End game\n" +
                "Button 'n' - Start new game");

        System.out.println("Make your move:");

        String playerMove = sc.nextLine().toUpperCase();
        boolean playerWon = false;
        int countWinsOfPlayer = 0;

        for (int k = 0; k <= numberOfGames - 1; k++) {
            if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")) {
                if (k <= numberOfGames - 2) {
                    startGame(generateRandomCPUMove(), playerMove);
                    System.out.println("Make a move to win: ");
                    playerMove = sc.nextLine().toUpperCase();
                }
            } else {
                System.out.println("Invalid input.");
            }
        }

        //Summing up game
        System.out.println("Player wins " + countWinsOfPlayer + " time(s)."
                + "\nWhat to do next? Press 'n' or 'x'.");

        String whatNext = sc.nextLine().toLowerCase();

        if (whatNext.equals("n")) {
            System.out.println("New game loading...");

        } else if (whatNext.equals("x")) {
            System.out.println("End game.");
        } else {
            System.out.println("Invalid input. Game ended.");
        }
    }

    private static String generateRandomCPUMove() {
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

    private static void startGame(String computerMove, String playerMove) {
        String win;
        String lose;
        if (computerMove.equals(playerMove)) {
            System.out.println("It`s a draw!");
        } else {
            boolean playerWon = false;

            if (computerMove.equals("1")) {
                if (playerMove.equals("2"))
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
                System.out.println(win + "You choose: " + playerMove + " and computer choose: " + computerMove + ".");
            } else {
                lose = "You lose. ";
                System.out.println(lose + "You choose: " + playerMove + " and computer choose: " + computerMove + ".");
            }
        }
    }
}