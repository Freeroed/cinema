package ru.vlsu.cinema.service;

import ru.vlsu.cinema.data.dto.FilmAndSeanceDto;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleService {

    List<FilmAndSeanceDto> getSchedule();

    List<FilmAndSeanceDto> getSchedule(LocalDate date);
}
