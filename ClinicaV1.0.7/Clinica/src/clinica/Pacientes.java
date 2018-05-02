
package clinica;

import java.sql.Date;
import java.util.ArrayList;


public class Pacientes {
    
    private ArrayList<Pacientes> pacientes;
    private int nus;
    private String dni;
    private String nombre; 
    private String direccion;
    private int telefono;
    private Date fechaNacimiento;
    private Date fechaAlta;

    public Pacientes(int nus, String dni, String nombre, String primerApellido, String segundoApellido, String direccion, int telf, Date fechaNacimiento, Date fechaAlta){
        
        this.nus = nus;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telf;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.pacientes = new ArrayList<>();
    }
    
    
    
    public int getNus(){
        return nus;
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

    public int getTelefono() {
        return telefono;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    public void setNus(int nus) {
        this.nus = nus;
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

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
      public void getPacientes() {
        for(int i=0; i<pacientes.size();i++){
            pacientes.get(i);
        }
    }

    public void setPacientes(Pacientes paciente) {
        pacientes.add(paciente);
    }
    
     public String toString(){
        return "\n DNI: " + dni + "\n Nombre: " + nombre + "\n Direccion " + direccion + "\n Telef. " + telefono +  "\n";
    } 

}
