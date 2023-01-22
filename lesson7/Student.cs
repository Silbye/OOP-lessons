using Newtonsoft;

namespace Students
{
    public class Student
    {
        [Newtonsoft.Json.JsonProperty("fullName")]
        private string fullName { get; set; }
        [Newtonsoft.Json.JsonProperty("grade")]
        private int grade { get; set; }
        [Newtonsoft.Json.JsonProperty("grades")]
        private int[] grades { get; set; }
        [Newtonsoft.Json.JsonProperty("subjects")]
        private string[] subjects { get; set; }
        public Student(string fullName, int grade, int[] grades, string[] subjects)
        {
            this.fullName = fullName;
            this.grade = grade;
            this.grades = grades;
            this.subjects = subjects;
        }

        public void printGrades()
        {
            for (int i = 0; i < grades.Length && i < subjects.Length; i++)
            {
                Console.WriteLine($"Student {fullName} from grade {grade} got {grades[i]} on subject {subjects[i]}");
            }
        }
    }
}
