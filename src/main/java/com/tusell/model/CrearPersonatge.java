package com.tusell.model;
import com.tusell.model.LlistaPersonatges;
import com.tusell.model.Personatge;
import com.tusell.model.enums.GenereEnum;
import com.tusell.model.enums.PersonalitatEnum;
import com.tusell.model.enums.SexualitatEnum;
import com.tusell.util.InputUtils;

import java.util.Scanner;

public class CrearPersonatge{

    public Personatge Creacio() {

            Scanner sc = new Scanner(System.in);
            LlistaPersonatges personatges = new LlistaPersonatges();

            System.out.println("Creem un personatge!");

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
            return p;
        }
    }

