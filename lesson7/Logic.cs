using Students;
using Scheudules;
using Parsing;

namespace CodeLogic
{
    public class Logic
    {
        JsonParsing parser = new JsonParsing();
        public Student[] createStudentsList()
        {
            Student firstStudent = new Student("Ivan Ivanov", 5, new int[] { 5, 4, 4 },
                        new String[] { "Math", "Russian", "PE" });
            Student secondStudent = new Student("Petr Petrov", 9, new int[] { 4, 3, 4 },
                    new String[] { "Math", "Physics", "Chemistry" });
            Student thirdStudent = new Student("Olga Belova", 2, new int[] { 5, 5, 5 },
                    new String[] { "Math", "Russian", "English" });
            Student fourthStudent = new Student("Igor Vasilyev", 11, new int[] { 2, 5, 3 },
                    new String[] { "Physics", "Chemistry", "English" });
            Student[] students = new Student[] { firstStudent, secondStudent, thirdStudent, fourthStudent };
            Console.WriteLine("Database loaded!");
            return students;
        }
        public Scheudule[] createScheudule()
        {
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
            Console.WriteLine("Database loaded!");
            return scheudule;
        }
        public void printStudents(Student[] students)
        {
            if (students.Length == 0)
            {
                Console.WriteLine("Database is empty!");
            }
            else
            {
                foreach (Student student in students)
                {
                    student.printGrades();
                }
            }
        }
        public void printScheudule(Scheudule[] scheudule)
        {
            if (scheudule.Length == 0)
            {
                Console.WriteLine("Database is empty!");
            }
            else
            {
                foreach (Scheudule day in scheudule)
                {
                    day.printScheudule();
                }
            }
        }
    }
}