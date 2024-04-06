package Adapter.Main;

import Adapter.SoftNou.Bar;
import Adapter.SoftNou.Bautura;
import Adapter.SoftVechi.*;

public class Main {
    public static void platesteComanda(SoftBucatarie comanda) {
        comanda.printareBon();
    }

    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs = new Produs("Pizza", 52);
        Produs produs1 = new Produs("Paste", 45);
        bucatarie.adaugareProdus(produs);
        bucatarie.adaugareProdus(produs1);

        platesteComanda(bucatarie);

        AdapterBarBucatarie bar = new AdapterBarBucatarie();
        bar.adaugaBautura(new Bautura("Mojito",25,25.5F));
        bar.adaugaBautura(new Bautura("Cola",12,0));
        Bautura bautura = new Bautura("Apa",5,0);
        AdapterBauturaProdus p = new AdapterBauturaProdus(bautura);

        bar.adaugareProdus(p);
        platesteComanda(bar);
    }
}