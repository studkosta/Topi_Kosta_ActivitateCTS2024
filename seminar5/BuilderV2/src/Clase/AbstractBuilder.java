package Clase;


public interface AbstractBuilder {
    Rezervare build();
    AbstractBuilder adaugaMancare();
    AbstractBuilder adaugaBautura();
    AbstractBuilder adaugaMuzica();
    AbstractBuilder adaugaGenMuzical(String genMuzical);
    AbstractBuilder adaugaScaunErgonomic();

}
