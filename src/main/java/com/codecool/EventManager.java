package com.codecool;

import com.codecool.events.Event;

import java.util.ArrayList;
import java.util.List;


public class EventManager {
    private final List<Event> events = new ArrayList<>();

    public void createNewEvent(){
        System.out.println("Organizujemy imprezę!!");
    }
}
