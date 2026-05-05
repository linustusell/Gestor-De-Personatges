package com.tusell.model;

import com.tusell.model.enums.PersonalitatEnum;

public class Events {

    public String Coneixer(Personatge p1, Personatge p2) {
        System.out.println(p1 + " coneix a " + p2);
        PersonalitatEnum a = p1.getPersonalitat();
        PersonalitatEnum b = p2.getPersonalitat();

        if (a == PersonalitatEnum.INDEPENDENT || b == PersonalitatEnum.INDEPENDENT)
            return "No es cauen malament ni bé — simplement no interactuen.";

        if (a == PersonalitatEnum.GELOS && b == PersonalitatEnum.GELOS)
            return "Es vigilen mútuament des del primer moment — clima de rivalitat.";

        if (a == PersonalitatEnum.INTROVERTIT && b == PersonalitatEnum.INTROVERTIT)
            return "No es cauen malament, però tampoc parlen molt.";

        if ((a == PersonalitatEnum.INTROVERTIT && b == PersonalitatEnum.EXTROVERTIT) ||
                (a == PersonalitatEnum.EXTROVERTIT && b == PersonalitatEnum.INTROVERTIT))
            return "Es porten bé, es complementen l'un amb l'altre.";

        if ((a == PersonalitatEnum.INTROVERTIT && b == PersonalitatEnum.ROMANTIC) ||
                (a == PersonalitatEnum.ROMANTIC && b == PersonalitatEnum.INTROVERTIT))
            return "L'introvertit se sent aclaparat però no respon malament.";

        if ((a == PersonalitatEnum.INTROVERTIT && b == PersonalitatEnum.SERIOS) ||
                (a == PersonalitatEnum.SERIOS && b == PersonalitatEnum.INTROVERTIT))
            return "Es respecten en silenci, poca interacció.";

        if ((a == PersonalitatEnum.INTROVERTIT && b == PersonalitatEnum.GELOS) ||
                (a == PersonalitatEnum.GELOS && b == PersonalitatEnum.INTROVERTIT))
            return "El gelós desconfia sense motiu — tensió freda.";

        if (a == PersonalitatEnum.EXTROVERTIT && b == PersonalitatEnum.EXTROVERTIT)
            return "Connexió immediata — molta energia entre ells.";

        if ((a == PersonalitatEnum.EXTROVERTIT && b == PersonalitatEnum.ROMANTIC) ||
                (a == PersonalitatEnum.ROMANTIC && b == PersonalitatEnum.EXTROVERTIT))
            return "No es porten gaire bé — el romàntic s'enganxa massa aviat.";

        if ((a == PersonalitatEnum.EXTROVERTIT && b == PersonalitatEnum.SERIOS) ||
                (a == PersonalitatEnum.SERIOS && b == PersonalitatEnum.EXTROVERTIT))
            return "No es porten gaire bé — el seriós troba l'extrovertit superficial.";

        if ((a == PersonalitatEnum.EXTROVERTIT && b == PersonalitatEnum.GELOS) ||
                (a == PersonalitatEnum.GELOS && b == PersonalitatEnum.EXTROVERTIT))
            return "El gelós desconfia de tanta simpatia — tensió immediata.";

        if (a == PersonalitatEnum.ROMANTIC && b == PersonalitatEnum.ROMANTIC)
            return "S'encanten mútuament des del primer moment.";

        if ((a == PersonalitatEnum.ROMANTIC && b == PersonalitatEnum.SERIOS) ||
                (a == PersonalitatEnum.SERIOS && b == PersonalitatEnum.ROMANTIC))
            return "No es porten gaire bé — visions del món oposades.";

        if ((a == PersonalitatEnum.ROMANTIC && b == PersonalitatEnum.GELOS) ||
                (a == PersonalitatEnum.GELOS && b == PersonalitatEnum.ROMANTIC))
            return "El gelós s'obsessiona ràpid — el romàntic es confon.";

        if (a == PersonalitatEnum.SERIOS && b == PersonalitatEnum.SERIOS)
            return "Es respecten, poden col·laborar bé si cal.";

        if ((a == PersonalitatEnum.SERIOS && b == PersonalitatEnum.GELOS) ||
                (a == PersonalitatEnum.GELOS && b == PersonalitatEnum.SERIOS))
            return "El seriós no entén la gelosia — ambient tens.";

        return "";
    }

    public String Enamorar(Personatge p1, Personatge p2) {
        System.out.println(p1 + " s'enamora de " + p2);

        return "";
    }

    public String Rebutjar(Personatge p1, Personatge p2) {
        System.out.println(p1 + " rebutja a " + p2);
        PersonalitatEnum a = p1.getPersonalitat();
        PersonalitatEnum b = p2.getPersonalitat();

        if (b == PersonalitatEnum.INDEPENDENT)
            return "L'independent ho encaixa bé — continua amb la seva vida.";

        if (b == PersonalitatEnum.GELOS)
            return "El gelós no accepta el rebuig bé — pot tornar-se obsessiu.";

        if (b == PersonalitatEnum.ROMANTIC)
            return "El romàntic sofreix molt — triga molt a superar-ho.";

        if (b == PersonalitatEnum.INTROVERTIT)
            return "L'introvertit s'ho empasssa en silenci — no ho exterioritza.";

        if (a == PersonalitatEnum.GELOS && b == PersonalitatEnum.GELOS)
            return "Cap dels dos accepta la derrota — risc de conflicte prolongat.";

        if (a == PersonalitatEnum.INDEPENDENT)
            return "L'independent ho comunica sense emocions — directe i tancat.";

        if (a == PersonalitatEnum.ROMANTIC)
            return "El romàntic ho passa molt malament rebutjant — intenta evitar-ho.";

        if (a == PersonalitatEnum.SERIOS)
            return "El seriós talla sense miraments — fred i directe.";

        if (a == PersonalitatEnum.EXTROVERTIT)
            return "L'extrovertit ho diu clar i sense voltes.";

        return "El rebuig és mutu i tranquil.";
    }
}