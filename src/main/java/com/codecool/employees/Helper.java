package com.codecool.employees;

import com.codecool.events.RequestTypes;
import lombok.Getter;

@Getter
public class Helper extends Employee{
    private RequestTypes requestType;
    public Helper(String name) {
        super(name);
        requestType = RequestTypes.randomRequestType();
    }
}
