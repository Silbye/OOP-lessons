package lesson3;

public class Logic {
    public void program() {
        JsonParsing parser = new JsonParsing();
        Student[] students = parser.parseJson();
        for (Student object : students) {
            System.out.printf("Student %s got %d on subject %s\n", object.getSurname(), object.getGrade(),
                    object.getSubject());
        }
    }
}
