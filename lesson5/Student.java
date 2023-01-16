package lesson5;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private String fullName;
    private int grade;
    private int[] grades;
    private String[] subjects;

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("grade")
    public int getGrade() {
        return grade;
    }

    @JsonProperty("grade")
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @JsonProperty("grades")
    public int[] getGrades() {
        return grades;
    }

    @JsonProperty("grades")
    public void setGrades(int[] argGradesList) {
        this.grades = new int[argGradesList.length];
        for (int i = 0; i < argGradesList.length; i++) {
            this.grades[i] = argGradesList[i];
        }
    }

    @JsonProperty("subjects")
    public String[] getSubjects() {
        return subjects;
    }

    @JsonProperty("subjects")
    public void setSubjects(String[] argSubjectsList) {
        this.subjects = new String[argSubjectsList.length];
        for (int i = 0; i < argSubjectsList.length; i++) {
            this.subjects[i] = argSubjectsList[i];
        }
    }

    public Student() {
    }

    public Student(String fullName, int grade, int[] grades, String[] subjects) {
        this.fullName = fullName;
        this.grade = grade;
        this.grades = grades;
        this.subjects = subjects;
    }

    public void printGrades() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.getGrades().length && i < this.getSubjects().length; i++) {
            sb.append(String.format("Student %s from grade %d got %d on subject %s\n", this.getFullName(),
                    this.getGrade(),
                    this.getGrades()[i], this.getSubjects()[i])).toString();
        }
        System.out.print(sb);
    }
}
