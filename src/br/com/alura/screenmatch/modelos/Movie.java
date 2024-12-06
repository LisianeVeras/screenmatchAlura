package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.StarsRating.ReviewStars;

public class Movie extends Title implements ReviewStars {
    private String director;

    public Movie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    //getter and setter
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
//

    @Override
    public void displaysMovieTechnicalSheet() {
        super.displaysMovieTechnicalSheet();
        System.out.println("Director: " + director);
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getYearOfRelease() + ")";
    }
}

