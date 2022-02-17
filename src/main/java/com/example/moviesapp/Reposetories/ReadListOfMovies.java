package com.example.moviesapp.Reposetories;

import com.example.moviesapp.models.Films;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadListOfMovies {

    public ArrayList<Films> getListOfFilms() {
        ArrayList<Films> listOfFilms = new ArrayList<Films>();

        FileReader readFilms;

        {
            try {
                readFilms = new FileReader("src/main/resources/movies.csv");
                Scanner scanner = new Scanner(readFilms);

                while (scanner.hasNext()) {
                    String filmDetails = scanner.nextLine();
                    String[] details = filmDetails.split(";");
                    int year = Integer.parseInt(details[0]);
                    int length = Integer.parseInt(details[1]);
                    String title = details[2];
                    String subject = details[3];
                    int popularity = Integer.parseInt(details[4]);
                    String awards = details[5];

                    Films filmClass = new Films(year, length, title, subject, popularity, awards);

                    listOfFilms.add(filmClass);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        return listOfFilms;
    }


}
