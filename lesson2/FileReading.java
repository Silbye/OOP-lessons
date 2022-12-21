package lesson2;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.File;
import java.nio.file.Paths;

public class FileReading {
    public void writeToFile(Human[] people) {
        String path = "lesson2/people.json";
        ObjectMapper mapper = new ObjectMapper();
        if (people.length == 0) {
            System.out.println("Database is empty!");
        } else {
            try {
                mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
                mapper.writeValue(Paths.get(path).toFile(), people);
                System.out.println("Database exported!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Human[] readFromFile() {
        String path = "lesson2/people.json";
        ObjectMapper mapper = new ObjectMapper();
        Human[] people = new Human[] {};
        File jsonFile = new File(path);
        if (jsonFile.length() == 0) {
            System.out.println("File is empty!");
        } else {
            try {
                people = mapper.readValue(Paths.get(path).toFile(), Human[].class);
                System.out.println("Database imported!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return people;
    }
}
