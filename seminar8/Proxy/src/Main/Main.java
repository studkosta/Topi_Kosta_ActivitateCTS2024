package Main;

import Clase.AbstractAutobuz;
import Clase.Autobuz;
import Clase.AutobuzDeNoapte;
import Proxy.AutobuzProxy;

public class Main {
    public static void main(String[] args) {
        AbstractAutobuz autobuz=new Autobuz(11,368,"Mihai");
        autobuz.opresteInStatie("Piata Romana");

        AbstractAutobuz autobuz1=new AutobuzDeNoapte(autobuz);
        autobuz1.opresteInStatie("Victoriei");

        AbstractAutobuz autobuz2=new Autobuz(0,365,"Matei");
        autobuz2.opresteInStatie("Aviatorilor");

        AbstractAutobuz autobuz3=new AutobuzDeNoapte(autobuz2);
        autobuz3.opresteInStatie("Dristor");

        AutobuzProxy autobuzProxy=new AutobuzProxy(autobuz1);
        autobuzProxy.adaugaStatie("Piata Romana");
        autobuzProxy.adaugaStatie("Piata Victoriei");
        autobuzProxy.adaugaStatie("Universitate");

        autobuzProxy.opresteInStatie("Universitate");
    }
}