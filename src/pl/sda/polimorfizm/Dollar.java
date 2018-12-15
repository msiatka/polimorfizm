package pl.sda.polimorfizm;

public class Dollar extends Money {
    public Dollar(double kasa) {
        super(kasa);
    }

    public void add(Dollar dolar){
        double kwota;
        kwota = this.getAmount();
        kwota += dolar.getAmount();
        this.setKasa(kwota);
    }
}
