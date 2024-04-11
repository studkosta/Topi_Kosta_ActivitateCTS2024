package Decorator;

import Clase.BiletAbstract;

public abstract class Decorator implements BiletAbstract {
    protected BiletAbstract bilet;

    public Decorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public abstract void reducerePret();
}
