package com.tusell.model;

import com.tusell.model.enums.PersonalitatEnum;

public class Events {


    public String Coneixer(Personatge p1, Personatge p2) {
        System.out.println(p1 + " coneix a " + p2);
        PersonalitatEnum a = p1.getPersonalitat();
        PersonalitatEnum b = p2.getPersonalitat();
        if (a == PersonalitatEnum.INTROVERTIT && b == PersonalitatEnum.INTROVERTIT ) {
            return "No es cauen malament, però tampoc parlen molt.";
        }
        if (a == PersonalitatEnum.INTROVERTIT && b == PersonalitatEnum.EXTROVERTIT ) {
            return "Es porten bé, es complementen un amb l'altre";
        }
        if(a == PersonalitatEnum.INDEPENDENT || b == PersonalitatEnum.INDEPENDENT ) {
            return "No es cauen malament n'hi bé, simplement no interactuen";
        }
        if( a == PersonalitatEnum.ROMANTIC || a == PersonalitatEnum.EXTROVERTIT  && (b == PersonalitatEnum.SERIOS)) {
            return "No es porten gaire be!";
        }

        return "";
    }
}
