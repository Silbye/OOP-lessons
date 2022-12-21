package lesson2;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Human {
    @JsonProperty("id")
    int id;
    @JsonProperty("fullName")
    String fullName;
    @JsonProperty("age")
    int age;
    @JsonProperty("nationality")
    String nationality;
    @JsonProperty("gender")
    String gender;
    @JsonProperty("relations")
    HashMap<Integer, String> relations = new HashMap<Integer, String>();

    Human() {
        super();
    }

    Human(int argId, String argName, int argAge, String argNationality, String argGender) {
        id = argId;
        fullName = argName;
        age = argAge;
        nationality = argNationality;
        gender = argGender;
    }

    public void addRelatives(int[] argIdList, String[] argRelationList) {
        for (int i = 0; i < argIdList.length; i++) {
            relations.put(argIdList[i], argRelationList[i]);
        }
    }

    public void info() {
        System.out.printf("Full name: %s\n", fullName);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Gender: %s\n", gender);
        System.out.printf("Nationality: %s\n", nationality);
        System.out.printf("==================================\n");
    }
}
