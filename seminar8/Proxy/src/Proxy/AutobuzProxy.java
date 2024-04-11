package Proxy;

import Clase.AbstractAutobuz;

import java.util.ArrayList;
import java.util.List;

public class AutobuzProxy implements AbstractAutobuz {
    private List<String> statiiInterzise=new ArrayList<>();
    private AbstractAutobuz autobuz;

    public AutobuzProxy( AbstractAutobuz autobuz) {

        this.autobuz = autobuz;
    }

    public void adaugaStatie(String statie){
        statiiInterzise.add(statie);
    }
    @Override
    public void opresteInStatie(String statie) {
        if(statiiInterzise.contains(statie)){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu opreste in statie");
        }
        else {
            opresteInStatie(statie);
        }
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }
}