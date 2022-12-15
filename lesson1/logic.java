package lesson1;

import java.util.Random;
import java.util.Scanner;

public class logic {
    Random rand = new Random();

    public String getName(){
        String[] names = new String[]{"Back to the Future", "The Green Mile", "Schindler's List", "The Shawshank Redemption",
        "Forrest Gump", "The Lord of the Rings: The Return of the King", "Coco", "Interstellar", "Pulp Fiction", "The Lion King", "The Dark Knight",
        "Fight Club", "Sen to Chihiro no kamikakushi", "Gladiator", "Sherlock Holmes"};
        return names[rand.nextInt(names.length)];
    }

    public String getCountry(){
        String[] countries = new String[]{"USA", "Canada", "Spain", "Russia", "Soviet Union", "France", "Great Britain", "Germany", "Italy",
        "Mexico", "Ukraine", "Belarus", "Poland", "Japan"};
        return countries[rand.nextInt(countries.length)];
    }

    public String getStudio(){
        String[] companies = new String[]{"Universal Pictures", "Paramount Pictures", "Warner Bros. Pictures", "New Line Cinema", "Walt Disney Pictures",
        "20 Century Studios", "Columbia Pictures", "TriStar Pictures", "Lionsgate Films", "Metro-Goldwyn-Mayer Pictures", "Amblin Entertainment", "DreamWorks Pictures"};
        return companies[rand.nextInt(companies.length)];
    }

    public String getGenre(){
        String[] genres = new String[]{"Action", "Adventure", "Comedy", "Drama", "Fantasy", "Horror", "Musical", "Mystery", "Sci-fi", "Sports", "Western"};
        return genres[rand.nextInt(genres.length)];
    }

    public String getDirector(){
        String[] directors = new String[]{"Steven Spielberg", "Frank Darabont", "Robert Zemeckis", "Peter Jackson", "Christopher Nolan", "Igor Maslennikov",
        "Quentin Tarantino", "Roger Allers", "Hayao Miyazaki", "Ridley Scott"};
        return directors[rand.nextInt(directors.length)];
    }

    public String getYear(){
        String releaseYear = Integer.toString(rand.nextInt(1930, 2023));
        return releaseYear;
    }

    public String getBudget(){
        String budget = Long.toString(rand.nextLong(10000, 200000000));
        return budget;
    }

    public String getBox(){
        String boxOffice = Long.toString(rand.nextLong(10000, 2000000000));
        return boxOffice;
    }

    public film[] CreateFilmsList(){
        film firstFilm = new film();
        film secondFilm = new film();
        film thirdFilm = new film();
        film fourthFilm = new film();
        film fifthFilm = new film();
        film sixthFilm = new film();
        film seventhFilm = new film();

        film[] films = new film[]{firstFilm, secondFilm, thirdFilm, fourthFilm, fifthFilm, sixthFilm, seventhFilm};
        return films;
    }

    public void findByName(film[] films){
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        System.out.print("Enter part of film's name: ");
        String entered = scanner.nextLine();
        for(film objectFilm: films){
            if(objectFilm.name.contains(entered)){
                System.out.print(objectFilm.info());
                found = true;
            }
        }
        if(found == false){
            System.out.println("No films found by your entered name!");
        }
    }

}
