package com.add.CalculationAdd.test;

import lombok.Data;

@Data
public class SimpleDestination {
    private String name;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
