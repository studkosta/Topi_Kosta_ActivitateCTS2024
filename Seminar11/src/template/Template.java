package template;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {

    protected Map<String, Integer> stocuri;

    public Template() {
        this.stocuri= new HashMap<>();
        stocuri.put("Paracetamol", 1);
        stocuri.put("Nurofen", 2);
        stocuri.put("Algocalmin", 3);

    }

    //in metoda finala se apeleaza toate celelalte metode
    public final void cumparaMedicamente(){
        primesteReteta();
        if(verificaStoc()){
            aduceMedicament();
            incaseaza();
            emiteBon();
        }else{
            respingeAchizitia();
        }
    }

    protected abstract void aduceMedicament();
   protected abstract void incaseaza();
   protected abstract void emiteBon();
   protected abstract void primesteReteta();
   protected abstract boolean verificaStoc();
   protected abstract void respingeAchizitia();


}
