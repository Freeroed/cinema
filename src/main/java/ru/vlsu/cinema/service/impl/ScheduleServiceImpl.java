package ru.vlsu.cinema.service.impl;

import org.springframework.stereotype.Service;
import ru.vlsu.cinema.data.entity.Film;
import ru.vlsu.cinema.repository.FilmRepository;
import ru.vlsu.cinema.repository.FilmSeanceRepository;
import ru.vlsu.cinema.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final FilmRepository filmRepository;

    private final FilmSeanceRepository filmSeanceRepository;

    public ScheduleServiceImpl(FilmRepository filmRepository, FilmSeanceRepository filmSeanceRepository) {
        this.filmRepository = filmRepository;
        this.filmSeanceRepository = filmSeanceRepository;
    }

    @Override
    public void getSchedule() {
        Iterable<Film> all = filmRepository.findAll();
        int a = 10;

    }
}
