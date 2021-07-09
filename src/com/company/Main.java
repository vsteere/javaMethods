package com.company;

public class Main {

    public static void main(String[] args) {

        //following along with class

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        //coding challenge

        String name = "John Smith";
        int gamescore = 1500;
        int position = calculateHighScorePosition(gamescore);
        String report = displayHighScorePosition(name, position);
        System.out.println(report);

        name = "James Smith";
        gamescore = 900;
        position = calculateHighScorePosition(gamescore);
        report = displayHighScorePosition(name, position);
        System.out.println(report);

        name = "John Doe";
        gamescore = 400;
        position = calculateHighScorePosition(gamescore);
        report = displayHighScorePosition(name, position);
        System.out.println(report);

        name = "James Doe";
        gamescore = 50;
        position = calculateHighScorePosition(gamescore);
        report = displayHighScorePosition(name, position);
        System.out.println(report);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return -1;
    }

    public static String displayHighScorePosition(String name, int position) {
        return name + " managed to get into position " + position + " on the high score table";

    }

    public static int calculateHighScorePosition(int gamescore) {
        if (gamescore >= 1000) {
            return 1;
        } else if (gamescore >= 500) {
            return 2;
        } else if (gamescore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    //alternative solution
    //public static void displayHighScorePosition(String playerName, int highScorePosition) {system.
    //out.println(playerName + "managed to get into position " + highScorePosition + " on the high score table"):
    // calculate high score method the same.
    //to call; highScorePosition  = calculateHighScorePosition(pass the score here);
    //displayHighScorePosition("pass the player name", highScorePosition);
    //this solution makes it so you don't have to return a result from the first method. The way I did it, I passed
    //the variables rather than hard coding the data within the method. My way would work better if you're passing
    //something from the front end.

}

