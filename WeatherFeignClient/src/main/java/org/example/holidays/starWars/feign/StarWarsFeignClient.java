package org.example.holidays.starWars.feign;

import org.example.holidays.starWars.DTO.PersonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "hero", url = "https://swapi.dev/api")
public interface StarWarsFeignClient {
    @GetMapping("/people/{id}")
    public PersonDTO getPerson(@PathVariable String id);
}
