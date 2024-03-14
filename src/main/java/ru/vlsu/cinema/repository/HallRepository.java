package ru.vlsu.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vlsu.cinema.data.entity.Hall;

@Repository
public interface HallRepository extends CrudRepository<Hall, Long> {
}
