package ru.vlsu.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vlsu.cinema.data.entity.Film;
import ru.vlsu.cinema.data.entity.FilmSeance;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FilmSeanceRepository extends CrudRepository<FilmSeance, Long> {

    List<FilmSeance> findAllByFilmAndDate(Film film, LocalDate date);


}
