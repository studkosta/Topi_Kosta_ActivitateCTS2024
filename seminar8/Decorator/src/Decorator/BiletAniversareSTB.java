package Decorator;

import Clase.Bilet;
import Clase.BiletAbstract;

public class BiletAniversareSTB extends Decorator{
    public BiletAniversareSTB(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
        System.out.println("LA MULTI ANI STB!");
    }

    @Override
    public void reducerePret() {
        ((Bilet)bilet).setPret(0);
    }
}
