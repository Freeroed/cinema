package ru.vlsu.cinema.data.dto;

import ru.vlsu.cinema.data.entity.Film;
import ru.vlsu.cinema.data.entity.FilmSeance;

import java.util.List;

public class FilmAndSeanceDto {

    private Film film;

    private List<FilmSeance> seances;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public List<FilmSeance> getSeances() {
        return seances;
    }

    public void setSeances(List<FilmSeance> seances) {
        this.seances = seances;
    }

    public FilmAndSeanceDto(Film film, List<FilmSeance> seances) {
        this.film = film;
        this.seances = seances;
    }

    public FilmAndSeanceDto() {
    }
}
