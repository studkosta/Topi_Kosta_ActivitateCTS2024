package Prototip;

import java.util.ArrayList;
import java.util.List;

public class Client implements AbstractClient{
    private String nume;
    private int varsta;
    private List<String> listaAccesorii;

    public Client(String nume, int varsta, List<String> accesorii) {
        this.nume = nume;
        
        if(varsta <= 14) {
            System.out.println(varsta);
            throw new RuntimeException("Varsta este prea mica.");

        }
        this.varsta = varsta;
        
        if(accesorii.size() >=5) {
            throw new RuntimeException("Prea multe accesorii.");
        }
        listaAccesorii = accesorii;
    }
    
    private Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", listaAccesorii=" + listaAccesorii +
                '}';
    }

    public AbstractClient clone() {
        Client newClient = new Client();
        newClient.nume = this.nume;
        newClient.varsta = this.varsta;
        newClient.listaAccesorii = new ArrayList<>();
        for(int i=0;i<this.listaAccesorii.size();i++){
            newClient.listaAccesorii.add(this.listaAccesorii.get(i));
        }
//        this.listaAccesorii.forEach(accesoriu -> {
//            newClient.listaAccesorii.add(accesoriu);
//        });
        return newClient;
    }

    @Override
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
