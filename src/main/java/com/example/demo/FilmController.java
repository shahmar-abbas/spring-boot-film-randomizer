package com.example.demo;

import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

    private final List<Film> film = List.of(
            new Film("Inception", "Yuxu içində yuxu!"),
            new Film("Matrix", "Reallıq və illüziya arasında seçim... \n İnsanlıq üçün gizli bir mübarizə başlayır."),
            new Film("Forrest Gump", "Həyat bir qutu şokolad kimidir."),
            new Film("The Godfather", "Ailə, güc və xəyanət...")
    );
    private final Random random = new Random();

    @GetMapping("/film/random")
    public Film randomFilm() {
        return film.get(random.nextInt(film.size()));
    }
}
