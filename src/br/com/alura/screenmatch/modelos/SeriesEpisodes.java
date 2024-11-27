package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.StarsRating.ReviewStars;

public class SeriesEpisodes implements ReviewStars {
    private int numberOfEpisodes;
    private String nameOfTheEpisode;
    private Series serie;
    private int totalViews;

    //getters and setters
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getNameOfTheEpisode() {
        return nameOfTheEpisode;
    }

    public void setNameOfTheEpisode(String nameOfTheEpisode) {
        this.nameOfTheEpisode = nameOfTheEpisode;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }
    //

    public void displaysEpisodeTechnicalSheet() {
        System.out.println("Episode Info:");
        System.out.println("Series: " + serie.getName());
        System.out.println("Season: " + serie.getSeasons() + " Seasons");
        System.out.println("Episodes: " + numberOfEpisodes);
        System.out.println("Total Views: " + totalViews);
    }


    @Override
    public double rateReviews() {
        if (totalViews > 500) {
            return 5;
        } else if (totalViews >= 400) {
            return 4;
        } else if (totalViews >=300) {
            return 3;
        } else if (totalViews >= 200) {
            return 2;
        } else {
            return 1;
        }

    }


}