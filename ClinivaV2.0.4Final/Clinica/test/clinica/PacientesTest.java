/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PacientesTest {
    ArrayList<Pacientes> pacientes;
    Pacientes paciente = new Pacientes(14526, "45921676z", "pepe", "serrano", "ramirez", 1234566789, "cLorca", "Granada", Date.valueOf(LocalDate.of(1993, Month.MAY, 31)), Date.valueOf(LocalDate.now()), 0, "Alergia");
    
    public PacientesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pacientes = new ArrayList<>();
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testGetNus() {
        System.out.println("getNus");
        Pacientes instance = paciente;
        int expResult = 14526;
        int result = instance.getNus();
        assertEquals(expResult, result);

    }


    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Pacientes instance = paciente;
        String expResult = "45921676z";
        String result = instance.getDni();
        assertEquals(expResult, result);

    }


    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Pacientes instance = paciente;
        String expResult = "pepe";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetCalle() {
        System.out.println("getCalle");
        Pacientes instance = paciente;
        String expResult = "cLorca";
        String result = instance.getCalle();
        assertEquals(expResult, result);

    }


    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Pacientes instance = paciente;
        int expResult = 1234566789;
        int result = instance.getTelefono();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Pacientes instance = paciente;
        Date expResult = Date.valueOf(LocalDate.of(1993, Month.MAY, 31));
        Date result = instance.getFechaNacimiento();
        assertEquals(expResult, result);

    }


    @Test
    public void testSetFechaNacimiento() {
        System.out.println("setFechaNacimiento");
        Date fechaNacimiento = Date.valueOf(LocalDate.of(1993, Month.MAY, 31));
        Pacientes instance = paciente;
        instance.setFechaNacimiento(fechaNacimiento);

    }

    @Test
    public void testGetFechaAlta() {
        System.out.println("getFechaAlta");
        Pacientes instance = paciente;
        Date expResult = Date.valueOf(LocalDate.now());
        Date result = instance.getFechaAlta();
        assertEquals(expResult, result);

    }

    
    @Test
    public void testSetFechaAlta() {
        System.out.println("setFechaAlta");
        Date fechaAlta = Date.valueOf(LocalDate.now());
        Pacientes instance = paciente;
        instance.setFechaAlta(fechaAlta);

    }


    @Test
    public void testSetNus() {
        System.out.println("setNus");
        int nus = 14526;
        Pacientes instance = paciente;
        instance.setNus(nus);

    }


    @Test
    public void testSetDni() {
        System.out.println("setDni");
        String dni = "45921676z";
        Pacientes instance = paciente;
        instance.setDni(dni);

    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "pepe";
        Pacientes instance = paciente;
        instance.setNombre(nombre);

    }


    @Test
    public void testSetCalle() {
        System.out.println("setCalle");
        String calle = "cLorca";
        Pacientes instance = paciente;
        instance.setCalle(calle);

    }


    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 1234566789;
        Pacientes instance = paciente;
        instance.setTelefono(telefono);

    }


    @Test
    public void testGetPacientes() {
        System.out.println("getPacientes");
        Pacientes paciente = this.paciente;
        for(int i=0; i<pacientes.size();i++){
            paciente = pacientes.get(i);
        }
        
        paciente.getPacientes();
  
    }


    @Test
    public void testSetPacientes() {
        System.out.println("setPacientes");
        pacientes.add(paciente);
    }


    @Test
    public void testGetPrimerApellido() {
        System.out.println("getPrimerApellido");
        Pacientes instance = paciente;
        String expResult = "serrano";
        String result = instance.getPrimerApellido();
        assertEquals(expResult, result);

    }


    @Test
    public void testSetPrimerApellido() {
        System.out.println("setPrimerApellido");
        String primerApellido = "serrano";
        Pacientes instance = paciente;
        instance.setPrimerApellido(primerApellido);

    }


    @Test
    public void testGetSegundoApellido() {
        System.out.println("getSegundoApellido");
        Pacientes instance = paciente;
        String expResult = "ramirez";
        String result = instance.getSegundoApellido();
        assertEquals(expResult, result);

    }


    @Test
    public void testSetSegundoApellido() {
        System.out.println("setSegundoApellido");
        String segundoApellido = "ramirez";
        Pacientes instance = paciente;
        instance.setSegundoApellido(segundoApellido);

    }


    @Test
    public void testGetLocalidad() {
        System.out.println("getLocalidad");
        Pacientes instance = paciente;
        String expResult = "Granada";
        String result = instance.getLocalidad();
        assertEquals(expResult, result);

    }


    @Test
    public void testSetLocalidad() {
        System.out.println("setLocalidad");
        String localidad = "granada";
        Pacientes instance = paciente;
        instance.setLocalidad(localidad);

    }


    @Test
    public void testGetMedico() {
        System.out.println("getMedico");
        Pacientes instance = paciente;
        int expResult = 0;
        int result = instance.getMedico();
        assertEquals(expResult, result);

    }


    @Test
    public void testSetMedico() {
        System.out.println("setMedico");
        int medico = 0;
        Pacientes instance = paciente;
        instance.setMedico(medico);

    }


    @Test
    public void testGetHistorial() {
        System.out.println("getHistorial");
        Pacientes instance = paciente;
        String expResult = "Alergia";
        String result = instance.getHistorial();
        assertEquals(expResult, result);

    }


    @Test
    public void testSetHistorial() {
        System.out.println("setHistorial");
        String historial = "alergia";
        Pacientes instance = paciente;
        instance.setHistorial(historial);

    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Pacientes instance = paciente;
        String expResult = paciente.toString();
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
