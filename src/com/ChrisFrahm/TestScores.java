package com.ChrisFrahm;

/**
 * @author Chris Frahm
 * Class to get average and throw exception
 */
public class TestScores {
    double[] scores;
    public TestScores (double[] testScoreArray){
        this.scores = testScoreArray;
    }

    /**
     *
     * @return average
     * @throws InvalidTestScore
     */
    public double testScoreAverage() throws InvalidTestScore {
        double totalScore = 0;
        double averageScore = 0;

        for ( int i =0; i < scores.length; i++)
        {

            if (scores[i] < 0 || scores[i] > 100){
              //  throw new IllegalArgumentException("Number must be between 0 and 100");
                throw new InvalidTestScore();
            }
            totalScore += scores[i];
        }
        return totalScore/scores.length;
    }
}
