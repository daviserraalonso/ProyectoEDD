
package clinicaveterinaria;

import javax.swing.JTable;


public class ClinicaVeterinaria {
        private static Cliente cliente;
	private static String dni;
	public ORM m_ORM; 
        public IO io;
        public static int idMascota;
        
        
    public static void main(String[] args){
       dni = IO.cadena("Introduzca un DNI: ");
              
       MySQL.conecta("clinica");
       System.out.println("Datos del paciente con DNI: " + dni);
        System.out.println("-----------------------------------------------------");
       ORM.dameCliente(dni);        
        System.out.println("-----------------------------------------------------");
       System.out.println("Listado de Mascotas para el paciente con DNI: " + dni);
        System.out.println("-----------------------------------------------------");
        ORM.dameMascotasSinActuaciones(dni);
       System.out.println("----------------------------------------------------");
        idMascota = IO.entero("Introduzca el id de la Mascota para ver sus actuaciones: ");
        MySQL.ejecutaConsulta("SELECT * FROM actuaciones where idMascota=" + idMascota);
        ORM.dameActuaciones(idMascota);
       System.out.println("----------------------------------------------------");
        
    }
    
}
