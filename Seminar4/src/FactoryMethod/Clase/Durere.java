package FactoryMethod.Clase;

public class Durere extends Medicament{
    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("Medicamentul pentru durere " + super.getDenumire() + " are pretul de " + super.getPret() + " RON.");
    }
}
