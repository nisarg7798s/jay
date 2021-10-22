package com.nisarg;

public class EvaluationItem {
    String name;
    double maxScore;
    double scoreObtained;


    public EvaluationItem() {
        // Creating default constructor with default values.
        name = "default item";
        maxScore = 100;
        scoreObtained = 100;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EvaluationItem{" +
                "name='" + name + '\'' +
                ", maxScore=" + maxScore +
                ", scoreObtained=" + scoreObtained +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getScoreObtained() {
        return scoreObtained;
    }

    public void setScoreObtained(double scoreObtained) {
        this.scoreObtained = scoreObtained;
    }
}
