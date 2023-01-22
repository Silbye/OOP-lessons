using Newtonsoft.Json;
using Students;
using Scheudules;

namespace Parsing
{
    public class JsonParsing
    {
        public void writeStudentsToFile(Student[] students)
        {
            if (students.Length == 0)
            {
                Console.WriteLine("Database is empty!");
            }
            else
            {
                var json = JsonConvert.SerializeObject(students);
                var filePath = Path.Combine(Environment.CurrentDirectory, "students.json");
                File.WriteAllText(filePath, json);
                Console.WriteLine("Database exported!!");
            }
        }
        public void writeScheuduleToFile(Scheudule[] scheudule)
        {
            if (scheudule.Length == 0)
            {
                Console.WriteLine("Database is empty!");
            }
            else
            {
                var json = JsonConvert.SerializeObject(scheudule);
                var filePath = Path.Combine(Environment.CurrentDirectory, "scheudule.json");
                File.WriteAllText(filePath, json);
                Console.WriteLine("Database exported!!");
            }
        }
        public Student[] readStudentsFromFile()
        {
            var filePath = Path.Combine(Environment.CurrentDirectory, "students.json");
            Student[] students = new Student[] { };
            if (new FileInfo(filePath).Length == 0)
            {
                Console.WriteLine("File is empty!");
            }
            else
            {
                students = JsonConvert.DeserializeObject<Student[]>(File.ReadAllText(filePath));
                Console.WriteLine("Database loaded!");
            }
            return students;
        }
        public Scheudule[] readScheuduleFromFile()
        {
            var filePath = Path.Combine(Environment.CurrentDirectory, "scheudule.json");
            Scheudule[] scheudule = new Scheudule[] { };
            if (new FileInfo(filePath).Length == 0)
            {
                Console.WriteLine("File is empty!");
            }
            else
            {
                scheudule = JsonConvert.DeserializeObject<Scheudule[]>(File.ReadAllText(filePath));
                Console.WriteLine("Database loaded!");
            }
            return scheudule;
        }
    }
}