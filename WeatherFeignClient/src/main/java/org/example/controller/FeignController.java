package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.holidays.DTO.HolidaysDTO;
import org.example.holidays.feign.FeignClientHolidays;
import org.example.holidays.starWars.DTO.PersonDTO;
import org.example.holidays.starWars.feign.StarWarsFeignClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feign")
@RequiredArgsConstructor
public class FeignController {
    private final FeignClientHolidays feignClientHolidays;

    private final StarWarsFeignClient starWarsFeignClient;

    @GetMapping("/getHolidays")
    public HolidaysDTO getHolidays(
            @RequestParam String api_key,
            @RequestParam String country,
            @RequestParam String year,
            @RequestParam String month,
            @RequestParam String day
    ) {
        return feignClientHolidays.getHolidays(api_key, country, year, month, day);
    }

    @GetMapping("/getHero")
    public PersonDTO getHero(
            @RequestParam String id
    ){
        return starWarsFeignClient.getPerson(id);
    }
}
