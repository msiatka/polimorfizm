package pl.sda.polimorfizm;

public class Cat implements Animal{
    @Override
    public void getName() {
        System.out.println(" To jest kot");

    }

    @Override
    public void getSound() {
        System.out.println(" miał");

    }

    @Override
    public void amountOfFood() {
        System.out.println(" Malo ");

    }
}
