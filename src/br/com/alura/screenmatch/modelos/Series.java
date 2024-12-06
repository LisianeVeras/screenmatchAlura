package br.com.alura.screenmatch.modelos;

public class Series extends Title {
    private int seasons;
    private int ativa;
    private int seasonsEpisodes;
    private int durationEpisode;

    private double sumOfSeriesRatings = 0;
    private int totalSeriesReviews = 0;

    public Series(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    // Getters and Setters
    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getAtiva() {
        return ativa;
    }

    public void setAtiva(int ativa) {
        this.ativa = ativa;
    }

    public int getSeasonsEpisodes() {
        return seasonsEpisodes;
    }

    public void setSeasonsEpisodes(int seasonsEpisodes) {
        this.seasonsEpisodes = seasonsEpisodes;
    }

    public int getDurationEpisode() {
        return durationEpisode;
    }

    public void setDurationEpisode(int durationEpisode) {
        this.durationEpisode = durationEpisode;
    }

    public int getBingWatchTime() {
        // Cálculo do tempo total em horas
        return (int) (Math.round(seasons * seasonsEpisodes * durationEpisode) / 60.0);
    }

    public void rateSeries(double rating) {
        sumOfSeriesRatings += rating;
        totalSeriesReviews++;
    }

    @Override
    public double rateReviews() {
        if (totalSeriesReviews == 0) {
            System.out.println("No reviews yet.");
            return 0;
        }
        double average = sumOfSeriesRatings / totalSeriesReviews;
        return average;
    }

    public void displaysSeriesTechnicalSheet() {
        System.out.println("Serie: " + getName());
        System.out.println("Release: " + getYearOfRelease());
        System.out.println("Available: " + isIncludedPlan());
        System.out.println("Seasons: " + getSeasons());
        System.out.println("Episodes duration: " + getDurationEpisode());
        System.out.println("Status: " + getAtiva());
        System.out.println("Binge-watch in " + getBingWatchTime() + " hours.");
        System.out.println("Series Average Rating: " + String.format("%.1f", rateReviews()));  // Formatar com uma casa decimal
    }

    @Override
    public String toString() {
        return "Series: " + this.getName() + " (" + this.getYearOfRelease() + ")";
    }
}


