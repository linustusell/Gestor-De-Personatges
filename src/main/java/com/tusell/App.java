package com.tusell;

import com.tusell.model.CrearPersonatge;
import com.tusell.model.Events;
import com.tusell.model.LlistaPersonatges;
import com.tusell.model.Personatge;
import com.tusell.model.enums.GenereEnum;
import com.tusell.model.enums.PersonalitatEnum;
import com.tusell.model.enums.SexualitatEnum;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LlistaPersonatges personatges = new LlistaPersonatges();

        System.out.println("Començarem creant un personatge!");

        System.out.println("Com es dirà aquest personatge?");
        String nom = sc.nextLine();

        System.out.println("Perfecte, és HOME o DONA?");
        GenereEnum genere = GenereEnum.valueOf(sc.nextLine().toLowerCase());

        System.out.println("Quant medeix en/la " + nom + "? (en cm)");
        int altura = Integer.parseInt(sc.nextLine());

        System.out.println("Quant pesa en/la " + nom + "? (en kg)");
        int pes = Integer.parseInt(sc.nextLine());

        System.out.println("De quin color és en/la " + nom + "?");
        String color = sc.nextLine();

        System.out.println("Quina és la seva sexualitat? (HETEROSEXUAL / GEY)");
        SexualitatEnum sexualitat = SexualitatEnum.valueOf(sc.nextLine().toLowerCase());

        System.out.println("Quina és la seva personalitat? (EXTROVERTIT / INTROVERTIT / ROMANTIC / INDEPENDENT / SERIOS / GELOS)");
        PersonalitatEnum personalitat = PersonalitatEnum.valueOf(sc.nextLine().toUpperCase());

        Personatge p = new Personatge(nom, altura, pes, color, sexualitat, personalitat, genere);

        System.out.println("\nPersonatge creat!");
        System.out.println(p.getDetalls());
        personatges.AfegirPersonatge(p);

        CrearPersonatge cp = new CrearPersonatge();
        Events event = new Events();

        boolean obert = true;
        while (obert) {
            System.out.println("1. Fer que dos personatges es coneixin.");
            System.out.println("2. Crear Personatge");
            switch (sc.nextInt()) {
                case 1:
                    sc.nextLine();

                    System.out.println("Llista de personatges disponibles:");

                    for (int i = 0; i < personatges.getPersonatges().size(); i++) {
                        System.out.println(personatges.getPersonatges().get(i).toString());
                    }


                    System.out.println("Personatge 1(nom): ");
                    String nom1 = sc.nextLine();

                    System.out.println("Personatge 2(nom): ");
                    String nom2 = sc.nextLine();

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
                    break;

                case 2:
                    sc.nextLine();
                    personatges.AfegirPersonatge(cp.Creacio());
                    break;
            }
        }

    }
//sigma beta figma
}