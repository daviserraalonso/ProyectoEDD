/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alber
 */
public class IOFicheros {

    public static String leeFicheroBuffer(String fichero, StringBuilder estado) {
        String lineaActual;

        BufferedReader archivo = null;
        try {
            archivo = new BufferedReader(new FileReader(fichero));

            lineaActual = archivo.readLine();

            String resultado = "";
            while (lineaActual != null) {
                resultado += lineaActual + "\r\n";
                lineaActual = archivo.readLine();
            }

            return resultado;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                archivo.close();
            } catch (Exception ex) {
            }
        }
        return "";
    }

    public static String leeFichero(String fichero, StringBuilder estado) {
        FileReader reader = null;
        try {
            reader = new FileReader(fichero);
            int c = reader.read();
            StringBuilder sb = new StringBuilder();
            while (c != -1) {
                sb.append((char) c);
                c = reader.read();
            }
            reader.close();
            return sb.toString();
        } catch (FileNotFoundException ex) {
            estado.append("Error 001: El fichero no puede ser encontrado o no existe");
            return "";
        } catch (IOException ex) {
            estado.append("Error 002: El fichero no puede ser leido");
            return "";
        } finally {
            try {
                reader.close();
            } catch (Exception x) {

            }
        }
    }

    public static int escribeFicheroBuffer(String fichero, String datos) {
        BufferedReader input = null;
        try {
            String linea;
            input = new BufferedReader(new FileReader(fichero));
            linea = input.readLine();
            String linea2 = "";
            while (linea != null) {
                linea2 += linea;
                linea = input.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(IOFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public static int escribeFichero(String fichero, String datos) {

        try {
            FileWriter output = new FileWriter(fichero);
            for (int i = 0; i < datos.length(); i++) {
                output.write(datos.charAt(i));
            }
            output.close();
        } catch (IOException ex) {
            return -1;
        }
        return 0;
    }

}