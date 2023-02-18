package com.codecool;

import com.codecool.employees.Helper;
import com.codecool.employees.Organiser;
import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Company company = new Company();
        company.addOrganiser(new Organiser("Michał", Boolean.TRUE));
        company.addOrganiser(new Organiser("Dawid", Boolean.FALSE));
        company.addOrganiser(new Organiser("Stefan", Boolean.FALSE));
        company.addHelper(new Helper("Staszek1"));
        company.addHelper(new Helper("Jurek1"));
        company.addHelper(new Helper("Zdzisiek2"));
        company.addHelper(new Helper("Staszek2"));
        company.addHelper(new Helper("Jurek2"));
        company.addHelper(new Helper("Zdzisiek2"));
        company.addHelper(new Helper("Staszek3"));
        company.addHelper(new Helper("Jurek3"));
        company.addHelper(new Helper("Zdzisiek3"));
        company.addHelper(new Helper("Bożydar"));
        company.createCompany();
        System.out.println(company.getHelpers().get(1).getRequestType());

        EventManager eventManager = new EventManager();
        eventManager.createNewEvent();
    }
}