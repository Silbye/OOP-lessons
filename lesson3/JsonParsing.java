package lesson3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.File;
import java.nio.file.Paths;

public class JsonParsing {
    public Student[] parseJson() {
        String path = "lesson3/students.json";
        ObjectMapper mapper = new ObjectMapper();
        Student[] students = new Student[] {};
        File jsonFile = new File(path);
        if (jsonFile.length() == 0) {
            System.out.println("File is empty!");
        } else {
            try {
                students = mapper.readValue(Paths.get(path).toFile(), Student[].class);
                System.out.println("Database imported!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return students;
    }
}