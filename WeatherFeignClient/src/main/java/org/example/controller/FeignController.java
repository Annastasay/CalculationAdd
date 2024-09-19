package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.starWars.DTO.PersonDTO;
import org.example.starWars.feign.StarWarsFeignClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feign")
@RequiredArgsConstructor
public class FeignController {

    private final StarWarsFeignClient starWarsFeignClient;

    @GetMapping("/getHero")
    public PersonDTO getHero(
            @RequestParam String id
    ){
        return starWarsFeignClient.getPerson(id);
    }
}
