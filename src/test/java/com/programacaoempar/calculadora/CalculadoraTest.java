package com.programacaoempar.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void calcula() throws Exception {
        Calculadora calculadora = new Calculadora();
        assertEquals("Operação não é válida", calculadora.calcula("10*10"));
    }


}
