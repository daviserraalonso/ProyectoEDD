
package clinicaveterinaria;


/*import java.time.LocalDate;*/
import java.util.Date;


public class Actuacion {
       public String fecha;
	public int unidades;
	public Operacion operacion;

	public Actuacion(Operacion operacion, String fecha,  Integer unidades){
            
            this.operacion=operacion;
            this.fecha=fecha;
            this.unidades=unidades;
	}
        
        @Override
        public String toString(){
            return "\n Fecha: " + fecha + "\n Operacion: " + operacion + "\n Unidades: " + unidades;
        }
    
}
