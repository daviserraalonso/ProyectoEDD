
package clinica;

import java.util.ArrayList;


public class Pacientes {

    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Medicamentos> medicamentos;
    public Medicamentos medicamento_m;
    

    public Pacientes(String dni, String nombre, String direccion, String telefono){
        
        this.dni=dni;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        
    
    }
    public String toString(){
        return "\n DNI: " + dni + "\n Nombre: " + nombre + "\n Direccion " + direccion + "\n Telef. " + telefono +  "\n";
    } 
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
