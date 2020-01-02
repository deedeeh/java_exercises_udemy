package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("dee", calculateHighScorePosition(1500));
        displayHighScorePosition("Mo", calculateHighScorePosition(900));
        displayHighScorePosition("kouki", calculateHighScorePosition(400));
        displayHighScorePosition("Lola", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.printf("%s managed to get into position %d on the high playerScore table.%n",
                playerName,
                highScorePosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
