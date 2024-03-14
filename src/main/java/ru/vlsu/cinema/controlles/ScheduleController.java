package ru.vlsu.cinema.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vlsu.cinema.service.ScheduleService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping
    public String getSchedule() {
        scheduleService.getSchedule();
        return "schedule";
    }
}
