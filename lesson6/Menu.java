package lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        JsonParsing parser = new JsonParsing();
        boolean flag = true;
        boolean modeSelected = false;
        int mode = 0;
        Student[] students = new Student[] {};
        Scheudule[] scheudule = new Scheudule[] {};
        while (flag) {
            while (!modeSelected) {
                System.out.print("Mode select: 1 - Student, 2 - Teacher\n");
                char entered = scanner.next().charAt(0);
                switch (entered) {
                    case '1': {
                        mode = 1;
                        modeSelected = true;
                        break;
                    }
                    case '2': {
                        mode = 2;
                        modeSelected = true;
                        break;
                    }
                    default: {
                        System.out.println("Invalid input!");
                        break;
                    }
                }
            }
            System.out.print("Options: 1 - Load students from built in database (Useful if your json file is empty)\n" +
                    "2 - Load scheudule from built in database\n" +
                    "3 - Load students from file\n" +
                    "4 - Load scheudule from file\n" +
                    "5 - Print students' grades\n" +
                    "6 - Print scheudule\n" +
                    "7 - Export students to file\n" +
                    "8 - Export scheudule to file\n" +
                    "+ - Save all\n" +
                    "- - Load all\n" +
                    "0 - Exit\n");
            char entered = scanner.next().charAt(0);
            switch (entered) {
                case '1': {
                    if (mode == 2) {
                        students = logic.createStudentsList();
                    } else {
                        System.out.println("You dont have such permissions!");
                    }
                    break;
                }
                case '2': {
                    if (mode == 2) {
                        scheudule = logic.createScheudule();
                    } else {
                        System.out.println("You dont have such permissions!");
                    }
                    break;
                }
                case '3': {
                    students = parser.readStudents();
                    break;
                }
                case '4': {
                    scheudule = parser.readScheudule();
                    break;
                }
                case '5': {
                    logic.printStudents(students);
                    break;
                }
                case '6': {
                    logic.printScheudule(scheudule);
                    break;
                }
                case '7': {
                    if (mode == 2) {
                        parser.writeStudents(students);
                    } else {
                        System.out.println("You dont have such permissions!");
                    }
                    break;
                }
                case '8': {
                    if (mode == 2) {
                        parser.writeScheudule(scheudule);
                    } else {
                        System.out.println("You dont have such permissions!");
                    }
                    break;
                }
                case '+': {
                    if (mode == 2) {
                        logic.saveAll(students, scheudule);
                    } else {
                        System.out.println("You dont have such permissions!");
                    }
                    break;
                }
                case '-': {
                    if (mode == 2) {
                        HashMap<Student[], Scheudule[]> data = logic.loadAll();
                        for (Map.Entry<Student[], Scheudule[]> entry : data.entrySet()) {
                            students = entry.getKey();
                            scheudule = entry.getValue();
                        }
                    } else {
                        System.out.println("You dont have such permissions!");
                    }
                    break;
                }
                case '0': {
                    System.out.println("Goodbye!");
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("Incorrect input!");
                    break;
                }
            }
        }
    }
}
