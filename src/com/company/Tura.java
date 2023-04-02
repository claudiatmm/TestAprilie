package com.company;

public class Tura extends  Piesa implements TablaDeSah{

    public Tura(String culoare, int linie, int coloana) {
        super(culoare, linie, coloana);
    }


    @Override
    public void move(int linieFinal, int coloanFinal) {
        if (coloanFinal > 7 || linieFinal > 7)
            return;  // se opreste functia - nu mai ajunge la linia 15

        if (coloanFinal == coloana || linieFinal == linie){  // sau
            coloana = coloanFinal;
            linie = linieFinal;
        }
    }
}
