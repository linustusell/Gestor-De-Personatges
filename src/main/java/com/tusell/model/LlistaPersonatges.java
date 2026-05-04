package com.tusell.model;

import java.util.ArrayList;

public class LlistaPersonatges {
    private ArrayList<Personatge> personatges;

    public LlistaPersonatges(){

    }

    public ArrayList<Personatge> getPersonatges() {
        return personatges;
    }
    public void setPersonatges(ArrayList<Personatge> personatges) {
        this.personatges = personatges;
    }
    public void AfegirPersonatge(Personatge p){
        personatges.add(p);
    }
}
