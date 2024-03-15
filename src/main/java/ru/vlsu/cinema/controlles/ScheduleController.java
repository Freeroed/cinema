package ru.vlsu.cinema.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vlsu.cinema.data.dto.FilmAndSeanceDto;
import ru.vlsu.cinema.service.ScheduleService;

import java.util.List;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping
    public String getSchedule(Model model) {
        List<FilmAndSeanceDto> filmsAndSeances = scheduleService.getSchedule();
        model.addAttribute("filmsAndSeances", filmsAndSeances);
        return "schedule";
    }
}
