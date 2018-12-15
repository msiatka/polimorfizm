package pl.sda.polimorfizm;

import java.sql.SQLOutput;

public class Money implements IMoney {
    private double kasa;


    public Money(double kasa) {
            this.kasa = kasa;
        }

    public void setKasa(double kasa) {
        this.kasa = kasa;
    }

    @Override
    public double getAmount() {
        return this.kasa;
    }

    @Override
    public boolean equals(Money x) {

            boolean efekt;

            if(this.getAmount()== x.getAmount()) {
                if(this.getClass()==x.getClass()){
                efekt = true;}
                else {efekt = false;}

            }
            else {efekt = false;}

       // System.out.println("porownujemy obiekty " + getClass() + "  i  " + x.getClass());

            return efekt;

    }


}

