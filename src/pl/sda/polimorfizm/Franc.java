package pl.sda.polimorfizm;

public class Franc extends Money{
    public Franc(double kasa) {
        super(kasa);
    }

    public void add(Franc franc){
        double kwota;
        kwota = this.getAmount();
        kwota += franc.getAmount();
        this.setKasa(kwota);
    }
}
