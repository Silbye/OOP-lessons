package lesson1;

import java.util.Scanner;

public class Menu {

    public void mainMenu() {
        Logic logic = new Logic();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Film[] films = logic.createFilmsList();
        System.out.println("Welcome!");
        while (flag) {
            System.out.printf("Options:\n");
            System.out.printf("1: Print all films\n");
            System.out.printf("2: Find a film by part of it's name\n");
            System.out.printf("3: Exit\n");

            char entered = scanner.next().charAt(0);
            switch (entered) {
                case '1': {
                    for (Film i : films) {
                        System.out.print(i.info());
                    }
                    break;
                }
                case '2': {
                    logic.findByName(films);
                    break;
                }
                case '3': {
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
