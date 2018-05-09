package clinica;

import java.util.ArrayList;


public class Medicamentos {
    ArrayList<String> medicamentos;
    
    public Medicamentos(){
        medicamentos = new ArrayList<String>();
    }

    public String getMedicamentos(int n) {
        return medicamentos.get(n);
    }

    public void insertaMedicamentos(String nomMed) {
        medicamentos.add(nomMed);
    }
    
    public String toString(){
    
    String cadena = "Medicamentos: ";
        for(int i=0;i<medicamentos.size();i++){
            cadena+=medicamentos.get(i) + " ";

        }
    return cadena;
    }
}
