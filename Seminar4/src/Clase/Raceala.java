package Clase;

public class Raceala extends Medicament{
    private int cantitate;
    public Raceala(String denumire, float pret){
        super(denumire, pret);
        this.cantitate = 0;
    }

    public Raceala(String denumire, float pret, int valabilitate){
        super(denumire, pret);
        this.cantitate = valabilitate;
    }

    public void afisareDetalii(){
        System.out.println("Medicamentul " + super.getDenumire() + " este un medicament de tip Raceala, are pretul de " + super.getPret() + " RON. Valabilitate: " + cantitate + " luni.");
    }
}
