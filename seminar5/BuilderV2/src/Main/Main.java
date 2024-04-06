package Main;

import Clase.Rezervare;
import Clase.Rezervare.BuilderRezervare;

public class Main {
    public static void main(String[] args) {
        BuilderRezervare builderRezervare = new Rezervare.BuilderRezervare();
        Rezervare r1 = builderRezervare.adaugaBautura().adaugaMancare().build();
        Rezervare r2 = builderRezervare.adaugaBautura().build();
        Rezervare r3 = builderRezervare.adaugaMuzica().adaugaGenMuzical("Rock").build();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
