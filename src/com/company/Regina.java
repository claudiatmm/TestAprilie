package com.company;

public class Regina extends Piesa implements TablaDeSah{

    public Regina(String culoare, int linie, int coloana) {
        super(culoare, linie, coloana);
    }



    @Override
    public void move(int linieFinal, int coloanFinal) {
        if (linie == linieFinal || coloana == coloanFinal || Math.abs(linie - linieFinal) == Math.abs(coloana - coloanFinal)){
            linie = linieFinal;
            coloana = coloanFinal;
        }

    }
}
