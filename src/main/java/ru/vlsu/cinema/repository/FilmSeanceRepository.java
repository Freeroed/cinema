package ru.vlsu.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vlsu.cinema.data.entity.FilmSeance;

@Repository
public interface FilmSeanceRepository extends CrudRepository<FilmSeance, Long> {
}
