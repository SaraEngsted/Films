package com.example.moviesapp.Services;

import com.example.moviesapp.Reposetories.ReadListOfMovies;
import com.example.moviesapp.models.Films;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FilmService {

    ReadListOfMovies filmsList = new ReadListOfMovies();

    static Random random = new Random();

    public String getFirst() {

        ArrayList<Films> listOfMovies = filmsList.getListOfFilms();

        return listOfMovies.get(0).getTitle();
    }

    public String getRandomMovie() {

        ArrayList<Films> listOfMovies = filmsList.getListOfFilms();

        return listOfMovies.get(random.nextInt(listOfMovies.size())).getTitle();
    }

    public String getTenSortByPopularity() {
        ArrayList<Films> listOfMovies = filmsList.getListOfFilms();

        ArrayList<Films> popularityOfMovies = new ArrayList<Films>();



        for (int i = 0; i < 10; i++) {
            Films tenFilms = listOfMovies.get(random.nextInt(listOfMovies.size()));
            popularityOfMovies.add(tenFilms);
        }

        Collections.sort(popularityOfMovies);

        return popularityOfMovies.toString();
    }

    public String howManyWonAnAward() {

        ArrayList<Films> listOfMovies = filmsList.getListOfFilms();

        int counter = 0;

        for (int i = 0; i < listOfMovies.size(); i++) {
            if (!listOfMovies.get(i).getAwards()) {
                counter = counter + 1;
                i++;
            }
        }
        return String.valueOf(counter);
    }

}
