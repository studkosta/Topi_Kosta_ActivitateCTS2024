package Clase;

public class Autobuz implements AbstractAutobuz{
    private int nrCalatori;
    private int nrAutobuz;
    private String numeSofer;
    @Override
    public void opresteInStatie(String statie) {
        System.out.println("Autobuzul "+ nrAutobuz +" condus de "+ numeSofer +" a oprit in statia"+ statie);
    }

    public Autobuz(int nrCalatori, int nrAutobuz, String numeSofer) {
        this.nrCalatori = nrCalatori;
        this.nrAutobuz = nrAutobuz;
        this.numeSofer = numeSofer;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }
}