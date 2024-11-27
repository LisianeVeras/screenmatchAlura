package br.com.alura.screenmatch.StarsRating;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

public class RecommendationFilter {
    private String Recommendation;

    public void filter(Movie movie) {
        double rating = movie.rateReviews();

        if (rating >= 8.0) {
            System.out.println("Highly recommended!");
        } else {
            System.out.println("Give it a try!");
        }
    }

    public void filter(Series series) {

            double averageRating = series.rateReviews();  // Média de avaliações da série
            int bingWatchTime = series.getBingWatchTime();  // Tempo total para maratonar a série

            // Recomendação classificatória
            if (averageRating >= 8.0) {
                System.out.println("Highly recommended series!");
            } else {
                System.out.println("Give this series a try!");
            }

            // Recomendação de maratona
            if (bingWatchTime >= 10) {
                System.out.println("Perfect for binge-watching!");
            } else {
                System.out.println("Good for casual watching!");
            }

    }
}
