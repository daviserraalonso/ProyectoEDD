
package clinicaveterinaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

public class MySQL{

    // DDBC driver name and database URL
    
    static final String DDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";
// Database credentials
    static final String USER = "root";
    static final String PASS = "1234";
    static Connection conn;
    static PreparedStatement preparedStmt = null;
    static Statement stmt;
    static private ResultSet rs;
    static private ResultSetMetaData meta;
    //int numColumnas;

    public MySQL() {
    }

    public static void conecta(String db) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL + db, USER, PASS);

            stmt = conn.createStatement();
            //System.out.println("Conectado Existosamente!!");
        } catch (SQLException se) {
            //Handle errors for DDBC 
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public static void cierra() {

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }//end finally try }//end try
    }

    public static void ejecutaConsulta(String sql) {
        
//        try {
//
//            //System.out.println(sql);
//            rs = stmt.executeQuery(sql);
//            meta = rs.getMetaData();
//            //rs.first();
//        } catch (SQLException ex) {
//            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
//        }

        try {
            rs = stmt.executeQuery(sql);
            meta = rs.getMetaData();

            while(rs.next()){
                System.out.println( "DNI:" + rs.getString(1) + " Nombre:" + rs.getString(2) + " Direccion:" +rs.getString(3)
                      + " Teléfono:" + rs.getString(4));
            }
            rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int ejecutaConsultaAccion(String sql) {
        int nFilas = 0;
        System.out.println(sql);
        try {
            nFilas = stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nFilas;

    }

    public static ResultSet getResultSet() {
        return rs;
    }

    public static String[] getColumnas() {
        String[] columnas = null;

        try {
            int numColumnas = meta.getColumnCount();
            columnas = new String[numColumnas];
            for (int i = 1; i <= numColumnas; i++) {
                columnas[i - 1] = meta.getColumnName(i);
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }

        return columnas;

    }

//    //public Class[] getClases(){
//    public static void getClases() {
//
//        Class[] claseColumnas = null;
//
//        try {
//
//            int numColumnas = meta.getColumnCount();
//            claseColumnas = new Class[numColumnas];
//            rs.first();
//            for (int i = 1; i <= numColumnas; i++) {
//                //claseColumnas[i-1]=meta.getColumnClassName(i);
//                claseColumnas[i - 1] = rs.getObject(i).getClass();
//                System.out.println("clase-->>" + claseColumnas[i - 1]);
//
//            }
//
//        } catch (SQLException se) {
//            se.printStackTrace();
//        }
//
//        // return claseColumnas;
//    }
    public static Object[][] getDatos() {

        Object[][] datos = null;
        int nFila = 0;

        try {

            rs.last();
            int cuantasFilas = rs.getRow();
            rs.beforeFirst();
            int cuantasColumnas = meta.getColumnCount();
            datos = new Object[cuantasFilas][cuantasColumnas];
            while (rs.next()) {
                // Se crea y rellena la fila para el modelo de la tabla.

                for (int i = 1; i <= cuantasColumnas; i++) {
                    datos[nFila][i - 1] = rs.getObject(i);
                }

                nFila++;
            }
            //rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return datos;
    }

    public static Object[] getFila() {
        Object[] fila = null;
        int nColumnas;

        try {

            int cuantasColumnas = meta.getColumnCount();
            rs.last();
            if (rs.getRow()>0){
                rs.first();
                fila = new Object[cuantasColumnas];

                for (int i = 1; i <= cuantasColumnas; i++) {
                    fila[i - 1] = rs.getObject(i);
                }
            }
            //rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fila;

    }

//    public static Object[] getFilaDatos() {
//
//        Object[] filaDatos = null;
//
//        try {
//            // Para cada registro de resultado en la consulta 
//            //rs.absolute(fila );
//            rs.last();
//            int nCol = meta.getColumnCount();
//            filaDatos = new Object[nCol];
//            for (int i = 1; i <= nCol; i++) {
//                filaDatos[i - 1] = rs.getObject(i);
//            }
//
//            //rs.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return filaDatos;
//    }
//    public Object[] getFilaDatosVacia() {
//
//        Object[] filaDatos = null;
//
//        try {
//
//            int nCol = meta.getColumnCount();
//            filaDatos = new Object[nCol];
//            for (int i = 1; i <= nCol; i++) //filaDatos[i-1] = "";
//            {
//                filaDatos[i - 1] = new Object();
//            }
//            //rs.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return filaDatos;
//    }
}
