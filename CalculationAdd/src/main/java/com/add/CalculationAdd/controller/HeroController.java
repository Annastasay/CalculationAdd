package com.add.CalculationAdd.controller;


import com.add.CalculationAdd.feign.PersonDTO;
import com.add.CalculationAdd.feign.StarWarsFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hero")
@RequiredArgsConstructor
public class HeroController {
    private final StarWarsFeignClient starWarsFeignClient;

    @GetMapping("/getHero")
    public PersonDTO getHero(@RequestParam String id){
        return starWarsFeignClient.getPerson(id);
    }
}
