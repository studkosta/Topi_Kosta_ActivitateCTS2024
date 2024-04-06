import Prototip.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> accesorii = new ArrayList<>();
        accesorii.add("A");
        accesorii.add("B");
        Client c1 = new Client("Andrei", 16, accesorii);
        System.out.println(c1);
        Client c2 = new Client("Cosmin", 29, accesorii);
        System.out.println(c1);
        ((Client)c2).setVarsta(30);
        System.out.println(c2);
    }
}