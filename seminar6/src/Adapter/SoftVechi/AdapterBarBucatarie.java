package Adapter.SoftVechi;

import Adapter.SoftNou.Bar;
import Adapter.SoftNou.Bautura;

public class AdapterBarBucatarie extends Bar implements SoftBucatarie {
    @Override
    public void printareBon(){
        super.printareNotaDePlata();

    }
    @Override
    public void adaugareProdus(Produs produs){
        Bautura b = new Bautura(produs.getDenumire(), produs.getPret(),0);
        super.adaugaBautura(b);
    }
}
