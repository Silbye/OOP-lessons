package lesson2;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        FileReading reading = new FileReading();
        boolean flag = true;
        Human[] people = new Human[] {};
        while (flag) {
            System.out.print("Options: 1 - Load people from built in database (Useful if your json file is empty)\n" +
                    "2 - Print all people\n" +
                    "3 - Get all relatives\n" +
                    "4 - Import from JSON file\n" +
                    "5 - Get only children\n" +
                    "6 - Export to JSON\n" +
                    "0 - Exit\n");
            char entered = scanner.next().charAt(0);
            switch (entered) {
                case '1': {
                    people = logic.createPeopleList();
                    break;
                }
                case '2': {
                    logic.printPeople(people);
                    break;
                }
                case '3': {
                    logic.getRelatives(people);
                    break;
                }
                case '4': {
                    people = reading.readFromFile();
                    break;
                }
                case '5': {
                    logic.getChildren(people);
                    break;
                }
                case '6': {
                    reading.writeToFile(people);
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
