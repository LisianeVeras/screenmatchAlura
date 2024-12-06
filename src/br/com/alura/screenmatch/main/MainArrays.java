package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainArrays {
    public static void main(String[] args) {
        Movie myMovie1 = new Movie("Avengers - Endgame", 2019);
        myMovie1.rating(8.3);
        myMovie1.rating(9.5);
        myMovie1.rating(10.0);
        myMovie1.rating(7.1);
        Movie myMovie2 = new Movie("American Beauty", 1999);
        myMovie2.rating(8.0);
        myMovie2.rating(9.1);
        myMovie2.rating(7.0);
        myMovie2.rating(7.1);
        Movie myMovie3 = new Movie("Green Book", 2018);
        myMovie3.rating(8.5);
        myMovie3.rating(9.0);
        myMovie3.rating(10.0);
        myMovie3.rating(8.1);
        Series yellowstone = new Series("Yellowstone", 2018);

        List<Title> watchedList = new ArrayList<>();
        watchedList.add(myMovie1);
        watchedList.add(myMovie2);
        watchedList.add(myMovie3);
        watchedList.add(yellowstone);
        for (Title item:watchedList) {
            System.out.println(item.getName());
            if (item instanceof Movie movie) {
                //Movie movie = (Movie) item;
                System.out.println("Rating: " + movie.rateReviews());
            }

        }

        List<String> searchPerformer = new ArrayList<>();
        searchPerformer.add("Robert Downey Jr");
        searchPerformer.add("Kevin Spacey");
        searchPerformer.add("Mahershala Ali");
        searchPerformer.add("Kelly Reilly");
        System.out.println(searchPerformer);

        Collections.sort(searchPerformer);
        System.out.println("Alphabetical order - Performers");
        System.out.println(searchPerformer);

        System.out.println(watchedList);
        System.out.println("Alphabetical order - Watched Movies");
        Collections.sort(watchedList);
        System.out.println(watchedList);
        watchedList.sort(Comparator.comparing(Title::getYearOfRelease));
        System.out.println("Order by year - Watched Movies");
        System.out.println(watchedList);
    }

}
