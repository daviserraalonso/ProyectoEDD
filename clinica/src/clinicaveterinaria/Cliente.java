/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.ArrayList;


public class Cliente {

    private String dni;
    private String nombre;
    private String telefono;
    private String direccion;
    private ArrayList<Mascota> mascotas;
    public Mascota m_Mascota;

    public Cliente(String dni, String nombre, String direccion, String telefono) {

        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {

        return "\n DNI: " + dni + "\n Nombre: " + nombre + "\n Telef. " + telefono + "\n Direccion " + direccion + "\n";
    }
    
    public String listarMascotas() {
        
        String salida;
        
        salida="\n Lista de mascotas: \n";

        for(Mascota m: mascotas){
            
            salida += m.toString();
            salida += "\n ------------------- \n";
        }
        
        return salida;
    }
    
    public Mascota getMascotaPorId(Integer idMascota) {
        Mascota auxm;
        auxm = new Mascota();

        for (Mascota m : mascotas) {

            if (m.getIdMascota() == idMascota) {
                
                auxm = m;
                return auxm;
            }

        }

        return null;
    }

    public Mascota buscaMascota(int idMascota) {
        return null;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Mascota> getMascotasConA() {
        
        mascotas = ORM.dameMascotas(dni);

        return mascotas;
    }

    public ArrayList<Mascota> getMascotasSinA() {
        
        mascotas = ORM.dameMascotasSinActuaciones(dni);

        return mascotas;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setM_Mascota(Mascota m_Mascota) {
        this.m_Mascota = m_Mascota;
    }

}
