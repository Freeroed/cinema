package ru.vlsu.cinema.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vlsu.cinema.service.FilmService;

@Controller
@RequestMapping("/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/{id}")
    public String getFilmById(@PathVariable Long id, Model model) {
        model.addAttribute("film", filmService.findById(id));
        return "film";

    }
}
