package FactoryMethod.Fabrici;

import FactoryMethod.Clase.Medicament;
import FactoryMethod.Clase.Raceala;

public class FabricaRaceala extends FabricaMedicamente{
    private int cantitate;
    public FabricaRaceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Raceala(super.getDenumire(), super.getPret(), cantitate);
    }
}
