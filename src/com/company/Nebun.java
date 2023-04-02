package com.company;

public class Nebun extends  Piesa implements  TablaDeSah{


    public Nebun(String culoare, int linie, int coloana) {
        super(culoare, linie, coloana);
    }


    @Override
    public void move(int linieFinal, int coloanFinal) {

        if(Math.abs(linieFinal - linie) == Math.abs(coloanFinal -coloana)){
            //(2-0)==(0-2)
            //(0-5)==(2-7)
            linie = linieFinal;
            coloana = coloanFinal;
        }
    }
}
