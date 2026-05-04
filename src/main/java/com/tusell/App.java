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
        System.out.println(p);
        personatges.AfegirPersonatge(p);

        CrearPersonatge cp = new CrearPersonatge();
        Events event = new Events();

        boolean obert = true;
        while (obert) {
            System.out.println("1. Fer que dos personatges es coneixin.");
            System.out.println("2. Crear Personatge");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Quins personatges vols que es coneixin: ");
                    personatges.getPersonatges().toString();
                    System.out.println("Personatge 1(nom): ");
                    String nomPersonatge = sc.nextLine();
                    for  (int i = 0; i < personatges.getPersonatges().size(); i++) {
                        if (personatges.getPersonatges().get(i).getNom() == nomPersonatge){
                            Personatge p1 =  personatges.getPersonatges().get(i);
                            System.out.println("Personatge 2(nom): ");
                            String nomPersonatge2 = sc.nextLine();
                            for (int j = 0; j < personatges.getPersonatges().size(); j++){
                                if(personatges.getPersonatges().get(i).getNom() == nomPersonatge2){
                                    Personatge p2 =  personatges.getPersonatges().get(j);
                                    event.Coneixer(p1, p2);
                                }
                            }
                        }
                    }

                case 2:
                    cp.Creacio();
                    break;
            }
        }

    }

}