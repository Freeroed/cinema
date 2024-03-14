package ru.vlsu.cinema.controlles;

import org.springframework.stereotype.Controller;

@Controller("schedule")
public class ScheduleController {

    public String getSchedule() {
        return "schedule";
    }
}
