package main;

import clase.Banca;
import clase.Cont;

public class Main {
    public static void main(String[] args) {
        Banca banca= new Banca("BCR", 123);
        Cont cont1 = new Cont(12, 123);
        Cont cont2 = new Cont(11, 124);
        Cont cont3 = new Cont(10, 153);
        Cont cont4 = new Cont(13, 133);

        banca.getClient("Gigel", "Bucuresti", "072121").afisareInformatii(cont1);
        banca.getClient("Gigel").afisareInformatii(cont2);

        banca.getClient("Ionel", "Sibiu", "072323").afisareInformatii(cont1);
        banca.getClient("Ionel", "Bucuresti", "072121").afisareInformatii(cont1);
    }
}