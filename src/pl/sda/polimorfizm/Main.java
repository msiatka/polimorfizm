package pl.sda.polimorfizm;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //zakladamy nowy obiekt cat- przy pomocy intefejsu
        Animal cat = new Cat();
        cat.getName();

        Animal dog = new Dog();
        dog.getSound();

        AnimalClass dogClass = new DogClass();
        dogClass.sound();

        Money kasa = new Money(1212.12);

        System.out.println(kasa.getAmount());
//
//        Money a = new Money(5);
//        Money b = new Money(6);
//        System.out.println(" a " + a.getAmount());
//        System.out.println(" b " + b.getAmount());
        System.out.println(" money porównanie: ");
       System.out.println(new Money(5).equals(new Money(5)));
       System.out.println(new Money(5).equals(new Money(6)));

        System.out.println(" france dolary porównanie: ");
       Dollar c = new Dollar(123.21);
       Franc d = new Franc(123.21);
        System.out.println(new Dollar(5).equals(new Franc(5)));

        Dollar dollar = new Dollar(5);
        System.out.println(dollar.getAmount());
        dollar.add(new Dollar(6));
        System.out.println(dollar.getAmount());

//        Exchange exchange = new Exchange(0.5, 2);
//        System.out.println(exchange.dollarToFrancRatio());
//        System.out.println(exchange.francToDollarRatio());
//



    }
}
