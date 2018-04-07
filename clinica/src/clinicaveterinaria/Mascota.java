
package clinicaveterinaria;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

import java.util.ArrayList;
import java.util.Date;


public class Mascota {

	private int idMascota;
	private String especie;
	private String nombre;
	private String raza;
	private String fechaNac;
        private char sexo;
        
	private ArrayList<Actuacion> actuaciones;
        
        
	public Mascota(Integer idMascota, String nombre, String especie, String raza, char sexo, String fechaNac){
            
            this.idMascota=idMascota;
            this.nombre=nombre;
            this.especie=especie;
            this.raza=raza;
            this.sexo=sexo;
            this.fechaNac=fechaNac;
	}
        
	public Mascota(){
                
	}

        @Override
	public String toString(){
            
            return "\n idMascota: " + idMascota + "\n Nombre: " + nombre +
                    "\n Especie: " + especie + "\n Raza: " + raza +
                    "\n Sexo: " + sexo + "\n Fecha de nacimiento: " + fechaNac;
	}

	public String getOperacion(){
		return "";
	}

        public int getIdMascota() {
            return idMascota;
        }

        public String getEspecie() {
            return especie;
        }

        public String getNombre() {
            return nombre;
        }

        public String getRaza() {
            return raza;
        }

        public String getFecNac() {
            return fechaNac;
        }

        public ArrayList<Actuacion> getActuaciones() {
            
            return actuaciones;
            
        }

        public void setIdMascota(int idMascota) {
            this.idMascota = idMascota;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public void setFecNac(String fecNac) {
            this.fechaNac = fecNac;
        }

        public void setActuaciones(ArrayList<Actuacion> actuaciones) {
            this.actuaciones = actuaciones;
        }

        
        public String escribeActuaciones(){
            
            String salida;
            salida="";
            
            for(Actuacion a: actuaciones){
                
                salida += a.toString();
            }
            
            
            return salida;
        }

}
