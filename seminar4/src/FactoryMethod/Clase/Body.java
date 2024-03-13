package FactoryMethod.Clase;

public class Body extends Medicament{

    @Override
    public void afisareMedicament() {
        System.out.printf("Medicamentul pentru body " + super.getDenumire() + " are pretul de " + super.getPret() + "RON.");
    }

    public Body(String denumire, float pret) {
        super(denumire, pret);
    }
}
