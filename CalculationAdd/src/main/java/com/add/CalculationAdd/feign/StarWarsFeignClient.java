package com.add.CalculationAdd.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hero", url = "http://localhost:8080/api/feign")
public interface StarWarsFeignClient {
    @GetMapping("/getHero")
    public PersonDTO getPerson(@RequestParam String id);
}
