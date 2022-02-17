package com.example.moviesapp.controllers;

import com.example.moviesapp.MoviesAppApplication;
import com.example.moviesapp.Services.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class indexController {

    FilmService filmService = new FilmService();

    @GetMapping("/")
    public String welcomeUser(){

        return "Welcome MovieLover <333";
    }

    @GetMapping("/getFirst")
    public String filmNr1() {

        return filmService.getFirst();
    }

    @GetMapping("/getRandom")
    public String randomFilm() {

        return filmService.getRandomMovie();
    }

    @GetMapping("/getTenSortByPopularity")
    public String tenSortByPopularity() {

        return filmService.getTenSortByPopularity();
    }

    @GetMapping("/howManyWonAnAward")
    public String howManyWonAnAward() {

        return filmService.howManyWonAnAward();
    }
}
