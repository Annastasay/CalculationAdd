package org.example.holidays.feign;

import org.example.holidays.DTO.HolidaysDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "holidays", url = "https://holidays.abstractapi.com")
public interface FeignClientHolidays {
    @GetMapping("/v1/")
    public HolidaysDTO getHolidays(
            @RequestParam String api_key,
            @RequestParam String country,
            @RequestParam String year,
            @RequestParam String month,
            @RequestParam String day
    );
}
