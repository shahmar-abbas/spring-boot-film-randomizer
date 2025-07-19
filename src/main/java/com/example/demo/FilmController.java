package com.example.demo;

import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

    private final List<Film> film = List.of(
            new Film("Inception", "A dream within a dream!"),
            new Film("Matrix", "A choice between reality and illusion... \n A secret struggle begins for humanity."),
            new Film("Forrest Gump", "Life is like a box of chocolates."),
            new Film("The Godfather", "Family, power, and betrayal..."));

    private final Random random = new Random();

    @GetMapping("/film/random")
    public Film randomFilm() {
        return film.get(random.nextInt(film.size()));
    }
}
