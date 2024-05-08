package state.main;

import state.AbstractState;
import state.Achizitionata;
import state.Reteta;
import state.Solicitata;

public class Main {
    public static void main(String[] args) {
        Reteta reteta= new Reteta(3, 20, 1);
        reteta.cumparaMedicamente();
        reteta.cereMedicamente();
        reteta.respingeReteta();

        reteta.cereMedicamente();
        reteta.cumparaMedicamente();

    }
}