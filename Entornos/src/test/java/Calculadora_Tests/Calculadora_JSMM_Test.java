
package Calculadora_Tests;

import Calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculadora_JSMM_Test {

    @Test
    public void testSuma (){

        Calculadora calculadora = new Calculadora(3,5);

        int valorEsperado = 8;
        int valorobtenido = calculadora.suma();

        assertEquals(valorEsperado,valorobtenido);

    }

    @Test
    public void testResta (){

        Calculadora calculadora =  new Calculadora(3,5);

        int valorEsperado = -2;
        int valorobtenido = calculadora.resta();

        assertEquals(valorEsperado,valorobtenido);

    }

    @Test
    public void testMultiplica (){

        Calculadora calculadora =  new Calculadora(3,5);

        int valorEsperado = 15;
        int valorobtenido = calculadora.multiplica();

        assertEquals(valorEsperado,valorobtenido);

    }

    @Test
    public void testDivide (){

        Calculadora calculadora =  new Calculadora(30,0);

        int valorEsperado = 5;
        int valorobtenido = calculadora.divide();

        assertEquals(valorEsperado,valorobtenido);

    }





}
