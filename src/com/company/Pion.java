package com.company;

public class Pion extends Piesa implements TablaDeSah{

    public Pion(String culoare, int linie, int coloana) {
        super(culoare, linie, coloana);
    }

    @Override
    public void move(int linieFinal, int coloanFinal) {
        // linie si coloana la care ma aflu la inceput
        if (coloana!= coloanFinal)
            return;

        if (linieFinal - linie != 1)
             return;
        // 1-0 != 1 ; linie =1
        // 2-1  != 1; linie =2
        // 3-2 != 1;  linie =3
        // 4-3 != 1 ; linie =4
        linie = linieFinal;
        coloana =coloanFinal;
    }
}
