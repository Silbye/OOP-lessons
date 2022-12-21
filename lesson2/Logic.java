package lesson2;

import java.util.Map;

public class Logic {
    public Human[] createPeopleList() {
        Human firstHuman = new Human(0, "Ivan Ivanov", 25, "Russian", "Male");
        Human secondHuman = new Human(1, "Olga Ivanova", 50, "Russian", "Female");
        Human thirdHuman = new Human(2, "Aleksandra Ivanova", 78, "Russian", "Female");
        Human fourthHuman = new Human(3, "Petr Ivanov", 52, "Russian", "Male");
        Human fifthHuman = new Human(4, "Evgeniy Ivanov", 79, "Russian", "Male");

        Human[] people = new Human[] { firstHuman, secondHuman, thirdHuman, fourthHuman, fifthHuman };

        firstHuman.addRelatives(new int[] { 1, 2, 3, 4 },
                new String[] { "Parent", "Grandparent", "Parent", "Grandparent" });
        secondHuman.addRelatives(new int[] { 0, 2, 3 }, new String[] { "Child", "Parent", "Spouse" });
        thirdHuman.addRelatives(new int[] { 0, 1 }, new String[] { "Grandchild", "Child" });
        fourthHuman.addRelatives(new int[] { 0, 1, 4 }, new String[] { "Child", "Spouse", "Parent" });
        fifthHuman.addRelatives(new int[] { 0, 3 }, new String[] { "Grandchild", "Child" });

        System.out.println("Database loaded!");

        return people;
    }

    public void printPeople(Human[] people) {
        if (people.length == 0) {
            System.out.println("Database is empty!");
        } else {
            for (Human object : people) {
                object.info();
            }
        }
    }

    public void getRelatives(Human[] people) {
        if (people.length == 0) {
            System.out.println("Database is empty!");
        } else {
            for (Human object : people) {
                object.info();
                for (Map.Entry<Integer, String> entry : object.relations.entrySet()) {
                    int argId = entry.getKey();
                    String argRelation = entry.getValue();
                    Relative relative = new Relative(argId, people[argId].fullName, people[argId].age,
                            people[argId].nationality, people[argId].gender, argRelation);
                    relative.info();
                }
            }
        }
    }

    public void getChildren(Human[] people) {
        if (people.length == 0) {
            System.out.println("Database is empty!");
        } else {
            for (Human object : people) {
                object.info();
                boolean hasChildren = false;
                for (Map.Entry<Integer, String> entry : object.relations.entrySet()) {
                    int argId = entry.getKey();
                    String argRelation = entry.getValue();
                    if (argRelation.equals("Child")) {
                        Relative relative = new Relative(argId, people[argId].fullName, people[argId].age,
                                people[argId].nationality, people[argId].gender, argRelation);
                        relative.info();
                        hasChildren = true;
                    } else {
                        continue;
                    }
                }
                if (hasChildren == false) {
                    System.out.printf("This person has no children!\n==================================\n");
                }
            }
        }
    }
}
