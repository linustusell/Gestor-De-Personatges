package com.tusell.model;

public class ProbabilitatEvents {

    public  ProbabilitatEvents() {
    }


    public int RondaEvent(Personatge p1, Personatge p2) {
        Events event = new Events();
        double probabilitat = Math.random() * 100;

        if (probabilitat < 110){
            event.Enamorar(p1, p2);
            return 1;
        }
        return 0;
    }

}
