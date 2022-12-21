package lesson1;

public class Film {
    String name;
    String director;
    String releaseYear;
    String genre;
    String budget;
    String boxOffice;
    String country;
    String studio;

    Logic logic = new Logic();

    Film() {
        this.name = logic.getName();
        this.releaseYear = logic.getYear();
        this.genre = logic.getGenre();
        this.budget = logic.getBudget();
        this.boxOffice = logic.getBox();
        this.country = logic.getCountry();
        this.studio = logic.getStudio();
        this.director = logic.getDirector();
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        return sb.append(String.format(
                "===============================\nName: %s\nYear: %s\nCountry: %s\nStudio: %s\nGenre: %s\nDirector: %s\nBudget: "
                        +
                        "%s$\nBox Office: %s$\n===============================\n",
                name, releaseYear, country, studio, genre, director, budget, boxOffice)).toString();
    }
}
