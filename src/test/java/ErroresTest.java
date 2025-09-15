/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import static org.junit.jupiter.api.Assertions.*;
import Errores.Errores;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Edith Ramirez
 */
public class ErroresTest {
        @Test
    public void testErrorAbsoluto_CasoExacto() {
        double vr = 10.0;
        double va = 10.0;
        double esperado = 0.0;
        double resultado = Errores.errorAbsoluto(vr, va);
        assertEquals(esperado, resultado, 0.0001, "El error absoluto deberia ser 0");
    }

    @Test
    public void testErrorAbsoluto_CasoNormal() {
        double vr = 10.0;
        double va = 9.5;
        double esperado = 0.5;
        double resultado = Errores.errorAbsoluto(vr, va);
        assertEquals(esperado, resultado, 0.0001, "Error absoluto incorrecto");
    }

    @Test
    public void testErrorRelativo_CasoNormal() {
        double vr = 10.0;
        double va = 9.0;
        double esperado = 10.0; 
        double resultado = Errores.errorRelativo(vr, va);
        assertEquals(esperado, resultado, 0.0001, "Error relativo incorrecto");
    }

    @Test
    public void testErrorRelativo_CasoCeroError() {
        double vr = 25.0;
        double va = 25.0;
        double esperado = 0.0;
        double resultado = Errores.errorRelativo(vr, va);
        assertEquals(esperado, resultado, 0.0001, "El error relativo debería ser 0%");
    }

    @Test
    public void testErrorRelativo_ValoresNegativos() {
        double vr = -50.0;
        double va = -49.0;
        double esperado = 2.0; 
        double resultado = Errores.errorRelativo(vr, va);
        assertEquals(esperado, resultado, 0.0001, "El error relativo con negativos es incorrecto");
    }
}