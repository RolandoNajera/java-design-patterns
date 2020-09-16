package com.rolasnajera.training.model;

import com.rolasnajera.training.controller.ScoreAlgorithmBase;

public class Balloon extends ScoreAlgorithmBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
