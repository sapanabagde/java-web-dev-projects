package org.studioinheritance;

//declaring Variables
public abstract class Question {
    public int pointValue;
    private String text;

    //Constructor
    public Question(int pointValue, String text) {
        this.pointValue = pointValue;
        this.text = text;
    }

     //Method
    public void displayQuestion() {
        System.out.println(text);
    }

    //getters and setters

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int x) {
        this.pointValue =x;
    }

  /*  public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;*/

        public abstract void displayAnswers();

        public abstract int getAnswers();

    }

