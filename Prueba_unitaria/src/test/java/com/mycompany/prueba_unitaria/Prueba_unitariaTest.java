/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prueba_unitaria;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author criss
 */
public class Prueba_unitariaTest {
    
    public Prueba_unitariaTest() {
    }

    /**
     * Test of division method, of class Prueba_unitaria.
     */
    @Test
    public void testDivision() {
        Prueba_unitaria variable = new Prueba_unitaria();
        int a = 42;
        int b = 8;
        double resultado = variable.division(a, b);
        double esperado = a/b;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testDivisionByZero(){
        Prueba_unitaria variable = new Prueba_unitaria();
        int a = 42;
        int b = 0;
        double resultado = variable.division(a, b);
        double esperado = 0;
        assertEquals(esperado, resultado);
    }

    /**
     * Test of main method, of class Prueba_unitaria.
     */
    @Test
    public void testMain() {
        //Las entradas de texto que "ingresare"
        String entradas = String.format("Christofer%s99", System.lineSeparator());
        //Convierto la entrada del teclado a una cadena de bytes para que lo lea la computadora
        ByteArrayInputStream entrada_de_byte = new ByteArrayInputStream(entradas.getBytes());
        //Ingreso esa entrada al sistema
        System.setIn(entrada_de_byte);
        //Lo que espero que imprima en pantalla
        String esperado = "Su nombre es: Christofer, su edad es: 99";
        //Obtengo lo que imprime en pantalla
        ByteArrayOutputStream salida_de_byte = new ByteArrayOutputStream();
        PrintStream datos_en_pantalla = new PrintStream(salida_de_byte);
        System.setOut(datos_en_pantalla);
        //Llamar al metodo que estamos haciendo pruebas, si no solo estamos haciendo codigo sin sentido XD
        Prueba_unitaria variable = new Prueba_unitaria();
        variable.MetodoDeIngresoDeNombre();
        //Lectura de lineas que se imprimen en pantalla
        String[] lineas_en_pantalla = salida_de_byte.toString().split(System.lineSeparator());
        String linea_actual = lineas_en_pantalla[2];
        
        assertEquals(esperado, linea_actual);
        
        
    }
    
}
