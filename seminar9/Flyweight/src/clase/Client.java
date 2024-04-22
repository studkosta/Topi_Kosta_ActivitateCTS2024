package clase;

public class Client implements Flyweight{
    private String nume;
    private String adresa;
    private String nrTelefon;

    public Client(String nume, String adresa, String nrTelefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void afisareInformatii(Cont cont) {
        System.out.println("Clientul cu numele: " + nume + ", adresa: " + adresa + " si numarul de telefon: " + nrTelefon + " are contul: " + cont.toString());
    }
}
