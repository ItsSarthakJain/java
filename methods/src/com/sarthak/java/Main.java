package com.sarthak.java;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;
        int highscore = calculatescore(gameover, score, levelcompleted, bonus);
        System.out.println("Your final score = " + highscore);
        highscore = calculatescore(true,10000, 8, 200);
        System.out.println("Your final score = " + highscore);

        int highscoreposition = calculatehighscoreposition(1500);
        displayhighscoreposition("Tim", highscoreposition);

        highscoreposition = calculatehighscoreposition(500);
        displayhighscoreposition("Bob", highscoreposition);

        highscoreposition = calculatehighscoreposition(400);
        displayhighscoreposition("Gim", highscoreposition);

        highscoreposition = calculatehighscoreposition(50);
        displayhighscoreposition("Gilbert", highscoreposition);

    }
    public static void displayhighscoreposition(String playername, int highscoreposition)
    {
        System.out.println(playername + " managed to get into position " + highscoreposition + " on the highscore table");

    }
    public static int calculatehighscoreposition(int playerscore)
    {
        if(playerscore > 1000)
            return 1;
        else if(playerscore > 500 && playerscore < 1000)
            return 2;
        else if(playerscore >100 && playerscore < 500)
            return 3;
        else
            return 4;
    }

    public static int calculatescore(boolean gameover, int score, int levelcompleted, int bonus)
    {
        if(gameover)
        {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 1000;
           /// System.out.println("Your final score = " + finalscore);
            return finalscore;


        }
        else
            return -1;
    }
}
