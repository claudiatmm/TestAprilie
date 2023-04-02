package com.company;

public class Cal extends Piesa implements TablaDeSah{

    public Cal(String culoare, int linie, int coloana) {
        super(culoare, linie, coloana);
    }

    @Override
    public void move(int linieFinal, int coloanFinal) {

//        if((linieFinal - linie != 2 &&  Math.abs(coloanFinal - coloana) != 1) || (linieFinal - linie != 1 &&  Math.abs(coloanFinal - coloana) != 2))
//            return;

        if((Math.abs(linieFinal - linie) == 2 && Math.abs(coloanFinal - coloana) == 1) || (Math.abs(linieFinal -linie) ==1 && Math.abs(coloanFinal -coloana) == 2)){
            linie = linieFinal;
            coloana = coloanFinal;
        }

//        if(linieFinal - linie != 1 &&  Math.abs(coloanFinal - coloana) != 2)
//            return;
//        if ( Math.abs(linie - linieFinal) != Math.abs(coloana - coloanFinal)){
//            linie = linieFinal;
//            coloana = coloanFinal;
//        }

    }
}
