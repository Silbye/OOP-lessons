package lesson5;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.File;
import java.nio.file.Paths;

public class JsonParsing {
    public void writeStudents(Student[] students) {
        String path = "lesson5/students.json";
        ObjectMapper mapper = new ObjectMapper();
        if (students.length == 0) {
            System.out.println("Database is empty!");
        } else {
            try {
                mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
                mapper.writeValue(Paths.get(path).toFile(), students);
                System.out.println("Database exported!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeScheudule(Scheudule[] scheudule) {
        String path = "lesson5/scheudule.json";
        ObjectMapper mapper = new ObjectMapper();
        if (scheudule.length == 0) {
            System.out.println("Database is empty!");
        } else {
            try {
                mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
                mapper.writeValue(Paths.get(path).toFile(), scheudule);
                System.out.println("Database exported!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Student[] readStudents() {
        String path = "lesson5/students.json";
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

    public Scheudule[] readScheudule() {
        String path = "lesson5/scheudule.json";
        ObjectMapper mapper = new ObjectMapper();
        Scheudule[] scheudule = new Scheudule[] {};
        File jsonFile = new File(path);
        if (jsonFile.length() == 0) {
            System.out.println("File is empty!");
        } else {
            try {
                scheudule = mapper.readValue(Paths.get(path).toFile(), Scheudule[].class);
                System.out.println("Database imported!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return scheudule;
    }
}
