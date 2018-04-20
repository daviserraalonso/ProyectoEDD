package clinica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Diurno
 */
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
