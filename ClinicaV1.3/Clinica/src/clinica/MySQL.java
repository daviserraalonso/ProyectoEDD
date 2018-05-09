/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class MySQL {

    static final String DDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost:3306/";

// Credenciales de usuario
    static String USER = "root";
    static String PASS = "1234";
    static Statement stmt;
    static private ResultSet rs;
    static private ResultSetMetaData meta;
    static private Connection conex;
    //int numColumnas;

    public MySQL() {

    }

    public Connection conecta(String user, String pass, String db) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Class.forName(DDBC_DRIVER);
            conex = DriverManager.getConnection(DB_URL + db, user, pass);
            stmt = conex.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println("conectado");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
        }
    return conex;
    }

    public void cierra() {
        try {
            if (conex != null) {
                conex.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión con la base de datos");
        }

    }

    public ResultSet ejecutaConsulta(String sql) {
        try {
            rs = stmt.executeQuery(sql);
            meta = rs.getMetaData();

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Error en la ejecución de la consulta" + se.getMessage());
        }
    return rs;
    }

    public int ejecutaConsultaAccion(String sql) {
        try {

            Statement stmt = conex.createStatement();
            int filas = 0;

            filas = stmt.executeUpdate(sql);

            return filas;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Error en la ejecución de la actualización");
            return -1;
        }

    }


    public ResultSet getResultSet() {

        return rs;
    }



    public String[] getCabecera() {

        String[] cabecera = null;
        try {
            int numColumnas = meta.getColumnCount();
            cabecera = new String[numColumnas];
            for (int i = 1; i <= numColumnas; i++) {
                cabecera[i - 1] = meta.getColumnName(i);
            }

            return cabecera;

        } catch (SQLException se) {
            se.printStackTrace();
            return cabecera;
        }
    }
    
    public Connection getConexion(){
        return conex;
    }

    public Object[][] getDatos() {

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


}

