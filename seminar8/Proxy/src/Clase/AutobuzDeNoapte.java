package Clase;

public class AutobuzDeNoapte implements AbstractAutobuz {

    private AbstractAutobuz autobuz;

    public AutobuzDeNoapte(AbstractAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(String statie) {
        if (autobuz.getNrCalatori() > 0) {
            autobuz.opresteInStatie(statie);
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu opreste in statie");
        }
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }
}
