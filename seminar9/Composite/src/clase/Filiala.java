package clase;

public class Filiala implements Sediu{
    private int nrAngajati;
    private String nume;

    public Filiala(int nrAngajati, String nume) {
        this.nrAngajati = nrAngajati;
        this.nume = nume;
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeSediu(Sediu sediu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Sediu getSediu(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareSediu(String indentare) {
        System.out.println("Filiala " + nume + " are " + nrAngajati + " angajati.");
    }

    @Override
    public int calculeazaNrAngajati() {
        return nrAngajati;
    }
}
