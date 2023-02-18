package com.codecool;

import com.codecool.employees.Helper;
import com.codecool.employees.Organiser;
import com.codecool.exceptions.NotEnoughtHelpersException;
import com.codecool.exceptions.WrongNumberOfChiefOrganiser;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Company {
    private final List<Organiser> organisers = new ArrayList<>();
    private final List<Helper> helpers = new ArrayList<>();

    public void addOrganiser(Organiser organiser) {
        organisers.add(organiser);
    }
    public void addHelper(Helper helper){
        helpers.add(helper);
    }

    public void checkHelpersStatus (List<Helper> helpers) throws NotEnoughtHelpersException {
        if (helpers.size() < 10){
            throw new NotEnoughtHelpersException();
        }
    }

    public void checkOrganisersStatus (List<Organiser> organisers) throws WrongNumberOfChiefOrganiser {
        int chiefOrganiser = 0;
        for(Organiser organiser: organisers){
            if(organiser.getIsChiefOrganiser() == Boolean.TRUE){
                chiefOrganiser++;
            }
        }
        if(chiefOrganiser != 1){
            throw new WrongNumberOfChiefOrganiser();
        }
    }

    public void createCompany() throws WrongNumberOfChiefOrganiser, NotEnoughtHelpersException {
        System.out.println("Start to create company!");
        checkOrganisersStatus(organisers);
        checkHelpersStatus(helpers);
        System.out.println("Company created!");
    }
}
