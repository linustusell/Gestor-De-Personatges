package com.tusell;

import com.tusell.model.*;
import com.tusell.model.enums.GenereEnum;
import com.tusell.model.enums.PersonalitatEnum;
import com.tusell.model.enums.SexualitatEnum;
import com.tusell.util.InputUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LlistaPersonatges personatges = new LlistaPersonatges();

        System.out.println("Començarem creant un personatge!");

        System.out.println("Com es dirà aquest personatge?");
        String nom = InputUtils.readNonEmptyLine(sc);

        System.out.println("Perfecte, és HOME o DONA?");
        GenereEnum genere = InputUtils.readGenere(sc);

        System.out.println("Quant medeix en/la " + nom + "? (en cm)");
        int altura = InputUtils.readIntInRange(sc, 1, Integer.MAX_VALUE, "Entrada incorrecta. Escriu un nombre enter positiu (cm).");

        System.out.println("Quant pesa en/la " + nom + "? (en kg)");
        int pes = InputUtils.readIntInRange(sc, 1, Integer.MAX_VALUE, "Entrada incorrecta. Escriu un nombre enter positiu (kg).");

        System.out.println("De quin color és en/la " + nom + "?");
        String color = InputUtils.readNonEmptyLine(sc);

        System.out.println("Quina és la seva sexualitat? (hetero/heterosexual o gay/gey)");
        SexualitatEnum sexualitat = InputUtils.readSexualitat(sc);

        System.out.println("Quina és la seva personalitat? (EXTROVERTIT / INTROVERTIT / ROMANTIC / INDEPENDENT / SERIOS / GELOS)");
        PersonalitatEnum personalitat = InputUtils.readPersonalitat(sc);

        Personatge p = new Personatge(nom, altura, pes, color, sexualitat, personalitat, genere);

        System.out.println("\nPersonatge creat!");
        System.out.println(p.getDetalls());
        personatges.AfegirPersonatge(p);

        CrearPersonatge cp = new CrearPersonatge();
        Events event = new Events();
        ProbabilitatEvents ep = new ProbabilitatEvents();

        boolean obert = true;
        while (obert) {
            System.out.println("1. Fer que dos personatges es coneixin.");
            System.out.println("2. Crear Personatge");
            Personatge pr1 = null;
            Personatge pr2 = null;
            boolean hiHaParella = personatges.getPersonatges().size() >= 2;

            if (hiHaParella) {
                pr1 = personatges.getPersonatgeRandom();
                pr2 = personatges.getPersonatgeRandom();
            }
            int enamorat;
            while (hiHaParella && pr1.equals(pr2)) {
                pr2 = personatges.getPersonatgeRandom();
            }
            switch (InputUtils.readMenuOption(sc, 1, 2)) {
                case 1:
                    System.out.println("Llista de personatges disponibles:");

                    for (int i = 0; i < personatges.getPersonatges().size(); i++) {
                        System.out.println(personatges.getPersonatges().get(i).toString());
                    }


                    System.out.println("Personatge 1(nom): ");
                    String nom1 = InputUtils.readNonEmptyLine(sc);

                    System.out.println("Personatge 2(nom): ");
                    String nom2 = InputUtils.readNonEmptyLine(sc);

                    Personatge p1 = null;
                    Personatge p2 = null;


                    for (Personatge per : personatges.getPersonatges()) {
                        if (per.getNom().equalsIgnoreCase(nom1)) p1 = per;
                        if (per.getNom().equalsIgnoreCase(nom2)) p2 = per;
                    }

                    if (p1 != null && p2 != null) {
                        String resultat = event.Coneixer(p1, p2);
                        System.out.println(resultat);
                    } else {
                        System.out.println("No s'ha trobat algun dels personatges.");
                    }
                    enamorat = hiHaParella ? ep.RondaEvent(pr1, pr2) : 0;
                    if (enamorat > 0) {
                        String nomEnamorat = pr1.getNom();
                        Personatge personatgeEnamorat =  personatges.buscarPersonatge(nomEnamorat);
                        personatgeEnamorat.setEnamorat(pr2);
                        System.out.println("Vols que es declari?");
                    }
                    break;

                case 2:
                    personatges.AfegirPersonatge(cp.Creacio());
                    enamorat = hiHaParella ? ep.RondaEvent(pr1, pr2) : 0;
                    if (enamorat > 0) {
                        String nomEnamorat = pr1.getNom();
                        Personatge personatgeEnamorat =  personatges.buscarPersonatge(nomEnamorat);
                        personatgeEnamorat.setEnamorat(pr2);
                        System.out.println("Vols que es declari?");
                    }
                    break;
            }
        }

    }//aaaa

}