package com.codecool.employees;

import lombok.Getter;

public class Organiser extends Employee {
    @Getter
    private Boolean isChiefOrganiser;

    public Organiser(String name, Boolean isChiefOrganiser) {
        super(name);
        this.isChiefOrganiser = isChiefOrganiser;
    }
}

