using CodeLogic;
using Parsing;
using Scheudules;
using Students;

namespace Menu
{
    public class MainMenu
    {
        public void mainMenu()
        {
            Logic logic = new Logic();
            JsonParsing parser = new JsonParsing();
            bool flag = true;
            bool modeSelected = false;
            int mode = 0;
            Student[] students = new Student[] { };
            Scheudule[] scheudule = new Scheudule[] { };
            while (flag)
            {
                while (!modeSelected)
                {
                    Console.WriteLine("Mode select: 1 - Student, 2 - Teacher");
                    switch (Console.ReadLine())
                    {
                        case "1":
                            mode = 1;
                            modeSelected = true;
                            break;
                        case "2":
                            mode = 2;
                            modeSelected = true;
                            break;
                        default:
                            Console.WriteLine("Invalid input");
                            break;
                    }
                }
                Console.WriteLine(@"Options: 1 - Load students from built in database (Useful if your json file is empty)
                    2 - Load scheudule from built in database
                    3 - Load students from file
                    4 - Load scheudule from file
                    5 - Print students' grades
                    6 - Print scheudule
                    7 - Export students to file
                    8 - Export scheudule to file
                    0 - Exit");
                switch (Console.ReadLine())
                {
                    case "1":
                        if (mode != 2)
                        {
                            Console.WriteLine("You don't have permissions!");
                        }
                        else
                        {
                            students = logic.createStudentsList();
                        }
                        break;
                    case "2":
                        if (mode != 2)
                        {
                            Console.WriteLine("You don't have permissions!");
                        }
                        else
                        {
                            scheudule = logic.createScheudule();
                        }
                        break;
                    case "3":
                        students = parser.readStudentsFromFile();
                        break;
                    case "4":
                        scheudule = parser.readScheuduleFromFile();
                        break;
                    case "5":
                        logic.printStudents(students);
                        break;
                    case "6":
                        logic.printScheudule(scheudule);
                        break;
                    case "7":
                        if (mode != 2)
                        {
                            Console.WriteLine("You don't have permissions!");
                        }
                        else
                        {
                            parser.writeStudentsToFile(students);
                        }
                        break;
                    case "8":
                        if (mode != 2)
                        {
                            Console.WriteLine("You don't have permissions!");
                        }
                        else
                        {
                            parser.writeScheuduleToFile(scheudule);
                        }
                        break;
                    case "0":
                        Console.WriteLine("Goodbye!");
                        flag = false;
                        break;
                    default:
                        Console.WriteLine("Invalid input");
                        break;
                }
            }
        }
    }
}