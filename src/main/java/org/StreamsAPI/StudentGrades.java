package org.StreamsAPI;

public class StudentGrades {
    private String name;
    private int score;

    public StudentGrades(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
}

