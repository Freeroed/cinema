package ru.vlsu.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vlsu.cinema.data.entity.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {
}
