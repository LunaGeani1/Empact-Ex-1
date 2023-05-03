package com.aplicatieWeb.AppWeb;

public class Angajati {

    private String nume;
    private String prenume;
    private int varsta;
    private String functie;


    public Angajati(String nume,String prenume,int varsta,String functie){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.functie=functie;
    }

    public Angajati(){

    }

    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume=nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    @Override
    public String toString(){
        return "Numele angajatului este "+getNume()+
                "\nPrenumele angajatului este "+getPrenume()+
                "\nVarsta angajatului este "+getVarsta()+
                "\nFunctia angajatului este "+getFunctie();

    }
}
