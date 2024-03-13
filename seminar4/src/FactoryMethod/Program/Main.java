package FactoryMethod.Program;

import FactoryMethod.Clase.Medicament;
import FactoryMethod.Fabrici.*;

public class Main {
    public static void main(String[] args){
        FabricaMedicamente fabricaDurere = new FabricaDurere("Algocalmin", 12.0f);
        Medicament medicamentDurere = fabricaDurere.creareMedicament();
        medicamentDurere.afisareMedicament();

        FabricaMedicamente fabricaRaceala = new FabricaRaceala("Paracetamol", 10.0f);
        Medicament medicamentRaceala = fabricaRaceala.creareMedicament();
        medicamentRaceala.afisareMedicament();

        FabricaMedicamente fabricaMedicamente = new FabricaRaceala("Paracetamol", 15.0f);
        procesareMedicament(fabricaMedicamente);
        fabricaMedicamente = new FabricaGripa("Aspirina", 20.0f);
        procesareMedicament(fabricaMedicamente);
    }

    public static void procesareMedicament(FabricaMedicamente fabricaMedicamente){
        Medicament medicament = fabricaMedicamente.creareMedicament();
        medicament.afisareMedicament();
    }
}
