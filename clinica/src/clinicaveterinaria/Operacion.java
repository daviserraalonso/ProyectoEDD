
package clinicaveterinaria;


public class Operacion {

	private int idOp;
	private String nombre;

	public Operacion(int idOperacion, String nombre, double tarifa){

	}

        @Override
	public String toString(){
            return "idOperacion: " + idOp + " Nombre: " + nombre;
	}

}