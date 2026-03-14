
package Calculadora_Tests;

import Calculadora.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.suite.api.Suite;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculadora_JSMM_Test {

    private Calculadora calculadora;

    @BeforeEach
    public void inicioPruebas(){

        calculadora = new Calculadora(30,10);

    }

    @AfterEach
    public void finPruebas(){

        calculadora = null;

    }

    @Test
    public void testSuma (){

        int valorEsperado = 40;
        int valorobtenido = calculadora.suma();

        assertEquals(valorEsperado,valorobtenido);

    }

    @Test
    public void testResta (){

        int valorEsperado = 20;
        int valorobtenido = calculadora.resta();

        assertEquals(valorEsperado,valorobtenido);

    }

    @Test
    public void testMultiplica (){

        int valorEsperado = 300;
        int valorobtenido = calculadora.multiplica();

        assertEquals(valorEsperado,valorobtenido);

    }

    @Test
    public void testDivide (){

        int valorEsperado = 3;
        int valorobtenido = calculadora.divide();

        assertEquals(valorEsperado,valorobtenido);

    }

    @Test
    public void testDivideExcepcion(){

        String valorEsperado = "División por 0";
        String valorDevuelto = "";

        try {

            calculadora.divide();

        }catch (ArithmeticException e){

            valorDevuelto = e.getMessage();

        }

        assertEquals(valorEsperado,valorDevuelto);

    }

    @ParameterizedTest
    @ValueSource(ints =  {1,2,3,4,5})
    public void testSumaConValueSource(int num){

        Calculadora calculadora_ValueSource = new Calculadora(num, 5);

        int valorEsperado = num + 5;
        int valorObtenido = calculadora_ValueSource.suma();

        assertEquals(valorEsperado,valorObtenido);

    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testRestaConValueSource (int num){

        Calculadora calculadora_ValueSource = new Calculadora(num, 5);

        int valorEsperado = num - 5;
        int valorObtenido = calculadora_ValueSource.resta();

        assertEquals(valorEsperado,valorObtenido);

    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testMultiplicacionConValueSource (int num){

        Calculadora calculadora_ValueSource = new Calculadora(num, 5);

        int valorEsperado = num * 5;
        int valorObtenido = calculadora_ValueSource.multiplica();

        assertEquals(valorEsperado,valorObtenido);

    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testDivideConValueSource (int num){

        Calculadora calculadora_ValueSource = new Calculadora(5,num );

        int valorEsperado = 5 / num;
        int valorObtenido = calculadora_ValueSource.divide();

        assertEquals(valorEsperado,valorObtenido);

    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, 1",
            "5, 4, 1",
            "-1, -2, 1",
            "0, 0, 0"
    })
    public void testRestaConCsvSource (int a, int b, int valorEsperado){

        Calculadora calculadora_CsvSource = new Calculadora(a,b);

        int valorDevuelto = calculadora_CsvSource.resta();

        assertEquals(valorEsperado,valorDevuelto);

    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 2",
            "4, 5, 20",
            "-1, -2, 2",
            "0, 0, 0"
    })
    public void testMultiplicacionConCsvSource (int a, int b, int valorEsperado){

        Calculadora calculadora_CsvSource = new Calculadora(a,b);

        int valorDevuelto = calculadora_CsvSource.multiplica();

        assertEquals(valorEsperado,valorDevuelto);

    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, 2",
            "20, 4, 5"
    })
    public void testDivideConCsvSource (int a, int b, int valorEsperado){

        Calculadora calculadora_CsvSource = new Calculadora(a,b);

        int valorDevuelto = calculadora_CsvSource.divide();

        assertEquals(valorEsperado,valorDevuelto);

    }

}


