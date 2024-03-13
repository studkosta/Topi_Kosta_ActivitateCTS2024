package FactoryMethod.Fabrici;

import FactoryMethod.Clase.Gripa;
import FactoryMethod.Clase.Medicament;

public class FabricaGripa extends FabricaMedicamente {

    public FabricaGripa(String denumire, float pret) {
        super(denumire, pret);
    }
    @Override
    public Medicament creareMedicament() {
        return new Gripa(super.getDenumire(), super.getPret());
    }
}
