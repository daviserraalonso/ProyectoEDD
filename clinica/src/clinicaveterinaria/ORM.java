
package clinicaveterinaria;


import java.util.ArrayList;

public class ORM {
    
//    static Operacion operacion;
    
    public static void conecta(){
           MySQL.conecta("clinica");
    }

    public static Cliente dameCliente(String dni) {
        Cliente cliente = null;
        MySQL.ejecutaConsulta("select dni,nombre, direccion, telefono  from clientes where dni = '" + dni + "'");
        Object[] fila;

        fila = MySQL.getFila();
        if (fila != null) {
            cliente = new Cliente((String) fila[0], (String) fila[1], (String) fila[2], (String) fila[3]);
            cliente.setMascotas(dameMascotasSinActuaciones(dni));
        }

        return cliente;
    }

    public static Operacion dameOperacion(int idOperacion) {
        Operacion operacion = null;
        MySQL.ejecutaConsulta("select idOperacion, nombre, tarifa  from operaciones where idoperacion = " + idOperacion);
        Object[] fila;
        fila = MySQL.getFila();

        if (fila != null) {
            operacion = new Operacion((Integer) fila[0], (String) fila[1], (Double) fila[2]);
        }

        return operacion;
    }

    public static ArrayList<Mascota> dameMascotas(String dni) {
        ArrayList<Mascota> mascotas = null;
        
        Object[][] filas;

        MySQL.ejecutaConsulta("select idMascota,nombre, especie, raza, sexo, fechaNac  from mascotas  where dni = '" + dni + "'");
        filas = MySQL.getDatos();
        if (filas != null) {
            mascotas = new ArrayList<>();
            for (int i = 0; i < filas.length; i++) {
                Mascota mascota = new Mascota((Integer) filas[i][0], (String) filas[i][1], (String) filas[i][2], (String) filas[i][3], ((String) filas[i][4]).charAt(0), ((String) filas[i][5]));
                mascota.setActuaciones(dameActuaciones(mascota.getIdMascota()));
                mascotas.add(mascota);
            }
        }
        return mascotas;

    }
 public static ArrayList<Mascota> dameMascotasSinActuaciones(String dni) {
        ArrayList<Mascota> mascotas = null;
        
        Object[][] filas;

        MySQL.ejecutaConsulta("select idMascota,nombre, especie, raza, sexo, fechaNac  from mascotas  where dni = '" + dni + "'");
        filas = MySQL.getDatos();
        if (filas != null) {
            mascotas = new ArrayList<>();
            for (int i = 0; i < filas.length; i++) {
                Mascota mascota = new Mascota((Integer) filas[i][0], (String) filas[i][1], (String) filas[i][2], (String) filas[i][3], ((String) filas[i][4]).charAt(0), ((String) filas[i][5]));
                //mascota.setActuaciones(dameActuaciones(mascota.getIdMascota()));
                mascotas.add(mascota);
            }
        }
        return mascotas;

    }
    public static ArrayList<Actuacion> dameActuaciones(int idMascota) {
        ArrayList<Actuacion> actuaciones = null;
        Object[][] filas;
        int idOperacion;
       Operacion operacion;

        MySQL.ejecutaConsulta("select idMascota, idOperacion, fecha, unidades from actuaciones  where idmascota = " + idMascota);
        filas = MySQL.getDatos();
        if (filas != null) {
            actuaciones = new ArrayList<>();
            for (int i = 0; i < filas.length; i++) {
                idOperacion = (Integer) filas[i][1];
                operacion = dameOperacion(idOperacion);
                if (operacion != null) {
                    Actuacion actuacion = new Actuacion(operacion, ((String) filas[i][2]), (Integer) filas[i][3]);
                    actuaciones.add(actuacion);
                }
            }
        }
        return actuaciones;
    }
}
