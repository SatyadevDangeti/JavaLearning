package com.java.learning;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 1000, 1, 20);
        int highScore = calculateScore(true, 5000, 11, 200);
        System.out.println("My first result :" + highScore);
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Satyadev", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Abdul", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Chethan", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else
            return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get in to position " +
                +highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore > 1000) {
            position = 1;
        } else if (playerScore >= 500) {

            position = 2;

        } else if (playerScore >= 100) {

            position = 3;

        }
        return position;
    }
}
