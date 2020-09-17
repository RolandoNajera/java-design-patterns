package com.rolasnajera.training;

import com.rolasnajera.training.controller.ScoreBoard;
import com.rolasnajera.training.model.Balloon;
import com.rolasnajera.training.model.Clown;
import com.rolasnajera.training.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Tap Score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown Tap Score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);

    }
}
