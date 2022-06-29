package Lesson2.Homework;

import Lesson2.Homework.User;

public class Student extends User {

    char clas;
    double score;


    public Student(){

    }

    public Student(char clas, double score) {
        this.clas = clas;
        this.score = score;
    }

    public char getClas() {
        return clas;
    }

    public void setClas(char clas) {
        this.clas = clas;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }








}
