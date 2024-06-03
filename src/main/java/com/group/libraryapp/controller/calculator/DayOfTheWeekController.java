package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.response.DayOfTheWeekResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class DayOfTheWeekController {

    @GetMapping("api/v1/day-of-the-week")
    public DayOfTheWeekResponse getDayOfTheWeek(@RequestParam("date") String dateString){
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
        return new DayOfTheWeekResponse(date.getDayOfWeek());
    }
}
