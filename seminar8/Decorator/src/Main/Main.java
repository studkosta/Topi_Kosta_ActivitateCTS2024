package Main;

import Clase.Bilet;
import Clase.BiletAbstract;
import Decorator.BiletAniversareSTB;
import Decorator.BiletSarbatori;
import Decorator.Decorator;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet=new Bilet(100,"aazz");
        printare(bilet);

        Decorator decorator=new BiletSarbatori(bilet);
        decorator.reducerePret();
        printare(decorator);

        Decorator decorator2=new BiletAniversareSTB(bilet);
        printare(decorator2);

        Decorator decorator3=new BiletAniversareSTB(decorator);
        printare(decorator3);
    }
    public static void printare(BiletAbstract bilet){
        bilet.printareBilet();
    }
}