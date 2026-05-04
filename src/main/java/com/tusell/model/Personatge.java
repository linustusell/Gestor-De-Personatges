package com.tusell.model;
import com.tusell.model.enums.SexualitatEnum;
import com.tusell.model.enums.GenereEnum;
import com.tusell.model.enums.PersonalitatEnum;

public class Personatge {

    private String nom;
    private int altura;
    private int pes;
    private String color;
    private String imagePath;
    private SexualitatEnum sexualitat;
    private PersonalitatEnum personalitat;
    private GenereEnum genere;

    public Personatge(String nom, int altura, int pes, String Color, SexualitatEnum sexualitat,
                      PersonalitatEnum personalitat, GenereEnum genere) {
        this.nom = nom;
        this.altura = altura;
        this.pes = pes;
        this.color = Color;
        this.sexualitat = sexualitat;
        this.personalitat = personalitat;
        this.genere = genere;

    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getPes() {
        return pes;
    }
    public void setPes(int pes) {
        this.pes = pes;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public SexualitatEnum getSexualitat() {
        return sexualitat;
    }
    public void setSexualitat(SexualitatEnum sexualitat) {
        this.sexualitat = sexualitat;
    }
    public PersonalitatEnum getPersonalitat() {
        return personalitat;
    }
    public void setPersonalitat(PersonalitatEnum personalitat) {
        this.personalitat = personalitat;
    }
    public GenereEnum getGenere() {
        return genere;
    }
    public void setGenere(GenereEnum genere) {
        this.genere = genere;
    }
    @Override
    public String toString() {
        return nom + " medeix " + altura + ", pesa  " + pes + ", és de color " + color + ", és " + sexualitat + ", és "
                + personalitat + ", i és " + genere;
    }
}
