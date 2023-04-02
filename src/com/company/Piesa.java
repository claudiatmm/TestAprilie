package com.company;

public class Piesa {

    public String culoare;
    public int linie;
    public int coloana;

    @Override
    public String toString() {
        return "Piesa{" +
                "culoare='" + culoare + '\'' +
                ", linie=" + linie +
                ", coloana=" + coloana +
                '}';
    }

    public Piesa(String culoare, int linie, int coloana) {
        this.culoare = culoare;
        this.linie = linie;
        this.coloana = coloana;
    }
}
