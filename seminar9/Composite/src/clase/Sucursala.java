package clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements Sediu{
    private List<Sediu> listaSedii;
    private String nume;
    private int nrPrgramatori;

    public Sucursala(String nume, int nrOperatori) {
        this.listaSedii = new ArrayList<>();
        this.nume = nume;
        this.nrPrgramatori = nrOperatori;
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        this.listaSedii.add(sediu);
    }

    @Override
    public void stergeSediu(Sediu sediu) {
        this.listaSedii.remove(sediu);
    }

    @Override
    public Sediu getSediu(int index) {
        return this.listaSedii.get(index);
    }

    @Override
    public void afisareSediu(String indentare) {
        System.out.println(indentare + "Sucursala cu numele: " + nume + " are " + nrPrgramatori + " programatori si contine urmatoarele sedii: ");
        for(Sediu sediu : listaSedii) {
            sediu.afisareSediu(indentare + "     ");
        }
    }

    @Override
    public int calculeazaNrAngajati() {
        int suma = nrPrgramatori;
        for(Sediu sediu : listaSedii) {
            suma += sediu.calculeazaNrAngajati();
        }
        return suma;
    }
}
