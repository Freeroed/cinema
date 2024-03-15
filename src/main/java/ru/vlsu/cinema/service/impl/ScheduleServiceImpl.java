package ru.vlsu.cinema.service.impl;

import org.springframework.stereotype.Service;
import ru.vlsu.cinema.data.dto.FilmAndSeanceDto;
import ru.vlsu.cinema.data.entity.Film;
import ru.vlsu.cinema.repository.FilmRepository;
import ru.vlsu.cinema.repository.FilmSeanceRepository;
import ru.vlsu.cinema.service.ScheduleService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final FilmRepository filmRepository;

    private final FilmSeanceRepository filmSeanceRepository;

    public ScheduleServiceImpl(FilmRepository filmRepository, FilmSeanceRepository filmSeanceRepository) {
        this.filmRepository = filmRepository;
        this.filmSeanceRepository = filmSeanceRepository;
    }

    @Override
    public List<FilmAndSeanceDto> getSchedule() {

        return getSchedule(LocalDate.now());
    }

    @Override
    public List<FilmAndSeanceDto> getSchedule(LocalDate date) {
        List<Film> filmsForDate = filmRepository.getFilmsForDate(date);
        List<FilmAndSeanceDto> result = new ArrayList<>();
        for (Film film: filmsForDate) {
            result.add(new FilmAndSeanceDto(
                    film,
                    filmSeanceRepository.findAllByFilmAndDate(film, date)
            ));
        }
        return result;
    }
}
