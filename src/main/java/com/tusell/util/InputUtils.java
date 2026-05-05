package com.tusell.util;

import com.tusell.model.enums.GenereEnum;
import com.tusell.model.enums.PersonalitatEnum;
import com.tusell.model.enums.SexualitatEnum;

import java.util.Scanner;

public class InputUtils {
    private InputUtils() {
    }

    public static String readNonEmptyLine(Scanner sc) {
        while (true) {
            String input = sc.nextLine();
            if (input == null) input = "";
            input = input.trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Entrada buida. Escriu una resposta vàlida.");
        }
    }

    public static GenereEnum readGenere(Scanner sc) {
        while (true) {
            String input = sc.nextLine();
            input = input == null ? "" : input.trim();

            if (input.isEmpty()) {
                System.out.println("Entrada buida. Escriu 'home' o 'dona'.");
                continue;
            }

            try {
                // GenereEnum té valors: home, dona
                return GenereEnum.valueOf(input.toLowerCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Resposta incorrecta. Escriu 'home' o 'dona'.");
            }
        }
    }

    public static SexualitatEnum readSexualitat(Scanner sc) {
        while (true) {
            String input = sc.nextLine();
            input = input == null ? "" : input.trim();

            if (input.isEmpty()) {
                System.out.println("Entrada buida. Escriu 'hetero' (heterosexual) o 'gay'.");
                continue;
            }

            String normalized = input.replaceAll("\\s+", "").toLowerCase();

            // Acceptem diferents formes perquè al missatge original hi ha "HETEROSEXUAL / GEY"
            if (normalized.equals("hetero") || normalized.equals("heterosexual") || normalized.equals("het"))
                return SexualitatEnum.hetero;
            if (normalized.equals("gay") || normalized.equals("gey"))
                return SexualitatEnum.gay;

            try {
                // SexualitatEnum té valors: hetero, gay
                return SexualitatEnum.valueOf(normalized);
            } catch (IllegalArgumentException e) {
                System.out.println("Resposta incorrecta. Escriu 'hetero' (heterosexual) o 'gay'.");
            }
        }
    }

    public static PersonalitatEnum readPersonalitat(Scanner sc) {
        while (true) {
            String input = sc.nextLine();
            input = input == null ? "" : input.trim();

            if (input.isEmpty()) {
                System.out.println("Entrada buida. Escriu una personalitat vàlida.");
                continue;
            }

            String normalized = input.replaceAll("\\s+", "").toUpperCase();

            try {
                // PersonalitatEnum té valors: EXTROVERTIT, INTROVERTIT, ROMANTIC, INDEPENDENT, SERIOS, GELOS
                return PersonalitatEnum.valueOf(normalized);
            } catch (IllegalArgumentException e) {
                System.out.println("Resposta incorrecta. Escriu una personalitat vàlida (EXTROVERTIT / INTROVERTIT / ROMANTIC / INDEPENDENT / SERIOS / GELOS).");
            }
        }
    }

    public static int readIntInRange(Scanner sc, int minInclusive, int maxInclusive, String errorOnInvalid) {
        while (true) {
            String input = sc.nextLine();
            input = input == null ? "" : input.trim();

            if (input.isEmpty()) {
                System.out.println(errorOnInvalid);
                continue;
            }

            try {
                int value = Integer.parseInt(input);
                if (value < minInclusive || value > maxInclusive) {
                    System.out.println(errorOnInvalid);
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println(errorOnInvalid);
            }
        }
    }

    public static int readMenuOption(Scanner sc, int minInclusive, int maxInclusive) {
        String error = "Opció incorrecta. Escriu un nombre entre " + minInclusive + " i " + maxInclusive + ".";
        return readIntInRange(sc, minInclusive, maxInclusive, error);
    }
}

