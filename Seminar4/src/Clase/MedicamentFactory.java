package Clase;

public class MedicamentFactory {
    public static Medicament creareMedicament(TipMedicament tip, String denumire, float pret, int valabilitate) {
        switch(tip){
            case BODY:
                return new Body(denumire, pret);
            case DURERE:
                return new Durere(denumire, pret);
            case RACEALA:
                return new Raceala(denumire, pret, valabilitate);
            case GRIPA:
                return new Gripa(denumire, pret);
            default:
                try{
                    throw new Exception("Nu exista medicamentul");
                } catch (Exception e){
                    throw new RuntimeException(e);
                }

        }
    }
}
