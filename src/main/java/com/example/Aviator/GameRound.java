package com.example.Aviator;

import java.util.Random;

public class GameRound {
    private double Multiplier;
    private double CrashPoint;
    private Random random;
    private final double ChanceToCrush = 0.05;

    public GameRound() {
        this.Multiplier = 1.0;
        this.random = new Random();
        this.CrashPoint = CreateCrashPoint();
    }

    private double CreateCrashPoint() {
        double multiplier = 1.0;
        while (true) {
            if (random.nextDouble() <= ChanceToCrush) {
                return multiplier;
            }
            multiplier += 0.1;
        }
    }

    public double getCrashPoint() {
        return CrashPoint;
    }

    public static void main(String[] args) {
        GameRound round = new GameRound();
        System.out.println("Улетел на " + round.getCrashPoint());
    }

}



