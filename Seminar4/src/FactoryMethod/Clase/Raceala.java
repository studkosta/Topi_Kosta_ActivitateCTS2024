package FactoryMethod.Clase;

public class Raceala extends Medicament{
    private int cantitate;

    public Raceala(String denumire, float pret) {
        super(denumire, pret);
        this.cantitate = 0;
    }
    public Raceala(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate = cantitate;
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("Medicamentul pentru raceala " + super.getDenumire() + " are pretul de " + super.getPret() + " RON");
    }
}
