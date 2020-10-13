package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static boolean ifPlayerWon;
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
        String playerMove = sc.nextLine();

        RandomComputerMove randomComputerMove = new RandomComputerMove();
        GameLogic gameLogic = new GameLogic();

        int countWins = 0;
        int k = 1;

        while (k <= numberOfGames - 1) {
            if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")) {
                gameLogic.startGame(randomComputerMove.generateRandomCPUMove(), playerMove);
                System.out.println("Make a move to win: ");
                playerMove = sc.nextLine().toUpperCase();
                k++;

                if (ifPlayerWon) {
                    countWins++;
                }

            } else {
                System.out.println("Invalid input.");
                playerMove = sc.nextLine();
            }
        }

        //Summing up game
        System.out.println("Player wins " + countWins + " time(s)."
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
}