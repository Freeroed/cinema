package ru.vlsu.cinema.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.vlsu.cinema.data.entity.Film;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {

    @Query("select f from Film f where (select count(fs) from FilmSeance fs where fs.film.id = f.id and fs.date = :date) > 0")
    List<Film> getFilmsForDate(@Param("date") LocalDate date);
}
