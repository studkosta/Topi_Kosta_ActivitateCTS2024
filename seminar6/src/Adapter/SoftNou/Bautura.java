package Adapter.SoftNou;

public class Bautura {
    private String denumire;
    private float pret;
    private float gradAlcool;

    public Bautura(String denumire, float pret, float gradAlcool) {
        this.denumire = denumire;
        this.pret = pret;
        this.gradAlcool = gradAlcool;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public float getGradAlcool() {
        return gradAlcool;
    }

    @Override
    public String toString() {
        return "Bautura{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", gradAlcool=" + gradAlcool +
                '}';
    }
}
