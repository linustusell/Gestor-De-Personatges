package com.tusell;

import com.tusell.model.Personatge;
import com.tusell.model.enums.GenereEnum;
import com.tusell.model.enums.PersonalitatEnum;
import com.tusell.model.enums.SexualitatEnum;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Començarem creant un personatge!");

        System.out.println("Com es dirà aquest personatge?");
        String nom = sc.nextLine();

        System.out.println("Perfecte, és HOME o DONA?");
        GenereEnum genere = GenereEnum.valueOf(sc.nextLine().toUpperCase());

        System.out.println("Quant medeix en/la " + nom + "? (en cm)");
        int altura = Integer.parseInt(sc.nextLine());

        System.out.println("Quant pesa en/la " + nom + "? (en kg)");
        int pes = Integer.parseInt(sc.nextLine());

        System.out.println("De quin color és en/la " + nom + "?");
        String color = sc.nextLine();

        System.out.println("Quina és la seva sexualitat? (HETEROSEXUAL / HOMOSEXUAL / BISEXUAL)");
        SexualitatEnum sexualitat = SexualitatEnum.valueOf(sc.nextLine().toUpperCase());

        System.out.println("Quina és la seva personalitat? (EXTROVERTIT / INTROVERTIT / ROMANTIC / INDEPENDENT / SERIOS / GELOS)");
        PersonalitatEnum personalitat = PersonalitatEnum.valueOf(sc.nextLine().toUpperCase());

        System.out.println("Quina és la seva imatge? (ruta o nom del fitxer)");
        String imagePath = sc.nextLine();

        Personatge p = new Personatge(nom, altura, pes, color, imagePath, sexualitat, personalitat, genere);

        System.out.println("\nPersonatge creat!");
        System.out.println(p);

        sc.close();
    }
}