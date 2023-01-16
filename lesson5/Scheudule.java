package lesson5;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Scheudule {
    private String day;
    private String[] subjects;

    @JsonProperty("day")
    public String getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(String day) {
        this.day = day;
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

    public Scheudule() {
    }

    public Scheudule(String day, String[] subjects) {
        this.day = day;
        this.subjects = subjects;
    }

    public void printScheudule() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Scheudule for %s: ", this.getDay())).toString();
        sb.append(Arrays.toString(this.getSubjects())).toString();
        sb.append("\n");
        System.out.print(sb);
    }
}
