package com.add.CalculationAdd.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hero", url = "/api/feign")
public interface StarWarsFeignClient {
    @GetMapping("/getHero")
    public PersonDTO getPerson(@RequestParam String id);
}
