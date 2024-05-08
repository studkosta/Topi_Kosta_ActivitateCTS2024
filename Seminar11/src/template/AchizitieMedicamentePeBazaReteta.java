package template;

public class AchizitieMedicamentePeBazaReteta extends Template{

    private String numeMedicament;

    public AchizitieMedicamentePeBazaReteta(String numeMedicament) {
        super();
        this.numeMedicament = numeMedicament;
    }


    @Override
    protected void aduceMedicament() {
        System.out.println("Medicamentul "+ numeMedicament+ " este adus din depozit");
        if(super.stocuri.get(numeMedicament)>1) {
            super.stocuri.replace(numeMedicament, super.stocuri.get(numeMedicament) - 1);
        }else{
            super.stocuri.remove(numeMedicament);
        }
    }

    @Override
    protected void incaseaza() {
        System.out.println("Am primit banii pentru medicamentul "+ numeMedicament);
    }

    @Override
    protected void emiteBon() {
        System.out.println("A fost emis bonul");
    }

    @Override
    protected void primesteReteta() {
        System.out.println("Am primit reteta pentru medicamentul "+ numeMedicament);
    }

    @Override
    protected boolean verificaStoc() {
        if(super.stocuri.containsKey(numeMedicament)){
            return true;
        }
        return false;
    }

    @Override
    protected void respingeAchizitia() {
        System.out.println("Achitizia a fost respinsa");
    }
}
