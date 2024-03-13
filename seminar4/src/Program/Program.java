package Program;

import Clase.Medicament;
import Clase.MedicamentFactory;
import Clase.TipMedicament;

public class Program {
    public static void main(String[] args) {
        try {
            Medicament medicament1 = MedicamentFactory.creareMedicament(TipMedicament.DURERE, "Nurofen", 12, 8);
            medicament1.afisareDetalii();

            Medicament medicament2 = MedicamentFactory.creareMedicament(TipMedicament.BODY, "Nivea", 15, 1);
            medicament2.afisareDetalii();

            Medicament medicament3 = MedicamentFactory.creareMedicament(TipMedicament.GRIPA, "Paracetamol", 20, 5);
            medicament3.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}