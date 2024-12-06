package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.StarsRating.RecommendationFilter;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando o objeto Movie
        //1
        Movie myMovie1 = new Movie("Avengers - Endgame", 2019);
        //myMovie1.setName("Avengers - Endgame"); retirado devido o uso do construtor
        //myMovie1.setYearOfRelease(2019); retirado devido o uso do construtor
        myMovie1.setMinutesDuration(180);
        myMovie1.setDirector("Anthony Russo");

        myMovie1.displaysMovieTechnicalSheet();
        myMovie1.rating(8.3);
        myMovie1.rating(9.5);
        myMovie1.rating(10.0);
        myMovie1.rating(7.1);

        double averageRating = myMovie1.rateReviews();
        System.out.println("Rating: " + String.format("%.1f",averageRating) + " / " + myMovie1.getTotalReviews() + " viewers");

        // Filtro de recomendação para o filme
        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie1);

        //2
        Movie myMovie2 = new Movie("American Beauty", 1999);
        //myMovie2.setName("American Beauty");
        //myMovie2.setYearOfRelease(1999);
        myMovie2.setMinutesDuration(122);
        myMovie2.setDirector("Sam Mendes");

        myMovie2.displaysMovieTechnicalSheet();
        myMovie2.rating(8.0);
        myMovie2.rating(9.1);
        myMovie2.rating(7.0);
        myMovie2.rating(7.1);

        averageRating = myMovie2.rateReviews();
        System.out.println("Rating: " + String.format("%.1f", averageRating) + " / " + myMovie2.getTotalReviews() + " viewers");

        filter = new RecommendationFilter();
        filter.filter(myMovie2);

        //3
        Movie myMovie3 = new Movie("Green Book", 2018);
        //myMovie3.setName("Green Book");
        //myMovie3.setYearOfRelease(2018);
        myMovie3.setMinutesDuration(130);
        myMovie3.setDirector("Peter Farrelly");

        myMovie3.displaysMovieTechnicalSheet();
        myMovie3.rating(8.5);
        myMovie3.rating(9.0);
        myMovie3.rating(10.0);
        myMovie3.rating(8.1);

        averageRating = myMovie3.rateReviews();
        System.out.println("Rating: " + String.format("%.2f",averageRating) + " / " + myMovie3.getTotalReviews() + " viewers");


        filter = new RecommendationFilter();
        filter.filter(myMovie3);

        // Criando o objeto Series
        Series yellowstone = new Series("Yellowstone", 2018);
        //yellowstone.setName("Yellowstone");
        //yellowstone.setYearOfRelease(2018);
        yellowstone.setSeasons(5);
        yellowstone.setSeasonsEpisodes(10);
        yellowstone.setDurationEpisode(50);

        yellowstone.displaysSeriesTechnicalSheet();

        // Avaliando a série
        yellowstone.rateSeries(8.5);
        yellowstone.rateSeries(7.0);
        yellowstone.rateSeries(9.2);


        // Filtro de recomendação para o seriado
        filter.filter(yellowstone);

        // Criando lista de filmes

        ArrayList <Movie> moviesList = new ArrayList<>();
        moviesList.add(myMovie1);
        moviesList.add(myMovie2);
        moviesList.add(myMovie3);
        System.out.println("List size: " + moviesList.size());
        System.out.println("3rd movie: " + moviesList.get(2).getName());
        System.out.println("Movie toString: " + moviesList.get(0).toString());
        System.out.println(moviesList);

        ArrayList <Series> seriesList = new ArrayList<>();
        seriesList.add(yellowstone);
        System.out.println("List size: " + seriesList.size());
        System.out.println("Series toString: " + seriesList.get(0).toString());
    }
}
