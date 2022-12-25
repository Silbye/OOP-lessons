package lesson2;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Human {

    private int id;
    private String fullName;
    private int age;
    private String nationality;
    private String gender;
    private HashMap<Integer, String> relations = new HashMap<Integer, String>();

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setInt(int id) {
        this.id = id;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("age")
    public int getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("relations")
    public HashMap<Integer, String> getRelations() {
        return relations;
    }

    @JsonProperty("relations")
    public void setRelatives(int[] argIdList, String[] argRelationList) {
        for (int i = 0; i < argIdList.length; i++) {
            relations.put(argIdList[i], argRelationList[i]);
        }
    }

    Human() {
    }

    Human(int argId, String argName, int argAge, String argNationality, String argGender) {
        id = argId;
        fullName = argName;
        age = argAge;
        nationality = argNationality;
        gender = argGender;
    }

    public void info() {
        System.out.printf("Full name: %s\n", fullName);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Gender: %s\n", gender);
        System.out.printf("Nationality: %s\n", nationality);
        System.out.printf("==================================\n");
    }
}
