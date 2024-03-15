package ru.vlsu.cinema.service;

import ru.vlsu.cinema.data.entity.Film;

public interface FilmService {

    Film findById(Long id);
}
