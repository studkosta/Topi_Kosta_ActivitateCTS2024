package clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Sediu{
    private List<Sediu> listaSedii;
    private String nume;
    private int nrOperatori;

    public Agentie(String nume, int nrOperatori) {
        this.listaSedii = new ArrayList<>();
        this.nume = nume;
        this.nrOperatori = nrOperatori;
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
        System.out.println(indentare + "Agentia cu numele: " + nume + " are " + nrOperatori + " operatori si contine urmatoarele sedii: ");
        for(Sediu sediu : listaSedii) {
            sediu.afisareSediu(indentare + "     ");
        }
    }

    @Override
    public int calculeazaNrAngajati() {
        int suma = nrOperatori;
        for(Sediu sediu : listaSedii) {
            suma += sediu.calculeazaNrAngajati();
        }
        return suma;
    }
}
