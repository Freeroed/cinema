package ru.vlsu.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vlsu.cinema.data.entity.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
}
