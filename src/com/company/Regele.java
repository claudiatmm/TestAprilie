package com.company;

public class Regele extends Piesa implements TablaDeSah{


    public Regele(String culoare, int linie, int coloana) {
        super(culoare, linie, coloana);
    }

    @Override
    public void move(int linieFinal, int coloanFinal) {
        if (Math.abs(linieFinal - linie) != 1 || Math.abs(coloanFinal -coloana) != 1)
            return;
        linie = linieFinal;
        coloana = coloanFinal;
    }
}
