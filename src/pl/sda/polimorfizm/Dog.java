package pl.sda.polimorfizm;

public class Dog implements Animal{

    @Override
    public void getName() {
        System.out.println(" To jest pies");
    }

    @Override
    public void getSound() {
        System.out.println(" hau hau");
    }

    @Override
    public void amountOfFood() {
        System.out.println(" Duuzo");
    }
}
