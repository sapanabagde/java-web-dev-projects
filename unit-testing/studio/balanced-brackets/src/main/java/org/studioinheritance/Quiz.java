package org.studioinheritance;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;
    private int total;
    private int pts;

    //Creating constructor
    public Quiz(ArrayList<Question> question) {
        this.questions = questions;
        this.score = 0;
        this.total = 0;
        for (int i = 0; i < question.size(); i++) {
            this.total = this.total + question.get(i).getPointValue();
        }

    }

// Creating method
    public void addQuestion(Question newQuestion) {
        this.questions.add(newQuestion);
        this.total = this.total + newQuestion.getPointValue();

    }

    // Creating another method
      public void runQuiz() {
        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).displayQuestion();
            questions.get(i).displayAnswers();
            updateScore(pts);
        }
}

public void updateScore(int x) {
        this.score = this.score + x;
}

public void gradeQuiz() {
        System.out.println("You finished the quiz! Your score is: " + score + "/");
}

}
