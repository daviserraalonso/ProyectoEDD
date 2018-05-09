
package clinica;

import java.sql.Date;
import java.util.ArrayList;


public class Pacientes {
    
    private ArrayList<Pacientes> pacientes;
    private int nus;
    private String dni;
    private String nombre; 
    private String primerApellido;
    private String segundoApellido;
    private String calle;
    private String localidad;
    private int telefono;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private int medico;
    private String historial;

    public Pacientes(int nus, String dni, String nombre, String primerApellido, String segundoApellido, int telf, String calle, String localidad,
            Date fechaNacimiento, Date fechaAlta, int medico, String historial){
        
        this.nus = nus;
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.calle = calle;
        this.localidad = localidad;
        this.telefono = telf;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.medico = medico;
        this.historial = historial;
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

    public String getCalle() {
        return calle;
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

    public void setCalle(String calle) {
        this.calle = calle;
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
    
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    public int getMedico() {
        return medico;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
    
     public String toString(){
        return "\n DNI: " + dni + "\n Nombre: " + nombre + "\n Direccion " + calle + "\n Localidad " + localidad + "\n Telef. " + telefono +  "\n";
    } 

}
