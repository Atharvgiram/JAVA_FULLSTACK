package com.PracticeQuestion;

public class Student1 {

    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid Marks");

    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}