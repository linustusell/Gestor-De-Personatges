package com.tusell.model;

import java.util.ArrayList;

public class LlistaPersonatges {
    private ArrayList<Personatge> personatges = new ArrayList<>();

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

    public int  mida(){
        return personatges.size();
    }

    public Personatge getPersonatgeRandom(){
        return  personatges.get((int)(Math.random()*(personatges.size())));
    }

    public Personatge buscarPersonatge(String nom){
        for(Personatge p : personatges){
            if(p.getNom().equals(nom)){
                return p;
            }
        }
        return null;
    }
}