package lesson6;

import java.util.HashMap;

public class Logic {
    JsonParsing parser = new JsonParsing();

    public Student[] createStudentsList() {
        Student firstStudent = new Student("Ivan Ivanov", 5, new int[] { 5, 4, 4 },
                new String[] { "Math", "Russian", "PE" });
        Student secondStudent = new Student("Petr Petrov", 9, new int[] { 4, 3, 4 },
                new String[] { "Math", "Physics", "Chemistry" });
        Student thirdStudent = new Student("Olga Belova", 2, new int[] { 5, 5, 5 },
                new String[] { "Math", "Russian", "English" });
        Student fourthStudent = new Student("Igor Vasilyev", 11, new int[] { 2, 5, 3 },
                new String[] { "Physics", "Chemistry", "English" });
        Student[] students = new Student[] { firstStudent, secondStudent, thirdStudent, fourthStudent };
        System.out.println("Database imported!");
        return students;
    }

    public Scheudule[] createScheudule() {
        Scheudule monday = new Scheudule("Monday",
                new String[] { "8:00 - Math", "10:00 - Russian", "12:00 - Pe", "14:00 - Physics" });
        Scheudule tuesday = new Scheudule("Tuesday",
                new String[] { "8:00 - Math", "10:00 - English", "12:00 - Pe", "14:00 - Chemistry" });
        Scheudule wednesday = new Scheudule("Wednesday",
                new String[] { "8:00 - English", "10:00 - Russian", "12:00 - Chemistry", "14:00 - Physics" });
        Scheudule thursday = new Scheudule("Thursday",
                new String[] { "8:00 - Chemistry", "10:00 - Russian", "12:00 - Pe", "14:00 - Math" });
        Scheudule friday = new Scheudule("Friday",
                new String[] { "8:00 - English", "10:00 - Chemistry", "12:00 - Russian", "14:00 - Physics" });
        Scheudule[] scheudule = new Scheudule[] { monday, tuesday, wednesday, thursday, friday };
        System.out.println("Database imported!");
        return scheudule;
    }

    public void printStudents(Student[] students) {
        if (students.length == 0) {
            System.out.println("Database is empty!");
        }
        for (Student object : students) {
            object.printGrades();
        }
    }

    public void printScheudule(Scheudule[] scheudule) {
        if (scheudule.length == 0) {
            System.out.println("Database is empty!");
        }
        for (Scheudule day : scheudule) {
            day.printScheudule();
        }
    }

    public void saveAll(Student[] students, Scheudule[] scheudule) {
        parser.writeStudents(students);
        parser.writeScheudule(scheudule);
    }

    public HashMap<Student[], Scheudule[]> loadAll() {
        HashMap<Student[], Scheudule[]> data = new HashMap<Student[], Scheudule[]>();
        data.put(parser.readStudents(), parser.readScheudule());
        return data;
    }
}