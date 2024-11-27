import br.com.alura.screenmatch.StarsRating.RecommendationFilter;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

public class Main {
    public static void main(String[] args) {
        // Criando o objeto Movie
        Movie myMovie = new Movie();
        myMovie.setName("Avengers - Endgame");
        myMovie.setYearOfRelease(2019);
        myMovie.setMinutesDuration(180);
        myMovie.setDirector("Anthony Russo");

        myMovie.displaysMovieTechnicalSheet();
        myMovie.rating(8.3);
        myMovie.rating(9.0);
        myMovie.rating(10.0);
        myMovie.rating(7.1);

        double averageRating = myMovie.rateReviews();
        System.out.println("Rating: " + String.format("%.1f",averageRating) + " / " + myMovie.getTotalReviews() + " viewers");

        // Filtro de recomendação para o filme
        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        // Criando o objeto Series
        Series yellowstone = new Series();
        yellowstone.setName("Yellowstone");
        yellowstone.setYearOfRelease(2018);
        yellowstone.setSeasons(5);
        yellowstone.setSeasonsEpisodes(10);
        yellowstone.setDurationEpisode(50);

        // Avaliando a série
        yellowstone.rateSeries(8.5);  // Avaliação da série
        yellowstone.rateSeries(7.0);  // Avaliação da série
        yellowstone.rateSeries(9.2);  // Avaliação da série

        // Exibindo as informações da série
        yellowstone.displaysSeriesTechnicalSheet();

        // Filtro de recomendação para o seriado
        filter.filter(yellowstone);
    }
}
