package com.ChrisFrahm;

public class Main {

    public static void main(String[] args) throws InvalidTestScore {

        double [] testScores = new double [] {-24, 88.8, 100, 95};
        TestScores ts = new TestScores(testScores);

        System.out.println(" Average score of tests: " + ts.testScoreAverage());

    }
}
