namespace Scheudules
{
    public class Scheudule
    {
        [Newtonsoft.Json.JsonProperty("day")]
        private string day { get; set; }
        [Newtonsoft.Json.JsonProperty("subjects")]
        private string[] subjects { get; set; }
        public Scheudule(string day, string[] subjects)
        {
            this.day = day;
            this.subjects = subjects;
        }

        public void printScheudule()
        {
            Console.WriteLine($"Scheudule for {day}: {string.Join(", ", subjects)}");
        }
    }
}