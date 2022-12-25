package lesson3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private String surname;
    private int grade;
    private String subject;

    @JsonProperty("surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @JsonProperty("grade")
    public int getGrade() {
        return grade;
    }

    @JsonProperty("grade")
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Student() {
    }

    public Student(String surname, int grade, String subject) {
        this.surname = surname;
        this.grade = grade;
        this.subject = subject;
    }
}
