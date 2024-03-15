package ru.vlsu.cinema.service.impl;

import org.springframework.stereotype.Service;
import ru.vlsu.cinema.data.entity.Film;
import ru.vlsu.cinema.repository.FilmRepository;
import ru.vlsu.cinema.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public Film findById(Long id) {
        return filmRepository.findById(id).orElseThrow();
    }
}
