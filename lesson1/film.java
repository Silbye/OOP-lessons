package lesson1;

public class film {
    String name;
    String director;
    String releaseYear;
    String genre;
    String budget;
    String boxOffice;
    String country;
    String studio;

    logic log = new logic();

    film(){
        this.name = log.getName();
        this.releaseYear = log.getYear();
        this.genre = log.getGenre();
        this.budget = log.getBudget();
        this.boxOffice = log.getBox();
        this.country = log.getCountry();
        this.studio = log.getStudio();
        this.director = log.getDirector();
    }

    public String info(){
        StringBuilder sb = new StringBuilder();
        return sb.append(String.format("===============================\nName: %s\nYear: %s\nCountry: %s\nStudio: %s\nGenre: %s\nDirector: %s\nBudget: "+
        "%s$\nBox Office: %s$\n===============================\n", name, releaseYear, country, studio, genre, director, budget, boxOffice)).toString();
    }
}
