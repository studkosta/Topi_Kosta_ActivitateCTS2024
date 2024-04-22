package main;

import clase.Agentie;
import clase.Filiala;
import clase.Sediu;
import clase.Sucursala;

public class Main {
    public static void main(String[] args) {
        Sediu sediu = new Agentie("Banca", 10);
        Sediu sucursala1 = new Sucursala("BRD", 9);
        Sediu agentieSector1 = new Agentie("BRD-Sector1", 23);
        Sediu agentieSector2 = new Agentie("BRD-Sector2", 15);

        Sediu filialaRomana = new Filiala(4, "BRD-Romana");
        Sediu filialaVictoriei = new Filiala(11, "BRD-Victoriei");
        Sediu filialaObor = new Filiala(7, "BRD-Obor");
        Sediu filialaMuncii = new Filiala(8, "BRD-Muncii");
        Sediu filialaUniversitate = new Filiala(8, "BRD-Universitate");

        agentieSector1.adaugaSediu(filialaRomana);
        agentieSector1.adaugaSediu(filialaVictoriei);

        agentieSector2.adaugaSediu(filialaObor);
        agentieSector2.adaugaSediu(filialaMuncii);

        sediu.adaugaSediu(filialaUniversitate);

        sediu.adaugaSediu(sucursala1);

        sediu.adaugaSediu(agentieSector1);
        sediu.adaugaSediu(agentieSector2);

        sediu.afisareSediu("     ");

        System.out.println(agentieSector1.calculeazaNrAngajati());
        System.out.println(sediu.calculeazaNrAngajati());
    }
}