package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.starWars.DTO.PersonDTO;
import org.example.starWars.feign.StarWarsFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/feign")
@RequiredArgsConstructor
public class StarWarsController {
    private final StarWarsFeignClient starWarsFeignClient;

    @GetMapping("/getHero")
    public PersonDTO getHero(
            @RequestParam String id
    ) {
        return starWarsFeignClient.getPerson(id);
    }
}
